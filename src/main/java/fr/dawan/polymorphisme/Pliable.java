package fr.dawan.polymorphisme;

public interface Pliable {
    default void plier() {
        System.out.println("plier ...");
    };
    void deplier();
}
