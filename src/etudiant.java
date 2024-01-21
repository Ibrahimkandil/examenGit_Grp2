import java.util.Objects;

public class etudiant extends Personne{
    private String nom;
    private String prenom;
    private int age;
    private String classe;
    private String niveau;
    private String specialite;
    private String option;
    private String matricule;
    private String adresse;
    private String telephone;
    private String email;


    public etudiant(String nom, String prenom, int age, String classe, String niveau, String specialite, String option, String matricule, String adresse, String telephone, String email) {
        super(nom, prenom, age);
        this.classe = classe;
        this.niveau = niveau;
        this.specialite = specialite;
        this.option = option;
        this.matricule = matricule;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;

    }

    public String getClasse() {
        return classe;
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

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
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

    @Override
    public String toString() {
        return "etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", classe='" + classe + '\'' +
                ", niveau='" + niveau + '\'' +
                ", specialite='" + specialite + '\'' +
                ", option='" + option + '\'' +
                ", matricule='" + matricule + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        etudiant etudiant = (etudiant) o;
        return age == etudiant.age && Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom) && Objects.equals(classe, etudiant.classe) && Objects.equals(niveau, etudiant.niveau) && Objects.equals(specialite, etudiant.specialite) && Objects.equals(option, etudiant.option) && Objects.equals(matricule, etudiant.matricule) && Objects.equals(adresse, etudiant.adresse) && Objects.equals(telephone, etudiant.telephone) && Objects.equals(email, etudiant.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nom, prenom, age, classe, niveau, specialite, option, matricule, adresse, telephone, email);
    }
}
