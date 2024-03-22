package fr.dawan.structure.decorator.atelier;

public abstract class CostumeDecorator implements Costume{
    protected Costume costume;

    public CostumeDecorator(Costume costume) {
        this.costume = costume;
    }

    @Override
    public String toString() {
        return "CostumeDecorator{" +
                "costume=" + costume +
                '}';
    }
}
