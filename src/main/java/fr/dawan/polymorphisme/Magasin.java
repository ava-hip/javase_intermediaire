package fr.dawan.polymorphisme;

public class Magasin {

    // Polymorphisme ad-hoc
    public static void acheter(Object p) {
        if(p instanceof Pliable pli) { // Java 17 pas de cast
            System.out.println(pli);
        }
    }

    // Polymorphisme par sous-typage
    public static void acheter(Pliable p) {
        System.out.println(p);
    }

    // Polymorphisme par type paramètrique (avec contrainte sur le type)
    public static <T extends Pliable> void acheterGenerique(T p) {
        System.out.println(p);
    }
}
