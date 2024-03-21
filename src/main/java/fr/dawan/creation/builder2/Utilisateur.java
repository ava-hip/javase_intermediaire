package fr.dawan.creation.builder2;

public class Utilisateur {
    private String prenom; // obligatoire
    private String nom; // obligatoire
    private int age; // le reste des attributs est optionnel
    private String email;
    private String tel;
    private String adresse;

    private Utilisateur() {
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public static class UtilisateurBuilder {
        private Utilisateur utilisateur;
        public UtilisateurBuilder(String prenom, String nom) {
            utilisateur = new Utilisateur();
            utilisateur.prenom = prenom;
            utilisateur.nom = nom;
        }

        public UtilisateurBuilder age(int age) {
            utilisateur.age = age;
            return this;
        }

        public UtilisateurBuilder email(String email) {
            utilisateur.email = email;
            return this;
        }

        public UtilisateurBuilder tel(String tel) {
            utilisateur.tel = tel;
            return this;
        }
        public UtilisateurBuilder adresse(String adresse) {
            utilisateur.adresse = adresse;
            return this;
        }

        public Utilisateur build() {

            return utilisateur;
        }

    }
}
