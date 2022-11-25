package jdbc_ejercicio1.persistencia;

import java.sql.PreparedStatement;

public class FabricanteDAO extends DAO {
    public void agregarFabricante(int codigo, String nombre) throws Exception {
        try {
            conectarDatabase();
            String sql = "INSERT INTO fabricante (codigo, nombre) VALUES (?, ?)";
            PreparedStatement sentencia2 = conexion.prepareStatement(sql);
            sentencia2.setInt(1, codigo);
            sentencia2.setString(2, nombre);
            sentencia2.executeUpdate();
            desconectarDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}