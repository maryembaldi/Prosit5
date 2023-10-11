package GestionEmplyees;

public class Vendeur extends Employe {


    protected float tauxDeVente;

    public Vendeur(int id, String nom, String adress, int nbr_heures, int num, float taux){
        super(id, nom, adress, nbr_heures);
        tauxDeVente = taux;
    }


    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }

    public float calculersalaire() {
        return 450 * tauxDeVente;
    }

}
