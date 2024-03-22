package fr.dawan.structure.decorator;

public class VoitureSportDecorator extends VoitureDecorator{

    public VoitureSportDecorator(Voiture voiture) {
        super(voiture);
    }

    @Override
    public void assembler() {
        super.assembler();
        System.out.println("-- ajouter les options sports");
    }
}
