package POO_7.servicios_generales;

public class Matematica {

    public float redondearFloat(float numero) {return (((float) Math.round(numero*100))/100);}

    public float redondearDouble(double numero) {return (((float) Math.round(numero*100))/100);}
    
    
}
