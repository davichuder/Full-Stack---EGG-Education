package explicacion.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String USER = "root";
    private final String PASSWORD = "qwerty1241";
    private final String DATABASE = "tienda";

    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultado;

    protected void conectarDatabase() throws Exception {
        try {
            // Class.forName(DRIVER);
            String urlBaseDeDatos = URL + DATABASE;
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (SQLException e) {
            throw e;
        }
    }

    protected void desconectarDatabase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected void ejecutarUpdate(String sql) throws Exception {
        try {
            conectarDatabase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            // conexion.rollback();
            /*
             * Descomentar la linea anterior si desean tener en cuenta el rollback.
             * Correr el siguiente script en Workbench
             * 
             * SET autocommit=1;
             * COMMIT;
             ** 
             * Sin rollback igual anda
             */
            throw ex;
        } finally {
            desconectarDatabase();
        }
    }

    protected void ejecutarConsulta(String sql) throws Exception {
        try {
            conectarDatabase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
}