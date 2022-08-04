package entidades;

import java.util.Scanner;

public class Consola {
    //Parametros
    private Scanner scanner = new Scanner(System.in);
    public int consumo_base = 5000;
    private Armadura armadura;

    //Constructor por defecto
    public Consola(Armadura armadura) {
     this.armadura = armadura;   
    }

    //Metodo mensajes
    public void mensajes(String mensaje, int posicion){
        switch (mensaje){
            case "propulsor recien dañado":
                System.out.println("ALERTA: Propulsor " + posicion + " se ha dañado al terminar");
                break;
            case "propulsor dañado":
                System.out.println("AVISO: Propulsor " + posicion + " se encuentra dañado");
                break;
            case "propulsor reparado":
                System.out.println("AVISO: El propulsor " + posicion + " se ha reparado");
                break;
            case "propulsor no reparado":
                System.out.println("AVISO: El propulsor " + posicion + " no se ha reparado");
                break;
            case "propulsor destruido":
                System.out.println("EMERGENCIA: Propulsor " + posicion + " destruido");
                break;
            case "repulsor recien dañado":
                System.out.println("ALERTA: Repulsor " + posicion + " se ha dañado al terminar");
                break;
            case "repulsor dañado":
                System.out.println("AVISO: Repulsor " + posicion + " se encuentra dañado");
                break;
            case "repulsor reparado":
                System.out.println("AVISO: El repulsor " + posicion + " se ha reparado");
                break;
            case "repulsor no reparado":
                System.out.println("AVISO: El repulsor " + posicion + " no se ha reparado");
                break;
            case "repulsor destruido":
                System.out.println("EMERGENCIA: Repulsor " + posicion + " destruido");
                break;
            case "atacando":
                System.out.println("Atacando al objetivo " + posicion);
        }
    }
    public void mensajes(String mensaje){
        switch (mensaje){
            case "menu":
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu de la armadura, seleccione una opcion:");
                System.out.println("0. Salir");
                System.out.println("1. Caminar");
                System.out.println("2. Correr");
                System.out.println("3. Propulsar");
                System.out.println("4. Volar");
                System.out.println("5. Mostrar estado de bateria");
                System.out.println("6. Mostrar estado");
                System.out.println("7. Mostrar reactor");
                System.out.println("8. Reparar daños");
                System.out.println("9. Revisar dispositivos");
                System.out.println("10. Radar 1.0");
                System.out.println("11. Simulador de radar 1.0");
                System.out.println("12. Destruir enemigos");
                System.out.println("13. Acciones evasivas");
                break;
            case "mostrar bateria":
                System.out.println("La bateria tiene " + this.armadura.estadoBateria() +"% de energia");
                break;
            case "mostrar estado":
                System.out.println("Color primario: " + armadura.color_primario);
                System.out.println("Color secundario: " + armadura.color_secundario);
                System.out.println("Energia armadura: " + armadura.energia_armadura);
                for (int i = 0; i < armadura.propulsores.length; i++){
                    System.out.println("Propulsor " + i + ": " + armadura.propulsores[i].estado);
                }
                for (int i = 0; i < armadura.repulsores.length; i++){
                    System.out.println("Repulsor " + i + ": " + armadura.repulsores[i].estado);
                }
                break;
            case "mostrar reactor":
                System.out.println("Energia de reactor");
                System.out.println("Joule: " + armadura.energia_armadura);
                System.out.println("KWh: " + (armadura.energia_armadura/3.6e6));
                System.out.println("Cal: " + (armadura.energia_armadura/4184));
                break;
            case "intentar reparar":
                System.out.println("Intentando reparar daños");
                break;
            case "energia consumida":
                System.out.println("Se ha consumido " + this.armadura.energia_consumida +" Watts de energia");
                break;
            case "caminar correcto":
                System.out.println("Se realizo la caminata correctamente");
                break;
            case "caminar fallo":
                System.out.println("No se pudo realizar la caminata");
                break;            
            case "tiempo caminar":
                System.out.println("Ingrese el tiempo a caminar");
                break;
            case "correr correcto":
                System.out.println("Se realizo la carrera correctamente");
                break;
            case "correr fallo":
                System.out.println("No se pudo realizar la carrera");
                break;
            case "tiempo correr":
                System.out.println("Ingrese el tiempo a correr");
                break;
            case "propulsar correcto":
                System.out.println("Se realizo la propulsion correctamente");
                break;
            case "propulsar fallo":
                System.out.println("No se pudo realizar la propulsion");
                break;
            case "tiempo propulsar":
                System.out.println("Ingrese el tiempo a propulsar");
                break;
            case "volar correcto":
                System.out.println("Se realizo la vuelo correctamente");
                break;
            case "volar fallo":
                System.out.println("No se pudo realizar la vuelo");
                break;
            case "tiempo volar":
                System.out.println("Ingrese el tiempo a volar");
                break;
            case "simulador":
                for (int i = 0; i < this.armadura.datos_objetivos.length; i++){
                    System.out.println("Objetivo " + i +
                                    "\tNombre: " + this.armadura.nombres_objetivos[this.armadura.datos_objetivos[i][0]] +
                                    "\tHostilidad: " + this.armadura.hostilidades_objetivos[this.armadura.datos_objetivos[i][1]] +
                                    "\tResistencia: " + this.armadura.datos_objetivos[i][2] +
                                    "\tX=" + this.armadura.datos_objetivos[i][3] + " Y=" + this.armadura.datos_objetivos[i][4] + " Z=" + this.armadura.datos_objetivos[i][5]);
                }
                break;
            case "radar":
                for (int i = 0; i < this.armadura.datos_objetivos.length; i++){
                    if (this.armadura.datos_objetivos[i][2]>0){
                        System.out.println("Objetivo " + i +
                                        "\tHostilidad: " + this.armadura.hostilidades_objetivos[this.armadura.datos_objetivos[i][1]] +
                                        "\tResistencia: " + this.armadura.datos_objetivos[i][2] +
                                        "\tDistancia: " + this.armadura.distancias_objetivos[i]);
                    }
                }
                break;
            case "bateria baja":
                System.out.println("La bateria esta baja");
                break;
            case "no hay enemigos":
                System.out.println("No hay enemigos disponibles para atacar o estas muy lejos");
                break;
        }
    }

    //Metodo menu
    public void menu(Armadura armadura){
        int opcion;
        do {
            this.mensajes("menu");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    this.caminar(armadura);
                    break;
                case 2:
                    this.correr(armadura);
                    break;
                case 3:
                    this.propulsar(armadura);
                    break;
                case 4:
                    this.volar(armadura);
                    break;
                case 5:
                    this.mensajes("mostrar bateria");
                    break;
                case 6:
                    this.mensajes("mostrar estado");
                    break;
                case 7:
                    this.mensajes("mostrar reactor");
                    break;
                case 8:
                    this.repararDaños(armadura);
                    break;
                case 9:
                    this.revisarDispositivos(armadura);
                    break;
                case 10:
                    this.armadura.radar();
                    this.mensajes("radar");
                    break;
                case 11:
                    this.armadura.simulador();
                    this.mensajes("simulador");
                    break;
                case 12:
                    this.armadura.destruirEnemigos();
                    break;
                case 13:
                    this.armadura.accionesEvasivas();
                    break;                
            }
        } while (opcion != 0);
    }

    //Metodo caminar
    public void caminar(Armadura armadura){
        Boolean habilitado = true;
        for (Boolean estado: verificarPropulsores(armadura.propulsores)){
            if (!estado){
                habilitado = false;
            }
        }
        if (habilitado){
            this.armadura.energia_consumida = 0;
            this.mensajes("tiempo caminar");
            int distancia = scanner.nextInt();
            this.armadura.energia_consumida = distancia * armadura.propulsores[0].consumo_base * armadura.propulsores.length + this.consumo_base;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("caminar correcto");
            this.dañarPropulsores(armadura.propulsores);
        } else {
            this.armadura.energia_consumida = this.consumo_base;;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("caminar fallo");
        }
        this.mensajes("energia consumida");
    }

    //Metodo correr
    public void correr(Armadura armadura){
        Boolean habilitado = true;
        for (Boolean estado: verificarPropulsores(armadura.propulsores)){
            if (!estado){
                habilitado = false;
            }
        }
        if (habilitado){
            this.armadura.energia_consumida = 0;
            this.mensajes("tiempo correr");
            int distancia = scanner.nextInt();
            this.armadura.energia_consumida = 2 * distancia * armadura.propulsores[0].consumo_base * armadura.propulsores.length + this.consumo_base;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("correr correcto");
            this.dañarPropulsores(armadura.propulsores);
        } else {
            this.armadura.energia_consumida = this.consumo_base;;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("correr fallo");
        }
        this.mensajes("energia consumida");
    }

    //Metodo propulsar
    public void propulsar(Armadura armadura){
        Boolean habilitado = true;
        for (Boolean estado: verificarPropulsores(armadura.propulsores)){
            if (!estado){
                habilitado = false;
            }
        }
        if (habilitado){
            this.armadura.energia_consumida = 0;
            this.mensajes("tiempo propulsar");
            int distancia = scanner.nextInt();
            this.armadura.energia_consumida = 3 * distancia * armadura.propulsores[0].consumo_base * armadura.propulsores.length + this.consumo_base;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("propulsar correcto");
            this.dañarPropulsores(armadura.propulsores);
        } else {
            this.armadura.energia_consumida = this.consumo_base;;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("propulsar fallo");
        }
        this.mensajes("energia consumida");
    }

    //Metodo volar
    public void volar(Armadura armadura){
        Boolean habilitado = true;
        for (Boolean estado: verificarPropulsores(armadura.propulsores)){
            if (!estado){
                habilitado = false;
            }
        }
        for (Boolean estado: verificarRepulsores(armadura.repulsores)){
            if (!estado){
                habilitado = false;
            }
        }
        if (habilitado){
            this.armadura.energia_consumida = 0;
            this.mensajes("tiempo volar");
            int distancia = scanner.nextInt();
            this.armadura.energia_consumida = 3 * distancia * armadura.propulsores[0].consumo_base * armadura.propulsores.length + this.consumo_base + 
                                                2 * distancia * armadura.repulsores[0].consumo_base * armadura.repulsores.length;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("volar correcto");
            this.dañarPropulsores(armadura.propulsores);
            this.dañarRepulsores(armadura.repulsores);
        } else {
            this.armadura.energia_consumida = this.consumo_base;;
            armadura.energia_armadura -= this.armadura.energia_consumida;
            this.mensajes("volar fallo");
        }
        this.mensajes("energia consumida");
    }

    //Metodo repararDaños
    public void repararDaños(Armadura armadura){
        for (int i = 0; i < armadura.propulsores.length; i++){
            if (armadura.propulsores[i].estado.equals("dañado")){
                repararPropulsor(armadura.propulsores[i], i);
            }            
        }
        for (int i = 0; i < armadura.repulsores.length; i++){
            if (armadura.repulsores[i].estado.equals("dañado")){
                repararRepulsor(armadura.repulsores[i], i);
            }
        }
    }

    //Metodo revisarDispositivos
    public void revisarDispositivos(Armadura armadura){
        double aleatorio;
        for (int i = 0; i < armadura.propulsores.length; i++){
            if (armadura.propulsores[i].estado.equals("dañado")){
                do {
                    aleatorio = Math.random();
                    if (aleatorio < 0.3){
                        armadura.propulsores[i].estado = "destruido";
                        this.mensajes("propulsor destruido", i);
                    } else if (aleatorio > 0.6){
                        armadura.propulsores[i].estado = "sano";
                        this.mensajes("propulsor reparado", i);
                    }
                } while (armadura.propulsores[i].estado.equals("dañado"));
            }
        }
        for (int i = 0; i < armadura.repulsores.length; i++){
            if (armadura.repulsores[i].estado.equals("dañado")){
                do {
                    aleatorio = Math.random();
                    if (aleatorio < 0.3){
                        armadura.repulsores[i].estado = "destruido";
                        this.mensajes("repulsor destruido", i);
                    } else if (aleatorio > 0.6){
                        armadura.repulsores[i].estado = "sano";
                        this.mensajes("repulsor reparado", i);
                    }
                } while (armadura.repulsores[i].estado.equals("dañado"));
            }
        }
    }

    //Metodo simulador
    //Metodo destruyendoEnemigos
    //Metodo accionesEvasivas

    //Metodo dañarPropulsores
    public void dañarPropulsores(Propulsor[] propulsores){
        for (int i = 0; i < propulsores.length; i++){
            if ((propulsores[i].estado.equals("sano")) && (Math.random() <= 0.3)){
                this.mensajes("propulsor recien dañado", i);
                propulsores[i].estado = "dañado";
            }
        }
    }

    //Metodo verificarPropulsores
    public Boolean[] verificarPropulsores(Propulsor[] propulsores){
        Boolean[] estados = new Boolean[propulsores.length];
        for (int i = 0; i < propulsores.length; i++){
            estados[i] = true;
        }
        for (int i = 0; i < propulsores.length; i++) {
            if (propulsores[i].estado.equals("destruido")){
                this.mensajes("propulsor destruido", i);
                estados[i] = false;
            }
            else if (propulsores[i].estado.equals("dañado")){
                this.mensajes("propulsor dañado", i);
                estados[i] = this.repararPropulsor(propulsores[i], i);
            }           
        }
        return estados;
    }

    //Metodo repararPropulsor
    public boolean repararPropulsor(Propulsor propulsor, int i){
        this.mensajes("intentar reparar");
        if (Math.random() <= 0.4){
            this.mensajes("propulsor reparado", i);
            propulsor.estado = "sano";
            return true;
        }
        else {
            this.mensajes("propulsor no reparado", i);
            propulsor.estado = "dañado";
            return false;
        }
    }

    //Metodo dañarRepulsores
    public void dañarRepulsores(Repulsor[] repulsores){
        for (int i = 0; i < repulsores.length; i++){
            if ((repulsores[i].estado.equals("sano")) && (Math.random() <= 0.3)){
                this.mensajes("repulsor recien dañado", i);
                repulsores[i].estado = "dañado";
            }
        }
    }
    
    //Metodo verificarRepulsores
    public Boolean[] verificarRepulsores(Repulsor[] repulsores){
        Boolean[] estados = new Boolean[repulsores.length];
        for (int i = 0; i < repulsores.length; i++){
            estados[i] = true;
        }
        for (int i = 0; i < repulsores.length; i++) {
            if (repulsores[i].estado.equals("destruido")){
                this.mensajes("repulsor destruido", i);
                estados[i] = false;
            }
            else if (repulsores[i].estado.equals("dañado")){
                this.mensajes("repulsor dañado", i);
                estados[i] = this.repararRepulsor(repulsores[i], i);
            }           
        }
        return estados;
    }

    //Metodo repararRepulsores
    public boolean repararRepulsor(Repulsor repulsor, int i){
        this.mensajes("intentar reparar");
        if (Math.random() <= 0.4){
            this.mensajes("repulsor reparado", i);
            repulsor.estado = "sano";
            return true;
        }
        else {
            this.mensajes("repulsor no reparado", i);
            repulsor.estado = "dañado";
            return false;
        }
    }

    //Metodo escapar
    public void escapar(Armadura armadura){
        int distancia = 300;
        this.armadura.energia_consumida = 3 * distancia * armadura.propulsores[0].consumo_base * armadura.propulsores.length + this.consumo_base + 
                                            2 * distancia * armadura.repulsores[0].consumo_base * armadura.repulsores.length;
        armadura.energia_armadura -= this.armadura.energia_consumida;
        this.mensajes("volar correcto");
        this.dañarPropulsores(armadura.propulsores);
        this.dañarRepulsores(armadura.repulsores);
        this.mensajes("energia consumida");
    }
}
