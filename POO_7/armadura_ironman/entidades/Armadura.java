package entidades;

public class Armadura {
    //Parametros publicos
    public String color_primario = "rojo";
    public String color_secundario = "amarillo";
    public int energia_armadura = 2147483647/2;
    public Consola consola = new Consola(this);
    public Propulsor[] propulsores;
    public Repulsor[] repulsores;
    public final float energia_armadura_maxima =  2147483647;
    public int[][] datos_objetivos = new int[2000][6]; //nombre, hostilidad, resistencia, coordenadas
    public double[] distancias_objetivos = new double[datos_objetivos.length];
    public String[] nombres_objetivos = {"barco", "avion", "auto", "alien", "thanos", "robot", "gangster", "perro", "gato", "monstruo"};
    public String[] hostilidades_objetivos = {"hostil", "neutral", "amistoso"};

    //Parametros auxiliares
    public int energia_consumida = 0;
    
    
    //Constructor
    public Armadura(int cantidad_propulsores, int cantidad_repulsores) {
        System.out.println("Armadura creada");
        this.propulsores = new Propulsor[cantidad_propulsores];
        this.repulsores = new Repulsor[cantidad_repulsores];
        for (int i = 0; i < cantidad_propulsores; i++) {
            this.propulsores[i] = new Propulsor();
            this.propulsores[0].posicion = "izquierdo " + i;
        }
        for (int i = 0; i < cantidad_repulsores; i++) {
            this.repulsores[i] = new Repulsor();
            this.repulsores[0].posicion = "derecho " + i;
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
        consola.menu(this);
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
                        this.consola.mensajes("atacando", i);
                        hay_energia = ((this.energia_armadura-this.energia_consumida)/this.energia_armadura_maxima > 0.1);
                    }
                }
            }
            this.consola.dañarRepulsores(this.repulsores);
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
            for (int i = 0; i < this.repulsores.length; i++) {
                if (this.repulsores[i].estado == "dañado") {
                    reparado = this.consola.repararRepulsor(this.repulsores[i], i);
                }
            }
        } while (!reparado);
        if (this.energia_armadura/this.energia_armadura_maxima < 0.1){
            this.consola.escapar(this);
        }
    }
}
