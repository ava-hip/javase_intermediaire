package fr.dawan.creation.builder2;

public class App {
    public static void main(String[] args) {
        Utilisateur utilisateur1 = new Utilisateur.UtilisateurBuilder("Monkey D.", "Luffy").build();
        System.out.println(utilisateur1);

        Utilisateur utilisateur2 = new Utilisateur.UtilisateurBuilder("Roronoa", "Zoro").age(20)
                .adresse("East Blue").build();
        System.out.println(utilisateur2);
    }
}
