package fr.dawan.consolidation.genericite;

public class Product extends BaseDb implements Comparable<Product> {
    private long id;
    private String description;
    private double prix;

    public Product() {
        super(0L);
    }

    public Product(String description, double prix) {
        super(0L);
        this.description = description;
        this.prix = prix;
    }

    public Product(long id, String description, double prix) {
        super(id);
        this.description = description;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }

    @Override
    public int compareTo(Product Product) {
        if (description.compareTo(Product.getDescription()) == 0) {
            if (prix > Product.prix) {
                return 1;
            } else if (prix < Product.prix) {
                return -1;
            } else {
                return 0;
            }
        }
        return description.compareTo(Product.getDescription());
    }
}