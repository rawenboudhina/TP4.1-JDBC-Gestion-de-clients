package JDBC.main;

import java.sql.Connection;
import java.util.List;

import JDBCProject.dao.ClientService;
import JDBCProjet.beans.Client;
import JDBCProjet.connexion.Connexion;

public class Main {
	public static void main(String[] args) {
		ClientService clientService = new ClientService();
        Client client = new Client("Boudhina", "Rawen");

        // Test de la création 
        if (clientService.create(client)) {
            System.out.println("Client créé avec succès !");
        } else {
            System.out.println("Erreur lors de la création du client.");
        }

        // Récupération de tous les clients
        List<Client> clients = clientService.findAll();
        if (clients != null) {
            System.out.println("Liste des clients : ");
            for (Client c : clients) {
                System.out.println(c);
            }
        } else {
            System.out.println("Erreur ");
        }

        // Suppression d'un client
        if (clientService.delete(client)) {
            System.out.println("Client supprimé avec succès !");
        } else {
            System.out.println("Erreur dans la suppression");
        }

        client = new Client("Asma", "Asma"); // Création d'un nouveau client
        client.setId(2); 
        if (clientService.update(client)) {
            System.out.println("Client mis à jour avec succès !");
        } else {
            System.out.println("Erreur lors de la mise à jour du client.");
        }
    }
      

}