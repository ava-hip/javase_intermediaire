package fr.dawan.dependances.composition;

/*
Dépendance de composition
    -> Un type B appartient à l'autre A
    -> A à la responsabilité de la création de B
 */

public class A {
    private B b;

    public A() {
        // A doit connaitre comment construire l'objet B
        b=new B("...");
    }

    public void methodeA() {
        b.methodeB();
    }
}
