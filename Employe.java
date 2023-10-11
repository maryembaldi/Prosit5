package GestionEmplyees;
import java.util.Objects;

public abstract class Employe {

    protected int id;
    protected String nom;
    protected String adress;
    protected int nbr_heures;

    public Employe(){

    }
    public Employe(int nvid, String nvnom, String nvadress, int nbr){
        id= nvid;
        nom = nvnom;
        adress = nvadress;
        nbr_heures = nbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public void afficher()
    {
        System.out.println("Employé {" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adress='" + adress + '\'' +
                ", nombre d'heures=" + nbr_heures +
                '}');
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adress='" + adress + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }
    public abstract float calculersalaire();

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }
}
