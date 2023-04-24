package org.example.ExcercicesNotés.Banque;

public class ServiceBancaire implements Service {
    @Override
    public void transfererFonds(Compte compteSource, Compte compteDestination, double montant) {
        if (compteSource.getSolde() < montant) {
            System.out.println("Solde insuffisant.");
            return;
        }

        compteSource.retrait(montant);
        compteDestination.depot(montant);

        System.out.println("Transfert de " + montant + "€ effectué avec succès de " + compteSource.getNumeroCompte() + " à " + compteDestination.getNumeroCompte() + ".");
    }

    @Override
    public double calculerSoldeTotal(Client client) {
        double soldeTotal = 0.0;
        for (Compte compte : client.getComptes()) {
            soldeTotal += compte.getSolde();
        }
        return soldeTotal;
    }
}
