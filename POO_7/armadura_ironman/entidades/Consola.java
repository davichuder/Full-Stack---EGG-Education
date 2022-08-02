package entidades;

public class Consola {
    //Parametros
    public int consumo_base = 50;

    //Constructor por defecto
    public Consola(){}

    //Metodo energiaUsada
    public int energiaUsada(int energia_consumida) {
        energia_consumida = energia_consumida + consumo_base;
        System.out.println("La energia consumida fue: " + energia_consumida);
        return energia_consumida;
    }

    //Metodo mostrarEstado
    public void mostrarEstado(String color_primario, String color_secundario,
        int energia_armadura, int resistencia_armadura, int salud_armadura,
        Propulsor propulsor_izquierdo, Propulsor propulsor_derecho,
        Repulsor repulsor_izquierdo, Repulsor repulsor_derecho) {
            System.out.println("Color primario: " + color_primario);
            System.out.println("Color secundario: " + color_secundario);
            System.out.println("Energia armadura: " + energia_armadura);
            System.out.println("Resistencia armadura: " + resistencia_armadura);
            System.out.println("Salud armadura: " + salud_armadura);
            System.out.println("Propulsor izquierdo dañado?: " + propulsor_izquierdo.isDañado());
            System.out.println("Propulsor derecho dañado?: " + propulsor_derecho.isDañado());
            System.out.println("Repulsor izquierdo dañado?: " + repulsor_izquierdo.isDañado());
            System.out.println("Repulsor derecho dañado?: " + repulsor_derecho.isDañado());        
    }

    //Metodo estadoBateria
    public void estadoBateria(int energia_armadura, float energia_armadura_maxima) {
        System.out.println("El porcentaje de armadura actual es: " + (energia_armadura/energia_armadura_maxima*100) + "%");
    }

    //Metodo mostrarReactor
    public void mostrarReactor(int energia_armadura){
        System.out.println("El reactor tiene una energia de: " + energia_armadura + " KWh");
        System.out.println("El reactor tiene una energia de: " + (energia_armadura * 3 * Math.pow(10, 6)) + " J");
        System.out.println("El reactor tiene una energia de: " + (energia_armadura * 0.86 * Math.pow(10, 6)) + " Cal");
    }

}
