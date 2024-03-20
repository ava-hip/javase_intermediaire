package fr.dawan.consolidation.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        // Création d'optional
        Optional<String> optVide = Optional.empty();
        Optional<String> opt1 = Optional.of("Hello");
        Optional<String> optVide2 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.ofNullable("World");

        // Tester le contenu
//      System.out.println(optVide.isEmpty()); // true
        System.out.println(optVide.isPresent()); // false
//      System.out.println(opt1.isEmpty()); // false
        System.out.println(opt1.isPresent()); // true

        System.out.println(opt1.get());
//      System.out.println(optVide.get()); // -> exception
        if (optVide.isPresent()) {
            System.out.println(optVide.get()); // -> exception
        }

        // ifPresent -> comsumer
        opt1.ifPresent(s -> System.out.println(s));
        opt1.ifPresent(System.out::println);

        // orElse valeut par défaut
        System.out.println(optVide.orElse("La chaine est vide"));
        System.out.println(optVide.orElseGet(() -> "C'est vide"));

        try {
            System.out.println(optVide.orElseThrow(Exception::new));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
