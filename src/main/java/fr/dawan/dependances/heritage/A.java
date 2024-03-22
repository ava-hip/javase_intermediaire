package fr.dawan.dependances.heritage;

/*
Dépendance d'héritage
    -> Lien de dépendance le plus important
    -> Tout changement sur la classe mère aura une incidence sur la classe fille
 */

public class A extends B{
    public A(int value) {
        super(value);
    }
}
