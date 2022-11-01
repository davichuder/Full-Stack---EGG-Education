package explicacion.servicios;

import explicacion.entidades.Producto;
import explicacion.persistencia.ProductoDAO;

public class ProductoServicio {
    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public Producto buscarProductoPorCodigo(String codigo) throws Exception {
        try {
            int numero;
            try {
                numero = Integer.parseInt(codigo);
            } catch (Exception e) {
                throw new Exception("No se ingreso un numero");
            }

            return dao.buscarProductoPorCodigo(numero);
        } catch (Exception e) {
            throw e;
        }
    }
}
