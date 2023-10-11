import Entite.Produit;
import GestionEmplyees.Caissier;
import GestionEmplyees.Responsable;
import GestionEmplyees.Vendeur;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit();

//le constructeur implicite initiale le produit comme null expl produit 1
        System.out.println("identifiant :" + p1.identifiant);
        System.out.println("marque :" + p1.marque);
        System.out.println("libelle :" + p1.libelle);
        System.out.println("prix :" + p1.prix);

        Produit p2 = new Produit(1024, "Delice", "Lait");
        System.out.println("Entite.Produit 2");
        System.out.println("identifiant :" + p2.identifiant);
        System.out.println("marque :" + p2.marque);
        System.out.println("libelle :" + p2.libelle);
        System.out.println("prix :" + p2.prix);

        Produit p3 = new Produit(2510, "Vitalait", "Yaourt");
        System.out.println("Entite.Produit 3");
        System.out.println("identifiant :" + p3.identifiant);
        System.out.println("marque :" + p3.marque);
        System.out.println("libelle :" + p3.libelle);
        System.out.println("prix :" + p3.prix);

        Produit p4 = new Produit(3250, "Sicam", "Tomate", 1.2f);
        System.out.println("Entite.Produit 4");
        System.out.println("identifiant :" + p4.identifiant);
        System.out.println("marque :" + p4.marque);
        System.out.println("libelle :" + p4.libelle);
        System.out.println("prix :" + p4.prix);

        System.out.println("Affichage avec la methode afficher :");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();

        //changer la marque de p1
        p1.marque = "Delice";
        System.out.println("Affichage avec la methode to String");
        System.out.println(p1.toString());
        //afficher p1 tt court
        System.out.println(p1);

        System.out.println(p2.toString());

        System.out.println(p2);

        Date d1 = new Date();
        p2.dateexp = d1;
        System.out.println("Affichage avec to String");
        System.out.println(p2.toString());
        System.out.println(p2);
        p2.afficher();
        Produit p5 = new Produit(12, "delic", d1);
        System.out.println(p5);

        Magasin m1 = new Magasin();
        Magasin m2 = new Magasin(1, "tunis");
        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        System.out.println("Afficher Magasin et ses produits");
        m1.afficher();

        System.out.println("Nombre de produits dans magasin 1 : " + m1.comprod);
        System.out.println("Nombre de produits dans magasin 2 : " + m2.comprod);

        Magasin magasinAvecPlusDeProduits = new Magasin();
        magasinAvecPlusDeProduits.trouveMagasin(m1, m2);

        if (magasinAvecPlusDeProduits != null) {
            System.out.println("Le magasin avec le plus de produits est : Magasin " + magasinAvecPlusDeProduits.identifiant);
        } else {
            System.out.println("Les deux magasins ont le même nombre de produits.");
        }

        Magasin Carrefour = new Magasin(1, "Centre Ville");
        Magasin Monoprix = new Magasin(2, "Menzah 6");

        Caissier caissier1 = new Caissier(1, "Maryem", "Mourouj", 150, 24);
        Caissier caissier2 = new Caissier(2, "Fatma", "Marsa", 80, 25);
        Caissier caissier3 = new Caissier(3, "bayrem", "Charguia", 85, 30);

        Responsable responsable1 = new Responsable(8, "ahmed", "Sousse", 110, 500, 155.f);
        Responsable responsable2 = new Responsable(6, "Ali", "Tunis", 126, 230, 185.f);

        Vendeur vendeur1 = new Vendeur(7, "Rami", "Carthage", 250, 9, 2);
        Vendeur vendeur2 = new Vendeur(10, "Yessin", "Hammem Chat", 130, 3, 5);
        Vendeur vendeur3 = new Vendeur(9, "Rahma", "Hammem Chat", 138, 12, 5);
        Vendeur vendeur4 = new Vendeur(74, "nour", "Hammem Chat", 18, 32, 15);

        Carrefour.ajouterEmploye(caissier1);
        Carrefour.ajouterEmploye(caissier2);
        Carrefour.ajouterEmploye(responsable1);
        Carrefour.ajouterEmploye(responsable2);
        Carrefour.ajouterEmploye(vendeur1);

        Monoprix.ajouterEmploye(caissier3);
        Monoprix.ajouterEmploye(vendeur2);
        Monoprix.ajouterEmploye(vendeur3);
        Monoprix.ajouterEmploye(vendeur4);

        Produit p8 = new Produit(350, "Sicam", "Hrissa", 1.5f);
        Produit p9 = new Produit(3280, "Bhar", "Thon", 1.963f);
        Produit p10 = new Produit(30, "Delice", "Jus", 3.5f);

        Carrefour.ajouterProduit(p8);
        Monoprix.ajouterProduit(p9);
        Monoprix.ajouterProduit(p10);

        System.out.println("Monoprix Magasin");
        Monoprix.afficher();

        System.out.println("Carrefour Magasin");
        Carrefour.afficher();
        Carrefour.afficherSalaire();
        Carrefour.affichePrimeResponsable();
        Carrefour.afficheNombreEmployesParType();

        responsable2.equals(responsable1);




    }
}