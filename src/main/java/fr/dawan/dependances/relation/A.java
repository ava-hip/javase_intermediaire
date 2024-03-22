package fr.dawan.dependances.relation;

/*
Dépendance de type relation (Dépendance) :
   -> la plus faible dépendance entre objet
   -> existe seulement lors de l'execution
*/

public class A {
    public void methodParam(B b){
        b.methodB(); // limité à du code partagé
    }

    public B methodReturnA() {
        return new B();
    }
}
