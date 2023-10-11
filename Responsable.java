package GestionEmplyees;

public class Responsable extends Employe {
    protected float prime;

    public Responsable (int id, String nom, String adress, int nbr_heures, int num, float prime){
        super(id, nom, adress, nbr_heures);
        this.prime=prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "prime=" + prime +
                '}';
    }
    public float calculersalaire() {
        double salaire = getNbr_heures() * 10;
        if (getNbr_heures() > 160) {
            salaire += (getNbr_heures() - 160) * 12;
        }
        return + prime;
    }
}
