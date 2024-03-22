package fr.dawan.structure.decorator;

public class VoitureLuxeDecorator extends VoitureDecorator{
    public VoitureLuxeDecorator(Voiture voiture) {
        super(voiture);
    }

    @Override
    public void assembler() {
        super.assembler();
        System.out.println("-- ajouter options luxe");
    }
}
