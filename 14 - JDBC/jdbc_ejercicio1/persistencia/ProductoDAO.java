package jdbc_ejercicio1.persistencia;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import jdbc_ejercicio1.entidades.Producto;

public class ProductoDAO extends DAO {
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + " LIMIT 1";
            ejecutarConsulta(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
            }
            desconectarDatabase();
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<String> todosNombresProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            ejecutarConsulta(sql);
            ArrayList<String> nombres = new ArrayList<String>();
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre"));
            }
            desconectarDatabase();
            return nombres;
        } catch (Exception e) {
            throw e;
        }
    }

    public void agregarProducto(int codigo, String nombre, double precio, int codigo_fabricante) throws Exception {
        try {
            conectarDatabase();
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES (?, ?, ?, ?)";
            PreparedStatement sentencia2 = conexion.prepareStatement(sql);
            sentencia2.setInt(1, codigo);
            sentencia2.setString(2, nombre);
            sentencia2.setDouble(3, precio);
            sentencia2.setInt(4, codigo_fabricante);
            sentencia2.executeUpdate();
            desconectarDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}