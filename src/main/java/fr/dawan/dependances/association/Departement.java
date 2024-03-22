package fr.dawan.dependances.association;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    public String name;
    private List<Pirate> pirates = new ArrayList<>();

    public Departement(String name) {
        this.name = name;
    }

    public void addPirate(Pirate pirate) {
        pirates.add(pirate);
    }

    @Override
    public String toString() {
        return pirates.stream().map(e -> e.toString())
                .reduce("Equipage: " + name + "\n", (a, b) -> a + b + "\n");
    }
}
