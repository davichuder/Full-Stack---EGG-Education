package entidades;

public class Repulsor {
    //Parametros
    public boolean dañado = false;
    public int consumo_base = 10;

    //Getters
    public boolean isDañado() {
        return dañado;
    }

    //Constructor por defecto
    public Repulsor(){}

    //Metodo dañar
    public void dañar() {
        if (Math.random() < 0.3) {
            dañado = true;
            System.out.println("El repulsor se ha dañado");
        }
    }

    //Metodo reparar
    public void reparar() {
        if (Math.random() < 0.4) {
            dañado = false;
            System.out.println("El repulsor se ha reparado");
        }
    }

    //Metodo volar
    public int volar(int tiempo) {
        dañar();
        return 2 * consumo_base * tiempo;     
    }
    
}
