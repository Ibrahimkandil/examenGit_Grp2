import java.util.Objects;

public class enseignat extends Personne {
    private String nom;
    private String prenom;
    private int age;

    private String matricule;
    private String adresse;
    private String telephone;
    private String email;
    private String dateNaissance;
    private String lieuNaissance;
    private String nationalite;

    public enseignat(String nom, String prenom, int age, String classe, String niveau, String specialite, String option, String matricule, String adresse, String telephone, String email, String dateNaissance, String lieuNaissance, String nationalite) {
        super(nom, prenom, age);
        this.matricule = matricule;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.nationalite = nationalite;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {
        return "enseignat{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", matricule='" + matricule + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", lieuNaissance='" + lieuNaissance + '\'' +
                ", nationalite='" + nationalite + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        enseignat enseignat = (enseignat) o;
        return age == enseignat.age && Objects.equals(nom, enseignat.nom) && Objects.equals(prenom, enseignat.prenom) && Objects.equals(matricule, enseignat.matricule) && Objects.equals(adresse, enseignat.adresse) && Objects.equals(telephone, enseignat.telephone) && Objects.equals(email, enseignat.email) && Objects.equals(dateNaissance, enseignat.dateNaissance) && Objects.equals(lieuNaissance, enseignat.lieuNaissance) && Objects.equals(nationalite, enseignat.nationalite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nom, prenom, age, matricule, adresse, telephone, email, dateNaissance, lieuNaissance, nationalite);
    }
}
