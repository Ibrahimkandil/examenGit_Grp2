public class classs {
    enseignat enseignat;
    etudiant[] etudiants;
    private int nbreEtudiant;
    private long id_class;
    public classs(enseignat enseignat, etudiant[] etudiant, int nbreEtudiant, long id_class) {
        this.enseignat = enseignat;
        this.etudiants = etudiant;
        this.nbreEtudiant = nbreEtudiant;
        this.id_class = id_class;
    }

    public enseignat getEnseignat() {
        return enseignat;
    }

    public void setEnseignat(enseignat enseignat) {
        this.enseignat = enseignat;
    }

    public etudiant[] getEtudiant() {
        return etudiants;
    }

    public void setEtudiant(etudiant[] etudiant) {
        this.etudiants = etudiant;
    }

    public int getNbreEtudiant() {
        return nbreEtudiant;
    }

    public void setNbreEtudiant(int nbreEtudiant) {
        this.nbreEtudiant = nbreEtudiant;
    }

    public long getId_class() {
        return id_class;
    }

    public void setId_class(long id_class) {
        this.id_class = id_class;
    }

    //méthode etudier ajouter un etudiant dans la list des etudiants?
    public void etudier(etudiant etudiant){
        if(nbreEtudiant<etudiants.length){
            etudiants[nbreEtudiant]=etudiant;
            nbreEtudiant++;
        }
    }
}


