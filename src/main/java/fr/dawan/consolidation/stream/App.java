package fr.dawan.consolidation.stream;


import fr.dawan.consolidation.exercices.Check;
import fr.dawan.consolidation.genericite.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        //1. Une classe qui implement l'interface
        Operation op1 = new Somme();
        System.out.println(traitement(1, 2, op1));

        //2. Une classe anonyme
        System.out.println(traitement(1, 2, new Operation() {
            @Override
            public int calcul(int a, int b) {
                return a + b;
            }
        }));

        // 3. Avec Java 8 les expressions lambdas
        System.out.println(traitement(1,2, (int a, int b) -> {return a + b;}));

        // Le type des paramètres est déduit à partir des paramètres de l'interface
        // Plusieurs paramètres (v1, valeur, e) -> ...
        // 1 paramètre : a -> ...
        // pas de paramètre () -> ...
        System.out.println(traitement(1,2,(a, b) -> {return a + b;}));

        // Corps de méthode
        // Plusieurs lignes () -> { ;}
        // Une seule ligne
        System.out.println(traitement(1,2,(a, b) -> a + b));

        System.out.println(traitement(4,2,(v1,v2) -> v1 * v2));
        System.out.println(traitement(4,2,(v1,v2) -> v1 - v2));

        Operation op = (v1,v2) -> v1 * v2;

        // Exercice stream + lambda
        Check c = s -> {
            String tmp = s.trim().toLowerCase();
            return tmp.equals(new StringBuilder(tmp).reverse().toString());
        };

        check("radar", c);
        check("bonjour", c);

        List<String> lstStr = Arrays.asList("Azerty", "aaa", "test");
        lstStr.sort( (s1, s2) -> s1.compareTo(s2));
        System.out.println(lstStr);

        String ctx = "-";
        Arrays.asList("ddd", "oui", "non", "bbb").forEach(s -> System.out.print(s+ctx));
        System.out.println();

        // Interface fonctionnelle
//        verifInterF("sos", s -> {
//            String tmp = s.trim().toLowerCase();
//            return tmp.equals(new StringBuilder(tmp).reverse().toString());
//        });

        List<Integer> lst = Arrays.asList(5,4,3,2,1);
        lst.sort((a, b) -> a > b ?1 : -1);
        System.out.println(lst);


        // Référence de méthode
        // Référence de méthode statique
        // Avec une expression lambda
        Message msg1 = () -> afficherMessage();
        msg1.afficher();

        // Avec une référence de méthode : nom_class::nom_static_method
        Message msg2 = App::afficherMessage;
        msg2.afficher();

        // Référence de méthode d'instance
        ShowMessage obj = new ShowMessage();
        // Avec une expression lambda
        Message msg3 = () -> obj.afficherMessage();
        msg3.afficher();

        // Référence de méthode : nom_objet::nom_method
        Message msg4 = obj::afficherMessage;
        msg4.afficher();

        // Référence de méthode constructeur
        Supplier<ShowMessage> ms5 = () -> new ShowMessage();
        System.out.println(ms5.get());
        // Référence de méthode: nom_class::new
        Supplier<ShowMessage> msg6 = ShowMessage::new;
        System.out.println(msg6.get());

        // Méthode forEach
        List<String> lstPrenom = Arrays.asList("Mat", "Yo", "Max", "Pablito", "Hip");

        // Méthode 1
        for(String p : lstPrenom) {
            System.out.println(p.toUpperCase());
        }
        // Méthode 2
        lstPrenom.forEach(prenom -> System.out.println(prenom.toUpperCase()));
        // Méthode 3
        lstPrenom.forEach(System.out::println);

        /*
         * Stream
         */

        List<Integer> lstInt = Arrays.asList(4, 23, -5, 0, 15);
        lstInt.stream().map(x -> x * 2).filter(x -> x >=0 && x <= 10).sorted()
                .forEach(System.out::println);

        lstInt.stream().distinct().skip(3).forEach(System.out::println);

        System.out.println("count" + lstInt.stream().map(x -> x * 2).filter(x -> x > 0).sorted()
                .collect(Collectors.counting()));
        List<Integer> lstRes = lstInt.stream().distinct().map(x -> x * 2).filter(x -> x >=0 && x <= 10).sorted()
                .collect(Collectors.toList());

        // lstRes = lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().toList(); // List immuable
        // System.out.println(lstRes);

        int somme = lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().reduce(0, (a, b) -> a + b);
        System.out.println(somme);

        System.out.println(lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().findFirst().get());
        System.out.println(lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().anyMatch(i -> i > 10)); // true
        System.out.println(lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().anyMatch(i -> i > 20)); // false

        System.out.println(lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().allMatch(i -> i > 10)); // false
        System.out.println(lstInt.stream().distinct().map(x -> x * 2).filter(f -> f > 0).sorted().allMatch(i -> i > 1));  // true

        List<Product> lstProd = new ArrayList<>();
        lstProd.add(new Product("Livre java", 5.0));
        lstProd.add(new Product("Livre HP Lovecraft", 7.0));
        lstProd.add(new Product("stylo", 1.2));
        lstProd.add(new Product("Souris", 25.0));
        lstProd.add(new Product("Clavier", 45.0));
        lstProd.add(new Product("Ecran", 250.0));

//        System.out.println(lstProd.stream().filter(p -> p.getPrix() <= 40.0 && p.getDescription().startsWith("Livre"))
//                .sorted().toList());
        System.out.println(lstProd.stream().filter(p -> !p.getDescription().startsWith("Livre")).map(p -> p.getPrix())
                .reduce(0.0, (v1, v2) -> v1 + v2));

        /**********************
         * Exercices Stream   *
         **********************/
        List<String> mots = Arrays.asList("Bonjour","java","c++","hello","world","c#","c","html");
        List<Integer> notes = Arrays.asList(6,14,10,12);

        System.out.println(notes.stream().collect(Collectors.averagingDouble(n -> n)));
        System.out.println(mots.stream().filter(m -> m.length()%2 == 0).count());
        System.out.println(mots.stream().filter(m -> m.charAt(0) < 'i').sorted().reduce((a, b) -> a + " " + b).get());
        mots.stream().sorted((m1, m2) -> m1.length() > m2.length() ? 1 : -1).limit(3).forEach(System.out::println);
        System.out.println(factoriel(4));

    }

    public static int traitement(int i1, int i2, Operation op) {
        return op.calcul(i1, i2);
    }

    public static void check(String str, Check c) {
        if (c.check(str)) {
            System.out.println("ok");
        }
    }

    public static void afficherMessage() {
        System.out.println("Référence de méthode statique");
    }

    public static int factoriel(int n) {
        if(n < 1) {
            return 1;
        }
        return Stream.iterate(1, i -> i+1).limit(n).reduce(1, (a, b) -> a * b);
    }
}