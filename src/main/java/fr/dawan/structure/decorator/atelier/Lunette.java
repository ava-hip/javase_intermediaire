package fr.dawan.structure.decorator.atelier;

public class Lunette extends CostumeDecorator{

    public Lunette(Costume costume) {
        super(costume);
        System.out.println("ajout de lunette");
    }

    @Override
    public String getDescription() {
        return costume.getDescription();
    }

    @Override
    public double getPrix() {
        return 0;
    }
}
