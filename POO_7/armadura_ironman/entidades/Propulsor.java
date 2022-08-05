package entidades;

public class Propulsor {
    //Parametros
    public String posicion;
    public int consumo_base = 20000;
    public String estado = "sano";

    //Metodo dañarPropulsor
    public void dañarPropulsor(Consola consola){
        if ((this.estado.equals("sano")) && (Math.random() <= 0.3)){
            consola.mensajes("propulsor recien dañado", this.posicion);
            this.estado = "dañado";
        }
    }
    
    //Metodo verificarPropulsor
    public void verificarPropulsor(Consola consola){
        if (this.estado.equals("destruido")){
            consola.mensajes("propulsor destruido", this.posicion);
        }
        else if (this.estado.equals("dañado")){
            consola.mensajes("propulsor dañado", posicion);
        }
    }

    //Metodo repararPropulsor
    public boolean repararPropulsor(Consola consola){
        consola.mensajes("intentar reparar");
        if (Math.random() <= 0.4){
            consola.mensajes("propulsor reparado", this.posicion);
            estado = "sano";
            return true;
        }
        else {
            consola.mensajes("propulsor no reparado", this.posicion);
            estado = "dañado";
            return false;
        }
    }
}
