package fr.dawan.structure.decorator.atelier;

public class Lunette extends CostumeDecorator{

    public Lunette(Costume costume) {
        super(costume);
        System.out.println("ajout de lunette");
    }

    @Override
    public String getDescription() {
        return costume.getDescription() + ", " + "lunettes";
    }

    @Override
    public double getPrix() {
        return costume.getPrix()+35.0;
    }
}
