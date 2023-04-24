package org.example.ExcercicesNotés.Banque;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private List<Compte> comptes;

    public Client(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
    }

    public Client(String nom, String prenom, String adresse, Compte compteBancaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
        comptes.add(compteBancaire);
    }
    public Client(String nom, String prenom, String adresse, List<Compte> comptes) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.comptes = comptes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public void ajouterCompte(Compte compte) {
        this.comptes.add(compte);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void effectuerDepot(double montant, Compte compte) {
        for (Compte compteClient : comptes) {
            if (compte == compteClient) {
                compte.depot(montant);
            }
        }
        System.out.println("Dépot Impossible, ce compte n'appartiens pas à ce client");
    }

    public void effectuerDepot(double montant, String numeroCompte) {
        for (Compte compte : comptes) {
            if (numeroCompte == compte.getNumeroCompte()) {
                compte.depot(montant);
            }
        }
        System.out.println("Dépot Impossible, ce compte n'appartiens pas à ce client");
    }

    public void effectuerRetrait(double montant, Compte compte) {
        for (Compte compteClient : comptes) {
            if (compte == compteClient) {
                compte.retrait(montant);
            }
        }
        System.out.println("Retrait Impossible, ce compte n'appartiens pas à ce client");
    }

    public void effectuerRetrait(double montant, String numeroCompte) {
        for (Compte compte : comptes) {
            if (numeroCompte == compte.getNumeroCompte()) {
                compte.retrait(montant);
            }
        }
        System.out.println("Retrait Impossible, ce compte n'appartiens pas à ce client");
    }

    public List<Compte> getComptes() {
        return comptes;
    }
}
