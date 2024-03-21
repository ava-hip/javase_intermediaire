package fr.dawan.creation.builder;

public class Pizza {
    private String pate;
    private String base;
    private String garniture;

    public Pizza() {
    }

    public String getPate() {
        return pate;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getGarniture() {
        return garniture;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public Pizza(String pate, String base, String garniture) {
        this.pate = pate;
        this.base = base;
        this.garniture = garniture;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pate='" + pate + '\'' +
                ", base='" + base + '\'' +
                ", garniture='" + garniture + '\'' +
                '}';
    }
}
