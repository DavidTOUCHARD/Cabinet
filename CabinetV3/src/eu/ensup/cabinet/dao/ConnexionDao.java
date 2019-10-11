package eu.ensup.cabinet.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author David
 *
 */
public class ConnexionDao {

	private static Statement statement;

	public Statement connection() throws SQLException { // connexion a la bdd
		java.sql.Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost/cabinet?user=root&password=");
			ConnexionDao.statement = conn.createStatement();

		} catch (ClassNotFoundException e) {

			System.out.println("Connextion avec la base de données impossible");
		}
		return ConnexionDao.statement;
	}

	public void deconnection() {
		try {
			// cnx.close();
			// stat.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
}