package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	
	private final String base="Tienda";
	private final String user="root";
	private final String password="";
	private final String url="jdbc:mysql:/localhost_3306"+base;
	private Connection con= null;
	
	public Connection getConexion () {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
			
	    //eso no se si va, me daba error	    
			
		} catch (SQLException | ClassNotFoundException e) {

			System.err.println(e);	
			
		}
		return con;
		
		
	}
	
	

}
