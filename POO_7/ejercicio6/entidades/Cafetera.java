package POO_7.ejercicio6.entidades;

public class Cafetera {
    //Parametros
    //capacidadMaxima, cantidadActual
    private int capacidadMaxima;
    private int cantidadActual;

    //Getters y Setters
    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return this.cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Constructor por defecto
    public Cafetera(){}

    //Constructor completo
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //toString
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    //Funcion llenarCafetera
    public void llenarCafetera() {
        System.out.println("Se lleno la cafetera");
        this.cantidadActual = this.capacidadMaxima;
    }

    //Funcion servirTaza
    public void servirTaza() {
        System.out.println("Ingrese capacidad de la taza");
        int taza = Integer.parseInt(System.console().readLine());
        if(this.cantidadActual >= taza) {
            this.cantidadActual -= taza;
            System.out.println("Se sirvio la taza entera");
        } else {
            System.out.println("No alcanza para llenar la taza\nSe lleno la taza con "+this.cantidadActual+" de cafe");
            this.cantidadActual = 0;
        }
    }

    //Funcion vaciarCafetera
    public void vaciarCafetera() {
        System.out.println("Se vacio la cafetera");
        this.cantidadActual = 0;
    }

    //Agregar cafe
    public void agregarCafe(int cafe) {
        System.out.println("Se agregaron "+cafe+" de cafe");
        this.cantidadActual += cafe;
    }
}
