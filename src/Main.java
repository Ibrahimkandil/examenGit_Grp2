
public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne("Diallo", "Mamadou", 25);
        System.out.println("Nom: "+personne.getNom()+"\nPrenom: "+personne.getPrenom()+"\nAge: "+personne.getAge());
        System.out.println("--------------------------------------------------");
        etudiant etudiant1 = new etudiant("Jalouz", "Amira", 25,"GIT", "ALINFO1",  "Informatique", "Informatique", "233AFT0661", "ARIANA", "77-777-77-77", "" );
        etudiant etudiant2 = new etudiant("Kandil", "Ibrahim", 23,"GIT", "ALINFO1",  "Informatique", "Informatique", "233JMT5452", "Mourouj", "77-777-77-77", "" );
        etudiant etudiant3 = new etudiant("Ben Hammouda", "Mayssem", 23,"GIT", "ALINFO1",  "Informatique", "Informatique", "233AFT0661", "ARIANA", "77-777-77-77", "" );

        etudiant etudiant4 = new etudiant("Kouki", "Ahmed", 25, "GIT", "ALINFO1", "Informatique", "Informatique", "233AMT1188", "ARIANA", "77-777-77-77", "");



        //cree un object enseignet
        enseignat enseignat = new enseignat("Diallo", "Mamadou", 25, "GIT", "ALINFO1", "Informatique", "Informatique", "233AFT0661", "ARIANA", "77-777-77-77", "", "", "", "");

        classs GIT = new classs(enseignat, new etudiant[5], 5, 1);
        GIT.etudier(etudiant1);
        GIT.etudier(etudiant2);
        GIT.etudier(etudiant3);
        GIT.etudier(etudiant4);

        personne.toString();
        etudiant1.toString();
        }
}