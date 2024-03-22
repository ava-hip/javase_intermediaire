package fr.dawan.demeter.atelier;

import java.util.List;

public class Marchand {
    private List<Client> clients;
    private double sommeCollectee;

    public Marchand(List<Client> clients) {
        this.clients = clients;
    }

    public void collectePaiement() {
        double prix = 1;
        sommeCollectee = clients.stream()
                .map(c -> c.paiement(prix))
                .reduce(sommeCollectee, (a, b) -> a + b);
    }
}
