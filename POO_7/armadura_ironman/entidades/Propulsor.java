package entidades;

public class Propulsor {
    //Parametros
    public boolean dañado = false;
    public int consumo_base = 20;

    //Getters
    public boolean isDañado() {
        return dañado;
    }

    //Constructor por defecto
    public Propulsor(){}

    //Metodo dañar
    public void dañar() {
        if (Math.random() < 0.3) {
            dañado = true;
            System.out.println("El propulsor se ha dañado");
        }
    }

    //Metodo reparar
    public void reparar() {
        if (Math.random() < 0.4) {
            dañado = false;
            System.out.println("El propulsor se ha reparado");
        }
    }

    //Metodo caminar
    public int caminar(int tiempo) {
        dañar();
        return consumo_base * tiempo;     
    }

    //Metodo correr
    public int correr(int tiempo) {
        dañar();
        return 2 * consumo_base * tiempo;     
    }

    //Metodo propulsar
    public int propulsar(int tiempo) {
        dañar();
        return 3 * consumo_base * tiempo;     
    }

    //Metodo volar
    public int volar(int tiempo) {
        dañar();
        return 3 * consumo_base * tiempo;     
    }

}
