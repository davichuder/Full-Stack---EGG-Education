// Se registrará una póliza, donde se guardará los datos tanto de un 
// vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de 
// póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
// asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra 
// terceros, etc.)
package ejercicio3extra.entidades;

import java.util.ArrayList;
import java.util.Calendar;

import ejercicio3extra.enums.FormaPago;
import ejercicio3extra.enums.TipoCobertura;

public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numero_poliza;
    private Calendar fecha_inicio;
    private Calendar fecha_fin;
    private int cantidad_cuotas;
    private ArrayList<Cuota> cuotas;
    private FormaPago forma_pago;
    private int monto_asegurado;
    private TipoCobertura tipo_cobertura;

    public Poliza(Vehiculo vehiculo, Cliente cliente, int numero_poliza, Calendar fecha_inicio, Calendar fecha_fin,
            int cantidad_cuotas, FormaPago forma_pago, int monto_asegurado, TipoCobertura tipo_cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numero_poliza = numero_poliza;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cantidad_cuotas = cantidad_cuotas;
        this.forma_pago = forma_pago;
        this.monto_asegurado = monto_asegurado;
        this.tipo_cobertura = tipo_cobertura;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero_poliza() {
        return this.numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public Calendar getFecha_inicio() {
        return this.fecha_inicio;
    }

    public void setFecha_inicio(Calendar fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Calendar getFecha_fin() {
        return this.fecha_fin;
    }

    public void setFecha_fin(Calendar fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getCantidad_cuotas() {
        return this.cantidad_cuotas;
    }

    public void setCantidad_cuotas(int cantidad_cuotas) {
        this.cantidad_cuotas = cantidad_cuotas;
    }

    public ArrayList<Cuota> getCuotas() {
        return this.cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public FormaPago getForma_pago() {
        return this.forma_pago;
    }

    public void setForma_pago(FormaPago forma_pago) {
        this.forma_pago = forma_pago;
    }

    public int getMonto_asegurado() {
        return this.monto_asegurado;
    }

    public void setMonto_asegurado(int monto_asegurado) {
        this.monto_asegurado = monto_asegurado;
    }

    public TipoCobertura getTipo_cobertura() {
        return this.tipo_cobertura;
    }

    public void setTipo_cobertura(TipoCobertura tipo_cobertura) {
        this.tipo_cobertura = tipo_cobertura;
    }

    @Override
    public String toString() {
        return "{" +
                " vehiculo='" + getVehiculo() + "'" +
                ", cliente='" + getCliente() + "'" +
                ", numero_poliza='" + getNumero_poliza() + "'" +
                ", fecha_inicio='" + getFecha_inicio() + "'" +
                ", fecha_fin='" + getFecha_fin() + "'" +
                ", cantidad_cuotas='" + getCantidad_cuotas() + "'" +
                ", cuotas='" + getCuotas() + "'" +
                ", forma_pago='" + getForma_pago() + "'" +
                ", monto_asegurado='" + getMonto_asegurado() + "'" +
                ", tipo_cobertura='" + getTipo_cobertura() + "'" +
                "}";
    }
}
