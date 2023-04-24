package org.example.ExcercicesNotés.Banque;

public abstract class Compte {
    private final String numeroCompte;
    private double solde;
    private double tauxInterets;

    public Compte(String numeroCompte, double solde, double tauxInterets) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.tauxInterets = tauxInterets;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public double getTauxInterets() {
        return tauxInterets;
    }


    public void retrait(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void depot(double montant) {
        solde += montant;
    }

    public abstract double calculerInterets();
}
