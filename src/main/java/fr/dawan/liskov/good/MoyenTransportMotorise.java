package fr.dawan.liskov.good;

public abstract class MoyenTransportMotorise extends MoyenTransport{
    private Moteur moteur;

    @Override
    public void déplacer() {
    moteur.demarrer();
    }
}
