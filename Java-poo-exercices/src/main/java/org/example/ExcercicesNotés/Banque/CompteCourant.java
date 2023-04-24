package org.example.ExcercicesNotés.Banque;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, double tauxInterets,double decouvertAutorise) {
        super(numeroCompte, solde, tauxInterets);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public double calculerInterets() {
        double solde = getSolde();
        double taux = getTauxInterets();
        double decouvert = Math.max(0, -solde - decouvertAutorise); // calcul du découvert
        return (solde + decouvert) * taux;
    }
}
