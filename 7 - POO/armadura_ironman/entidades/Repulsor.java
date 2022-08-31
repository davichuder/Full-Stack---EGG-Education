package armadura_ironman.entidades;

public class Repulsor {
    // Parametros
    public String posicion;
    public int consumo_base = 10000;
    public String estado = "sano";
    public int daño = 2500;

    // Metodo dañarRepulsor
    public void dañarRepulsor(Consola consola) {
        if ((this.estado.equals("sano")) && (Math.random() <= 0.3)) {
            consola.mensajes("repulsor recien dañado", this.posicion);
            this.estado = "dañado";
        }
    }

    // Metodo verificarRepulsor
    public void verificarRepulsor(Consola consola) {
        if (this.estado.equals("destruido")) {
            consola.mensajes("repulsor destruido", this.posicion);
        } else if (this.estado.equals("dañado")) {
            consola.mensajes("repulsor dañado", posicion);
        }
    }

    // Metodo repararRepulsor
    public boolean repararRepulsor(Consola consola) {
        consola.mensajes("intentar reparar");
        if (Math.random() <= 0.4) {
            consola.mensajes("repulsor reparado", this.posicion);
            estado = "sano";
            return true;
        } else {
            consola.mensajes("repulsor no reparado", this.posicion);
            estado = "dañado";
            return false;
        }
    }
}
