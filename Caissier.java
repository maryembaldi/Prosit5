package GestionEmplyees;

public class Caissier extends Employe {
    protected int numeroDeCaisse;

    public Caissier(int id, String nom, String adress, int nbr_heures, int num){
        super(id,nom, adress, nbr_heures);
        numeroDeCaisse = num;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }

    public float calculersalaire() {
        float salaire = getNbr_heures() * 5;
        if (getNbr_heures()> 180) {
            salaire += (getNbr_heures()- 180) * 7.5;
        }
        return salaire;
    }
}
