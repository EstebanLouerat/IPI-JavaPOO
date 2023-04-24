package org.example.ExcercicesNotés.Banque;

public interface Service {
    public void transfererFonds(Compte compteSource, Compte compteDestination, double montant);
    public double calculerSoldeTotal(Client client);
}
