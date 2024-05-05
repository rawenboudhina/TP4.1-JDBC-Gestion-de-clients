package JDBCProjet.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	private static Connection cnn = null;

    public static Connection getConnection() {
    	if(cnn==null)
		{
			 try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demojdbc","root", "");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		return cnn;
    }}
	
    
