package ejercicio5.entidades;

public class Cuenta {
    // Parametros
    // numeroCuenta, dni, saldo
    private int numeroCuenta;
    private long dni;
    private int saldo;

    // Getters y setters
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor completo
    public Cuenta(int numeroCuenta, long dni, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    // toString
    @Override
    public String toString() {
        return "numeroCuenta: " + this.numeroCuenta + " dni: " + this.dni + " saldo: " + this.saldo;
    }

    // Metodo ingresarDinero
    public void ingresarDinero(int ingreso) {
        System.out.println("Se ingresaron " + ingreso + " a la cuenta");
        this.saldo += ingreso;
    }

    // Metodo retirarDinero
    public void retirarDinero(int retiro) {
        if (this.saldo >= retiro) {
            System.out.println("Se retiraron " + retiro + " de la cuenta");
            this.saldo -= retiro;
        } else {
            System.out.println("No se puede retirar esa cantidad");
            System.out.println("Se retiraron " + retiro + " de la cuenta");
            this.saldo = 0;
        }
    }

    // Metodo extraccionRapida
    public void extraccionRapida() {
        int extraccion = (int) (this.saldo * 0.2);
        System.out.println("Se extrajo " + extraccion + " de la cuenta");
        this.saldo -= extraccion;
    }

    // Metodo consultarSaldo
    public void consultarSaldo() {
        System.out.println("El saldo actual es " + this.saldo);
    }

    // Metodo consultarDatos
    public void consultarDatos() {
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo);
    }
}
