package fr.dawan.comportement.chainofresponsability;

public class Requete {
    private int numeroEtudiant;
    private RequeteType type;
    private RequeteState state;
    private  String message;

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public RequeteType getType() {
        return type;
    }

    public void setType(RequeteType type) {
        this.type = type;
    }

    public RequeteState getState() {
        return state;
    }

    public void setState(RequeteState state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Requete(int numeroEtudiant, RequeteType type, RequeteState state, String message) {
        this.numeroEtudiant = numeroEtudiant;
        this.type = type;
        this.state = state;
        this.message = message;
    }
}
