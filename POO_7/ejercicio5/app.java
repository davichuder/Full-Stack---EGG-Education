/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son:  
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
b) Agregar los métodos getters y setters correspondientes  
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a  ingresar 
y se la sumara a saldo actual. 
e) Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0.  
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%. 
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.  
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
package POO_7.ejercicio5;

import POO_7.ejercicio5.entidades.Cuenta;
import POO_7.ejercicio5.servicios.CuentaServicio;

public class app {
    
    public static void main(String[] args) {
        //Creo servicios de la cuenta
        CuentaServicio servicioCuenta = new CuentaServicio();
        //Creo objeto cuenta
        Cuenta cuenta = servicioCuenta.crearCuenta();
        //Ingreso dinero a la cuenta
        cuenta.ingresarDinero(1000);
        //Retiro dinero de la cuenta
        cuenta.retirarDinero(50);
        //Realizo una extraccionRapida
        cuenta.extraccionRapida();
        //Consulto el saldo de la cuenta
        cuenta.consultarSaldo();
        //Consulto datos de la cuenta
        cuenta.consultarDatos();    
    }
    
}
