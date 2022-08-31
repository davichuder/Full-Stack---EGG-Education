package video_sueldo;

import video_sueldo.servicios.ServicioVendedor;
import video_sueldo.entidades.Vendedor;

public class app {
    public static void main(String[] args) {
        // Creo variable de servicios de vendedor
        ServicioVendedor servicioVendedor = new ServicioVendedor();
        // Creo variable de vendedor
        Vendedor vendedor1 = servicioVendedor.altaVendedor();
        // Calculo sueldo mensual
        servicioVendedor.calcularSueldoMensual(vendedor1);
        // Calculo vacaciones
        servicioVendedor.calcularVacaciones(vendedor1);
    }
}
