package fr.dawan.structure.decorator;

public class VoitureSimple implements Voiture{
    @Override
    public void assembler() {
        System.out.println("Voiture simple");
    }
}
