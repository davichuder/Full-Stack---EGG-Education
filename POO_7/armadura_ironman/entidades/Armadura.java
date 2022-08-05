package entidades;

import java.util.Scanner;

public class Armadura {
    //Parametros publicos
    public final String color_primario = "rojo";
    public final String color_secundario = "amarillo";
    public int energia_armadura = 2147483647/2;
    public Consola consola = new Consola();
    public Propulsor[] propulsores;
    public Repulsor[] repulsores;
    public final float energia_armadura_maxima =  2147483647;

    public int[][] datos_objetivos = new int[2000][6]; //nombre, hostilidad, resistencia, coordenadas
    public double[] distancias_objetivos = new double[datos_objetivos.length];
    public final String[] nombres_objetivos = {"barco", "avion", "auto", "alien", "thanos", "robot", "gangster", "perro", "gato", "monstruo"};
    public final String[] hostilidades_objetivos = {"hostil", "neutral", "amistoso"};

    //Parametros auxiliares
    public int energia_consumida;
    private Scanner scanner = new Scanner(System.in);
    
    //Constructor
    public Armadura(int cantidad_propulsores, int cantidad_repulsores) {
        System.out.println("Armadura creada");
        this.propulsores = new Propulsor[cantidad_propulsores];
        this.repulsores = new Repulsor[cantidad_repulsores];
        for (int i = 0; i < cantidad_propulsores; i++) {
            this.propulsores[i] = new Propulsor();
            this.propulsores[i].posicion = "" + i;
        }
        for (int i = 0; i < cantidad_repulsores; i++) {
            this.repulsores[i] = new Repulsor();
            this.repulsores[i].posicion = "" + i;
        }
        for (int i = 0; i < datos_objetivos.length; i++) {
            for (int j = 0; j < datos_objetivos[0].length; j++) {
                this.datos_objetivos[i][j] = 0;
            }
            this.distancias_objetivos[i] = 0;
        }
    }

    //Metodo menu
    public void menu(){
        this.consola.menu(this);
    }

    //Metodo estadoBateria
    public float estadoBateria(){
        return (this.energia_armadura/this.energia_armadura_maxima)*100;
    }

    //Metodo simulador
    public void simulador(){
        for (int i = 0; i < this.datos_objetivos.length; i++) {
            this.datos_objetivos[i][0] = (int) (Math.random()*this.nombres_objetivos.length);
            this.datos_objetivos[i][1] = (int) (Math.random()*this.hostilidades_objetivos.length);
            this.datos_objetivos[i][2] = (int) (Math.random()*100000);
            this.datos_objetivos[i][3] = (int) (Math.random()*5000);
            this.datos_objetivos[i][4] = (int) (Math.random()*5000);
            this.datos_objetivos[i][5] = (int) (Math.random()*5000);
        }
    }

    //Metodo radar
    public void radar(){
        for (int i = 0; i < this.datos_objetivos.length; i++) {
            this.distancias_objetivos[i] = Math.sqrt(Math.pow(this.datos_objetivos[i][3], 2) + Math.pow(this.datos_objetivos[i][3], 2) + Math.pow(this.datos_objetivos[i][3], 2));
        }
    }

    //Metodo dañarRepulsores
    public void dañarRepulsores(){
        for (Repulsor repulsor: this.repulsores){
            repulsor.dañarRepulsor(this.consola);
        }
    }
    
    //Metodo verificarRepulsores
    public void verificarRepulsores(){
        for (Repulsor repulsor: this.repulsores){
            repulsor.verificarRepulsor(this.consola);
        }
    }

    //Metodo repararRepulsores
    public void repararRepulsores(){
        consola.mensajes("intentar reparar");
        for (Repulsor repulsor: this.repulsores){
            repulsor.repararRepulsor(this.consola);
        }
    }

    //Metodo dañarPropulsores
    public void dañarPropulsores(){
        for (Propulsor propulsor: this.propulsores){
            propulsor.dañarPropulsor(this.consola);
        }
    }
    
    //Metodo verificarPropulsores
    public void verificarPropulsores(){
        for (Propulsor propulsor: this.propulsores){
            propulsor.verificarPropulsor(this.consola);
        }
    }

    //Metodo repararPropulsores
    public void repararPropulsores(){
        consola.mensajes("intentar reparar");
        for (Propulsor propulsor: this.propulsores){
            propulsor.repararPropulsor(this.consola);
        }
    }

    //Metodo caminar
    public void caminar(){
        Boolean habilitado = true;
        for (Propulsor propulsor: this.propulsores){
            if (!propulsor.estado.equals("sano")){
                habilitado = false;
                break;
            }
        }
        if (habilitado){
            this.energia_consumida = 0;
            this.consola.mensajes("tiempo caminar");
            int distancia = scanner.nextInt();
            this.energia_consumida = distancia * this.propulsores[0].consumo_base * this.propulsores.length + this.consola.consumo_base;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("caminar correcto");
            this.dañarPropulsores();
        } else {
            this.energia_consumida = this.consola.consumo_base;;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("caminar fallo");
        }
        this.consola.mensajes(this, "energia consumida");
    }

    //Metodo correr
    public void correr(){
        Boolean habilitado = true;
        for (Propulsor propulsor: this.propulsores){
            if (!propulsor.estado.equals("sano")){
                habilitado = false;
                break;
            }
        }
        if (habilitado){
            this.energia_consumida = 0;
            this.consola.mensajes("tiempo correr");
            int distancia = scanner.nextInt();
            this.energia_consumida = 2 * distancia * this.propulsores[0].consumo_base * this.propulsores.length + this.consola.consumo_base;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("correr correcto");
            this.dañarPropulsores();
        } else {
            this.energia_consumida = this.consola.consumo_base;;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("correr fallo");
        }
        this.consola.mensajes(this, "energia consumida");
    }

    //Metodo propulsar
    public void propulsar(){
        Boolean habilitado = true;
        for (Propulsor propulsor: this.propulsores){
            if (!propulsor.estado.equals("sano")){
                habilitado = false;
                break;
            }
        }
        if (habilitado){
            this.energia_consumida = 0;
            this.consola.mensajes("tiempo propulsar");
            int distancia = scanner.nextInt();
            this.energia_consumida = 3 * distancia * this.propulsores[0].consumo_base * this.propulsores.length + this.consola.consumo_base;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("propulsar correcto");
            this.dañarPropulsores();
        } else {
            this.energia_consumida = this.consola.consumo_base;;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes(this, "propulsar fallo");
        }
        this.consola.mensajes(this, "energia consumida");
    }

    //Metodo volar
    public void volar(){
        Boolean habilitado = true;
        for (Propulsor propulsor: this.propulsores){
            if (!propulsor.estado.equals("sano")){
                habilitado = false;
                break;
            }
        }
        for (Repulsor repulsor: this.repulsores){
            if (!repulsor.estado.equals("sano")){
                habilitado = false;
                break;
            }
        }
        if (habilitado){
            this.energia_consumida = 0;
            this.consola.mensajes("tiempo volar");
            int distancia = scanner.nextInt();
            this.energia_consumida = 3 * distancia * this.propulsores[0].consumo_base * this.propulsores.length + this.consola.consumo_base + 
                                                2 * distancia * this.repulsores[0].consumo_base * this.repulsores.length;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("volar correcto");
            this.dañarPropulsores();
            this.dañarRepulsores();
        } else {
            this.energia_consumida = this.consola.consumo_base;;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("volar fallo");
        }
        this.consola.mensajes(this, "energia consumida");
    }

    //Metodo repararDaños
    public void repararDaños(Armadura armadura){
        for (Propulsor propulsor: this.propulsores){
            if (propulsor.estado.equals("dañado")){
                propulsor.repararPropulsor(this.consola);
            }
        }
        for (Repulsor repulsor: this.repulsores){
            if (repulsor.estado.equals("dañado")){
                repulsor.repararRepulsor(this.consola);
            }
        }
    }

    //Metodo revisarDispositivos
    public void revisarDispositivos(Armadura armadura){
        double aleatorio;
        for (int i = 0; i < this.propulsores.length; i++){
            if (this.propulsores[i].estado.equals("dañado")){
                do {
                    aleatorio = Math.random();
                    if (aleatorio < 0.3){
                        this.propulsores[i].estado = "destruido";
                        this.consola.mensajes("propulsor destruido", String.valueOf(i));
                    } else if (aleatorio > 0.6){
                        this.propulsores[i].estado = "sano";
                        this.consola.mensajes("propulsor reparado", String.valueOf(i));
                    }
                } while (this.propulsores[i].estado.equals("dañado"));
            }
        }
        for (int i = 0; i < this.repulsores.length; i++){
            if (this.repulsores[i].estado.equals("dañado")){
                do {
                    aleatorio = Math.random();
                    if (aleatorio < 0.3){
                        this.repulsores[i].estado = "destruido";
                        this.consola.mensajes("repulsor destruido", String.valueOf(i));
                    } else if (aleatorio > 0.6){
                        this.repulsores[i].estado = "sano";
                        this.consola.mensajes("repulsor reparado", String.valueOf(i));
                    }
                } while (this.repulsores[i].estado.equals("dañado"));
            }
        }
    }

    //Metodo destruirEnemigos
    public void destruirEnemigos(){
        this.energia_consumida = 0;
        boolean hay_enemigos = false;
        boolean hay_energia = true;
        for (int i = 0; i < this.datos_objetivos.length; i++) {
            if (this.hostilidades_objetivos[this.datos_objetivos[i][1]] == "hostil" && this.distancias_objetivos[i] < 5000 && this.datos_objetivos[i][2] > 0) {
                hay_enemigos = true;
                break;
            }
        }
        if (!hay_enemigos){
            this.consola.mensajes("no hay enemigos");
        } else if (this.energia_armadura/this.energia_armadura_maxima > 0.1 && hay_enemigos) {
            for (int i = 0; i < this.datos_objetivos.length; i++) {
                if (this.hostilidades_objetivos[this.datos_objetivos[i][1]] == "hostil" && this.distancias_objetivos[i] < 5000) {
                    while (this.datos_objetivos[i][2] > 0 && hay_energia) {
                        for (int j = 0; j < this.repulsores.length; j++) {
                            if (this.repulsores[j].estado == "sano") {
                                this.energia_consumida += 3 * this.repulsores[0].consumo_base;
                                this.datos_objetivos[i][2] -= (100 + this.repulsores[0].daño - 0.5 * this.distancias_objetivos[i]);
                            }
                        }
                        this.consola.mensajes("atacando", String.valueOf(i));
                        hay_energia = ((this.energia_armadura-this.energia_consumida)/this.energia_armadura_maxima > 0.1);
                    }
                }
            }
            this.dañarRepulsores();
            this.consola.mensajes("energia consumida");
            this.energia_armadura -= this.energia_consumida;
        } else {
            this.consola.mensajes("bateria baja");
        }
    }

    //Metodo accionesEvasivas
    public void accionesEvasivas(){
        this.destruirEnemigos();
        boolean reparado;
        do {
            reparado = true;
            for (Repulsor repulsor: this.repulsores){
                if (repulsor.estado == "dañado") {
                    repulsor.repararRepulsor(this.consola);
                    reparado = false;
                    break;
                }
            }
        } while (!reparado);

        if (this.energia_armadura/this.energia_armadura_maxima < 0.1){
            int distancia = 300;
            this.energia_consumida = 3 * distancia * this.propulsores[0].consumo_base * this.propulsores.length + this.consola.consumo_base + 
                                                2 * distancia * this.repulsores[0].consumo_base * this.repulsores.length;
            this.energia_armadura -= this.energia_consumida;
            this.consola.mensajes("volar correcto");
        }
        this.dañarPropulsores();
        this.dañarRepulsores();
        this.consola.mensajes(this, "energia consumida");
    }
}
