package jdbc_ejercicio1.persistencia;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;

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
            e.printStackTrace();
            throw e;
        }
    }

    public ArrayList<String> listarTodosNombresProductos() throws Exception {
        try {
            String sql = "SELECT DISTINCT nombre FROM producto";
            ejecutarConsulta(sql);
            ArrayList<String> nombres = new ArrayList<String>();
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre"));
            }
            desconectarDatabase();
            return nombres;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public HashMap<String, Double> listarTodosNombresPreciosProductos() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            ejecutarConsulta(sql);
            HashMap<String, Double> mapa = new HashMap<>();
            while (resultado.next()) {
                mapa.put(resultado.getString("nombre"), resultado.getDouble("precio"));
            }
            desconectarDatabase();
            return mapa;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public ArrayList<Producto> filtrarProductosEntrePrecios(int minimo, int maximo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN " + minimo + " AND " + maximo;
            ejecutarConsulta(sql);
            ArrayList<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                Integer codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                Double precio = resultado.getDouble("precio");
                Integer codigo_fabricante = resultado.getInt("codigo_fabricante");
                productos.add(new Producto(codigo, nombre, precio, codigo_fabricante));
            }
            desconectarDatabase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public ArrayList<Producto> listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Pórtatil%'";
            ejecutarConsulta(sql);
            ArrayList<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                Integer codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                Double precio = resultado.getDouble("precio");
                Integer codigo_fabricante = resultado.getInt("codigo_fabricante");
                productos.add(new Producto(codigo, nombre, precio, codigo_fabricante));
            }
            desconectarDatabase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public HashMap<String, Double> masBaratoNombrePrecioProducto() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio = (SELECT MIN(precio) FROM producto)";
            ejecutarConsulta(sql);
            HashMap<String, Double> mapa = new HashMap<>();
            while (resultado.next()) {
                mapa.put(resultado.getString("nombre"), resultado.getDouble("precio"));
            }
            desconectarDatabase();
            return mapa;
        } catch (Exception e) {
            e.printStackTrace();
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

    public void modificarProducto(int codigo_viejo, int codigo_nuevo, String nombre, double precio,
            int codigo_fabricante) throws Exception {
        try {
            conectarDatabase();
            String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, codigo_fabricante=? WHERE codigo=?";
            PreparedStatement sentencia2 = conexion.prepareStatement(sql);
            sentencia2.setInt(1, codigo_nuevo);
            sentencia2.setString(2, nombre);
            sentencia2.setDouble(3, precio);
            sentencia2.setInt(4, codigo_fabricante);
            sentencia2.setInt(5, codigo_viejo);
            sentencia2.executeUpdate();
            desconectarDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}