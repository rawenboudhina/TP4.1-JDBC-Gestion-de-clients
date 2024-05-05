package JDBC.main;

import java.sql.Connection;

import JDBCProjet.beans.Client;
import JDBCProjet.connexion.Connexion;

public class Main {
	public static void main(String[] args) {
		Connexion.getConnection();
		Client client = new Client();
        client.setNom("asma");
        client.setPrenom("rawen");
      
}
}