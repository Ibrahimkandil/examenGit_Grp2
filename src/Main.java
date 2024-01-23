
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
        enseignat enseignat2 = new enseignat("sywar", "khmiri", 50, "git2", "ingenieur", "chimie", "science", "12645", "ARIANA", "586015695", "sywar.khmiri@gmail.com", "05-12-1966", "ariana", "tunisienne");
        classs GIT = new classs(enseignat, new etudiant[5], 5, 1);
        GIT.etudier(etudiant1);
        GIT.etudier(etudiant2);
        GIT.etudier(etudiant3);
        GIT.etudier(etudiant4);

        personne.toString();
        etudiant1.toString();
        enseignat.toString();
        enseignat2.toString();


        // Calling hashCode method
        int hashCode1 = enseignat.hashCode();
        int hashCode2 = enseignat2.hashCode();

        boolean areEqual = enseignat.equals(enseignat2);

        System.out.println("HashCode 1: " + hashCode1);
        System.out.println("HashCode 2: " + hashCode2);
        System.out.println("Are equal: " + areEqual);




        }
}