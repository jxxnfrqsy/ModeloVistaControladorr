package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxResultset;

public class ConsultaComputador extends Conexion {

	public Boolean registrar(Producto pro) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "INSERT INTO producto (codigo, referencia, marca, stock, precio) VALUES (?,?,?,?,?";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1,pro.getCodigo());
			ps.setString(2,pro.getReferencia());
			ps.setString(3,pro.getMarca());
			ps.setInt(4, pro.getStock());
			ps.setInt(4, pro.getStock());
			ps.setInt(5, pro.getPrecio());
			ps.execute();
			return true;	
			
			
		} catch (SQLException e) {
			
			System.err.println(e);
			return false;
			
		} finally {
			
			try {
				con.close();
				
			} catch (SQLException  e) {
				System.err.println(e);
			}
			
		}
		
		

	}
	
	public Boolean modificar(Producto pro) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "UPDATE producto SET codigo=?, referencia=?, marca=?, stock=?, precio=? WHERE id=?";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1,pro.getCodigo());
			ps.setString(2,pro.getReferencia());
			ps.setString(3,pro.getMarca());
			ps.setInt(4, pro.getStock());
			ps.setInt(4, pro.getStock());
			ps.setInt(5, pro.getPrecio());
			ps.setInt(6, pro.getId());
			ps.execute();
			return true;	
			
			
		} catch (SQLException e) {
			
			System.err.println(e);
			return false;
			
		} finally {
			
			try {
				con.close();
				
			} catch (SQLException  e) {
				System.err.println(e);
			}
			
		}
		

	}
	
	public Boolean eliminar (Producto pro) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "DELETE FROM Producto WHERE id=?";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getId());
			ps.execute();
			return true;	
			
			
		} catch (SQLException e) {
			
			System.err.println(e);
			return false;
			
		} finally {
			
			try {
				con.close();
				
			} catch (SQLException  e) {
				System.err.println(e);
			}
			
		}
		

	}
	
public Boolean buscar (Producto pro) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		Resultset rs = null;
		
		String sql = "SELECT * FROM Producto WHERE codigo=?";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1,pro.getCodigo());
			ps.executeQuery();
			
			if(((ResultSet) rs).next()) {
				
				pro.setId(Integer.parseInt(((ResultSet) rs).getString("id")));
				pro.setCodigo(((ResultSet) rs).getString("codigo"));
				pro.setReferencia(((ResultSet) rs).getString("referencia"));
				pro.setMarca(((ResultSet) rs).getString("marca"));
				pro.setStock(Integer.parseInt(((ResultSet) rs).getString("stock")));
				pro.setStock(Integer.parseInt(((ResultSet) rs).getString("precio")));
                return true;

				
			}
	
			return false;	
			
			
		} catch (SQLException e) {
			
			System.err.println(e);
			return false;
			
		} finally {
			
			try {
				con.close();
				
			} catch (SQLException  e) {
				System.err.println(e);
			}
			
		}
		

	}
}

