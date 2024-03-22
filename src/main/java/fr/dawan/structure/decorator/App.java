package fr.dawan.structure.decorator;

public class App {
    public static void main(String[] args) {
        Voiture clio = new VoitureSimple();
        clio.assembler();

        Voiture ferrari = new VoitureSportDecorator(new VoitureSimple());
        ferrari.assembler();

        Voiture bentley = new VoitureLuxeDecorator(new VoitureSimple());
        bentley.assembler();
    }
}
