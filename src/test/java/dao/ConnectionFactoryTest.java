package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {

	public static void main(String[] args) {
		Connection con;
		try {
			con = ConnectionFactory.getConnection();
			System.out.println("Conexão aberta!");
	        con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
