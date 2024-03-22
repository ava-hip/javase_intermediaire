package fr.dawan.structure.decorator.atelier;

public class Chapeau extends CostumeDecorator{
    public Chapeau(Costume costume) {
        super(costume);
        System.out.println("Ajout d'un chapeau");
    }

    @Override
    public String getDescription() {
        return costume.getDescription() + " , " + "chapeau";
    }

    @Override
    public double getPrix() {
        return costume.getPrix();
    }
}
