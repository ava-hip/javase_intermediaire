package fr.dawan.structure.decorator;

public class VoitureDecorator implements Voiture{

    protected Voiture voiture;

    public VoitureDecorator(Voiture voiture) {
        this.voiture = voiture;
    }

    @Override
    public void assembler() {
        voiture.assembler();
    }
}
