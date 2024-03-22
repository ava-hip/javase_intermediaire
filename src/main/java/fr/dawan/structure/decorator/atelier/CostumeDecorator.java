package fr.dawan.structure.decorator.atelier;

public abstract class CostumeDecorator implements Costume{
    protected Costume costume;

    public CostumeDecorator(Costume costume) {
        this.costume = costume;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getDescription()).append(" - total = ").append(getPrix());
        return builder.toString();
    }
}
