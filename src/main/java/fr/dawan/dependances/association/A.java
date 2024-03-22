package fr.dawan.dependances.association;

/* Dépendance de type association (Association/Aggrégation)
 * -> s'étend sur toute la durée de vie d'un objet
 */
public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    // ...
}
