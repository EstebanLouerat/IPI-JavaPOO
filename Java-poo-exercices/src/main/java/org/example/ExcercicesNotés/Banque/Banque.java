package org.example.ExcercicesNotés.Banque;

import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nom;
    private List<Client> clients;

    public Banque(String nom) {
        this.nom = nom;
        clients = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void supprimerClient(Client client) {
        clients.remove(client);
    }

    public void effectuerDepot(Client client, double montant, Compte compte) {
        client.effectuerDepot(montant, compte);
    }
    public void effectuerDepot(Client client, double montant, String numeroCompte) {
        client.effectuerDepot(montant, numeroCompte);
    }

    public void effectuerRetrait(Client client, double montant, Compte compte) {
        client.effectuerRetrait(montant, compte);
    }

    public void effectuerRetrait(Client client, double montant, String numeroCompte) {
        client.effectuerRetrait(montant, numeroCompte);
    }

    public void afficherInformationsClients() {
        for (Client client : clients) {
            System.out.println(client.getNom() + " " + client.getPrenom() + ", " + client.getAdresse());
            System.out.println("Comptes: ");
            for (Compte compte : client.getComptes()) {
                System.out.println("\tNuméro de compte: " + compte.getNumeroCompte());
                System.out.println("\t\tSolde: " + compte.getSolde());
            }

        }
    }
}
