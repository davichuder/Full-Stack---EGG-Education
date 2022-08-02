package entidades;

import java.util.Scanner;

public class Armadura {
    //Parametros
    private Scanner scanner = new Scanner(System.in);
    public String color_primario = "rojo";
    public String color_secundario = "amarillo";
    public float energia_armadura_maxima =  2147483647;
    public int energia_armadura = 2147483647/2;
    public int resistencia_armadura = 100;
    public int salud_armadura = 100;
    public Propulsor propulsor_izquierda = new Propulsor();
    public Propulsor propulsor_derecho = new Propulsor();
    public Repulsor repulsor_izquierdo = new Repulsor();
    public Repulsor repulsor_derecho = new Repulsor();
    public Consola consola = new Consola();
    public Sintetizador sintetizador = new Sintetizador();

    //Constructor por defecto
    public Armadura() {System.out.println("Armadura creada");}

    //Metodo caminar
    public void caminar(){
        System.out.println("Ingrese cuantos minutos camino");
        int cuanto_camina = scanner.nextInt();
        int energia_consumida = this.propulsor_izquierda.caminar(cuanto_camina) + this.propulsor_derecho.caminar(cuanto_camina);
        energia_consumida = consola.energiaUsada(energia_consumida);
        this.energia_armadura -= energia_consumida;
    }

    //Metodo correr
    public void correr(){
        System.out.println("Ingrese cuantos minutos correr");
        int cuanto_camina = scanner.nextInt();
        int energia_consumida = this.propulsor_izquierda.correr(cuanto_camina) + this.propulsor_derecho.correr(cuanto_camina);
        energia_consumida = consola.energiaUsada(energia_consumida);
        this.energia_armadura -= energia_consumida;
    }

    //Metodo propulsar
    public void propulsar(){
        System.out.println("Ingrese cuantos minutos se propulso");
        int cuanto_camina = scanner.nextInt();
        int energia_consumida = this.propulsor_izquierda.propulsar(cuanto_camina) + this.propulsor_derecho.propulsar(cuanto_camina);
        energia_consumida = consola.energiaUsada(energia_consumida);
        this.energia_armadura -= energia_consumida;
    }

    //Metodo volar
    public void volar(){
        System.out.println("Ingrese cuantos minutos volo");
        int cuanto_camina = scanner.nextInt();
        int energia_consumida = this.propulsor_izquierda.volar(cuanto_camina) + this.propulsor_derecho.volar(cuanto_camina) +
            this.repulsor_izquierdo.volar(cuanto_camina) + this.repulsor_derecho.volar(cuanto_camina);
        energia_consumida = consola.energiaUsada(energia_consumida);
        this.energia_armadura -= energia_consumida;
    }

    //Metodo leer
    //Metodo escribir
    //Metodo atacar
    //Metodo defender
    //Metodo esquivar

    //Metodo mostrarEstado
    public void mostrarEstado(){
        consola.mostrarEstado(this.color_primario, this.color_secundario,
            this.energia_armadura, this.resistencia_armadura, this.salud_armadura,
            this.propulsor_izquierda, this.propulsor_derecho,
            this.repulsor_izquierdo, this.repulsor_derecho);
    }

    //Metodo estadoBateria
    public void estadoBateria(){
        consola.estadoBateria(this.energia_armadura, this.energia_armadura_maxima);
    }

    //Metodo mostrarReactor
    public void mostrarReactor(){
        consola.mostrarReactor(this.energia_armadura);
    }

    //Metodo sufrirDanios
    //Metodo repararDanios
    //Metodo revisandoDispositivos
    //Metodo radar
    //Metodo simulador
    //Metodo destruyendoEnemigos
    //Metodo accionesEvasivas    
}
