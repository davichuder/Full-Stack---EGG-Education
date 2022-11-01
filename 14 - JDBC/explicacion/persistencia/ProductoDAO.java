package explicacion.persistencia;

import explicacion.entidades.Producto;

public final class ProductoDAO extends DAO {
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo;
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

    // public void guardarUsuario(Usuario usuario) throws Exception {
    // try {
    // if (usuario == null) {
    // throw new Exception("Debe indicar el usuario");
    // }

    // String sql = "INSERT INTO Usuario (correoElectronico, clave)"
    // + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" +
    // usuario.getClave() + "' );";

    // insertarModificarEliminar(sql);
    // } catch (Exception e) {
    // throw e;
    // } finally {
    // desconectarBase();
    // }
    // }

    // public void modificarUsuario(Usuario usuario) throws Exception {
    // try {
    // if (usuario == null) {
    // throw new Exception("Debe indicar el usuario que desea modificar");
    // }

    // String sql = "UPDATE Usuario SET "
    // + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" +
    // usuario.getCorreoElectronico() + "'";

    // insertarModificarEliminar(sql);
    // } catch (Exception e) {
    // throw e;
    // } finally {
    // desconectarBase();
    // }
    // }

    // public void eliminarUsuario(String correEletronico) throws Exception {
    // try {

    // String sql = "DELETE FROM Usuario WHERE correoElectronico = '" +
    // correEletronico + "'";

    // insertarModificarEliminar(sql);
    // } catch (Exception e) {
    // throw e;
    // } finally {
    // desconectarBase();
    // }
    // }

    // public Collection<Usuario> listarUsuarios() throws Exception {
    // try {
    // String sql = "SELECT correoElectronico, clave FROM Usuario ";

    // consultarBase(sql);

    // Usuario usuario = null;
    // Collection<Usuario> usuarios = new ArrayList();
    // while (resultado.next()) {
    // usuario = new Usuario();
    // usuario.setCorreoElectronico(resultado.getString(1));
    // usuario.setClave(resultado.getString(2));
    // usuarios.add(usuario);
    // }
    // desconectarBase();
    // return usuarios;
    // } catch (Exception e) {
    // e.printStackTrace();
    // desconectarBase();
    // throw new Exception("Error de sistema");
    // }
    // }
}
