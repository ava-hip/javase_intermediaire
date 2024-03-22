package fr.dawan.comportement.chainofresponsability;

public class App {
    public static void main(String[] args) {
        Professeur professeur = new Professeur("Onizuka", new DirecteurPedagogique("Gojo", new Directeur("Luffy", null)));

        // 1ere requete
        professeur.handleRequete(new Requete(1, RequeteType.DIRECTEUR_PEDAGOGIQUE, RequeteState.OPENED, "Requete un peu importante"));
        System.out.println("_________________________________");

        // 2eme requete
        professeur.handleRequete(new Requete(1, RequeteType.DIRECTEUR, RequeteState.OPENED, "Requete ultra importante"));
        System.out.println("_________________________________");

        // 3eme requete
        professeur.handleRequete(new Requete(1, RequeteType.PROFESSEUR, RequeteState.OPENED, "Requete osef"));
        System.out.println("_________________________________");
    }
}
