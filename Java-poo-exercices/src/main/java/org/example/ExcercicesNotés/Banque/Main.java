package org.example.ExcercicesNotés.Banque;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Louerat", "Esteban", "10 rue Louis Vitton, Lyon");

        CompteCourant compte1 = new CompteCourant("001", 1000, 1, 0);
        CompteCourant compte2 = new CompteCourant("002", 500, 25, 100);

        client1.ajouterCompte(compte1);
        client1.ajouterCompte(compte2);

        ServiceBancaire service = new ServiceBancaire();
        service.transfererFonds(compte1, compte2, 500);



        System.out.println("Solde compte1: " + compte1.getSolde());
        System.out.println("Solde compte2: " + compte2.getSolde());
        System.out.println("Solde totale: " + service.calculerSoldeTotal(client1));
    }
}
