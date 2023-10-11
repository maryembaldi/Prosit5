package Entite;

import java.util.Date;
public class Produit {

    public int identifiant;
    public  String libelle,marque;

    public float prix;
    public double quantite;


    public Date dateexp;
    public Produit(int id,String marque,String lb)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lb;
    }

    public Produit(int id,String marque,String lib,float prix)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
        this.prix=prix;
    }

    public Produit(int id,String marque,String lib,double quantite)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
        this.quantite=quantite;
    }

    public Produit(int id,String lib, float quantite)
    {
        identifiant=id;
        libelle=lib;
        this.prix=prix;
        this.quantite=quantite;
    }

    public Produit(){}

    public Produit(int id,String mar)
    {
        identifiant=id;
        marque=mar;
    }
    public Produit(int id,String mar,Date da)
    {
        identifiant=id;
        marque=mar;
        dateexp=da;
    }
    public Produit(String lib,int id){
        identifiant=id;
        libelle=lib;
    }


    public double getQuantite() {
        return quantite;
    }

    public void afficher()
    {
        System.out.println("L'indentifiant : "+identifiant+" /Marque : "+
                marque+" /Libelle : "+libelle+" /Quantité : "+quantite+" /Prix : "+prix);
    }

    public String toString()
    {

        return ("L'indentifiant :"+identifiant+" marque :"+
                marque+" libelle :"+libelle+" prix :"+prix+ "Quantité :"+quantite+" Date exp :"+dateexp);
    }

    public boolean comparer(Produit p) {
        return this.identifiant == p.identifiant &&
                this.libelle.equals(p.libelle) &&
                this.prix == p.prix;
    }

    public boolean comparer(Produit p1, Produit p2) {
        return p1.identifiant == p2.identifiant &&
                p1.libelle.equals(p2.libelle) && p1.prix == p2.prix;
    }




}