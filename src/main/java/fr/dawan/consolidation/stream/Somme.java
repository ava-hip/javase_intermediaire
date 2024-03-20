package fr.dawan.consolidation.stream;

public class Somme implements Operation{
    @Override
    public int calcul(int a, int b) {
        return a + b;
    }
}
