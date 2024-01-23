import java.util.Objects;

public class Personne {

    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne personne)) return false;
        return getAge() == personne.getAge() && Objects.equals(getNom(), personne.getNom()) && Objects.equals(getPrenom(), personne.getPrenom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), getAge());
    }
    public boolean estMajeur() {
        return age >= 18;
    }


    public void mettreAJourAge(int anneeDeNaissance) {
        // On suppose que l'année actuelle est 2024
        this.age = 2024 - anneeDeNaissance;
    }





}
