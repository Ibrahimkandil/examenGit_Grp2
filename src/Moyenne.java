public class Moyenne  implements Calc{

    int[] cc;
    int[] examen;
    String[] list;
    public Moyenne(classs c1) {
        int i =c1.getEtudiant().length;
        this.cc = new int[i];
        this.examen = new int[i];
        var etudiants = c1.getEtudiant();
        for(int j = 0; j < etudiants.length; j++){
            this.list[i] = etudiants[i].getNom();
        }

    }
    @Override
    public double calcule_Moyenne(double cc,double examen){

        return (cc*0.4 +examen*0.6);
    }
    public void ajouter_noteCC(int note1 ){
        for(int i = 0; i < this.cc.length; i++){
            if(this.cc[i] == -1){
                this.cc[i] = note1
                ;
                break;
            }
        }

    }
    public void ajouter_noteExamen(int examen1 ){
        for(int i = 0; i < this.examen.length; i++){
            if(this.examen[i] == -1){
                this.examen[i] = examen1
                ;
                break;
            }
        }

    }
    public  void note_etudiant(etudiant e){
        for(int i = 0; i < this.list.length; i++){
            if(this.list[i].equals(e.getNom())){

                 this.list[i]=this.list[i]+":"+this.calcule_Moyenne(cc[i],examen[i]);

            }
        }



    }
}
