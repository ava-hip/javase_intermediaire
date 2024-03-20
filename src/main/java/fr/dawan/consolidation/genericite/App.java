package fr.dawan.consolidation.genericite;

import fr.dawan.consolidation.exercices.ImportExportTool;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /*
         * Généricité
         */

        // Sur les classes :
        Box<String> box1 = new Box<>("Hello World;");
        System.out.println(box1.getContenu());

        Box<Integer> box2 = new Box<>(42);
        System.out.println(box2.getContenu());

        // Sur les méthodes :
        box1.afficherContenu("Contenu string = ");
        box2.afficherContenu("Contenu int = ");

        // Contrainte sur les types génériques

        Dao<Product> dao = new ProductDao();
        Product p1 = new Product("Stylo", 3.50);
        dao.insert(p1);
        List<Product> lst = dao.getAll();
        System.out.println(lst);

        // Instantiation d'un type générique
        try {
            String str = box1.create(String.class);

            Box<Product> bp = new Box<Product>(new Product("Stylo", 3.5));
            Product p2 = bp.create(Product.class);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Générique WildCard ?
        // type<?>
        List<String> lstR= Arrays.asList("hello","world","bonjour");
        // List<Object> lstA=lstR;

        List<?> lstA=lstR;
        //lstA.add("qwerty"); // erreur add à pour paramètre un type T :add(?)
        System.out.println(lstA.size());

        List<Integer> lstI=Arrays.asList(1,4,6,9);
        // List<? extends Number> lstN=lstR; // String n'hérite pas de Number
        List<? extends Number> lstN=lstI;

        List<BaseDb>lstB=Arrays.asList(new Product("tv",350.0));
        List<? super Product> lstP=lstB;
        System.out.println(lstP.size());

        try {
            ImportExportTool.toBin("p1.bin", p1);
            Product p2 = ImportExportTool.fromBin("p1.bin");
            System.out.println(p2);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T create(Class<T> clazz) throws Exception {
        // return clazz.newInstance(); // deprecated depuis java 9
        return clazz.getDeclaredConstructor().newInstance();
    }
}
