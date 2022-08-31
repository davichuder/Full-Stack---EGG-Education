package armadura_ironman.entidades;

import java.util.Scanner;

public class Consola {
    // Parametros
    private Scanner scanner = new Scanner(System.in);
    public int consumo_base = 5000;

    // Metodo mensajes
    public void mensajes(String mensaje, String posicion) {
        switch (mensaje) {
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

    public void mensajes(String mensaje) {
        switch (mensaje) {
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
            case "intentar reparar":
                System.out.println("Intentando reparar daños");
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
            case "bateria baja":
                System.out.println("La bateria esta baja");
                break;
            case "no hay enemigos":
                System.out.println("No hay enemigos disponibles para atacar o estas muy lejos");
                break;
        }
    }

    public void mensajes(Armadura armadura, String mensaje) {
        switch (mensaje) {

            case "mostrar bateria":
                System.out.println("La bateria tiene " + armadura.estadoBateria() + "% de energia");
                break;
            case "mostrar estado":
                System.out.println("Color primario: " + armadura.color_primario);
                System.out.println("Color secundario: " + armadura.color_secundario);
                System.out.println("Energia armadura: " + armadura.energia_armadura);
                for (int i = 0; i < armadura.propulsores.length; i++) {
                    System.out.println("Propulsor " + i + ": " + armadura.propulsores[i].estado);
                }
                for (int i = 0; i < armadura.repulsores.length; i++) {
                    System.out.println("Repulsor " + i + ": " + armadura.repulsores[i].estado);
                }
                break;
            case "mostrar reactor":
                System.out.println("Energia de reactor");
                System.out.println("Joule: " + armadura.energia_armadura);
                System.out.println("KWh: " + (armadura.energia_armadura / 3.6e6));
                System.out.println("Cal: " + (armadura.energia_armadura / 4184));
                break;

            case "energia consumida":
                System.out.println("Se ha consumido " + armadura.energia_consumida + " Watts de energia");
                break;
            case "simulador":
                for (int i = 0; i < armadura.datos_objetivos.length; i++) {
                    System.out.println("Objetivo " + i +
                            "\tNombre: " + armadura.nombres_objetivos[armadura.datos_objetivos[i][0]] +
                            "\tHostilidad: " + armadura.hostilidades_objetivos[armadura.datos_objetivos[i][1]] +
                            "\tResistencia: " + armadura.datos_objetivos[i][2] +
                            "\tX=" + armadura.datos_objetivos[i][3] + " Y=" + armadura.datos_objetivos[i][4] + " Z="
                            + armadura.datos_objetivos[i][5]);
                }
                break;
            case "radar":
                for (int i = 0; i < armadura.datos_objetivos.length; i++) {
                    if (armadura.datos_objetivos[i][2] > 0) {
                        System.out.println("Objetivo " + i +
                                "\tHostilidad: " + armadura.hostilidades_objetivos[armadura.datos_objetivos[i][1]] +
                                "\tResistencia: " + armadura.datos_objetivos[i][2] +
                                "\tDistancia: " + armadura.distancias_objetivos[i]);
                    }
                }
                break;
        }
    }

    // Metodo menu
    public void menu(Armadura armadura) {
        int opcion;
        do {
            this.mensajes("menu");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    armadura.caminar();
                    break;
                case 2:
                    armadura.correr();
                    break;
                case 3:
                    armadura.propulsar();
                    break;
                case 4:
                    armadura.volar();
                    break;
                case 5:
                    this.mensajes(armadura, "mostrar bateria");
                    break;
                case 6:
                    this.mensajes(armadura, "mostrar estado");
                    break;
                case 7:
                    this.mensajes(armadura, "mostrar reactor");
                    break;
                case 8:
                    armadura.repararDaños(armadura);
                    break;
                case 9:
                    armadura.revisarDispositivos(armadura);
                    break;
                case 10:
                    armadura.radar();
                    this.mensajes(armadura, "radar");
                    break;
                case 11:
                    armadura.simulador();
                    this.mensajes(armadura, "simulador");
                    break;
                case 12:
                    armadura.destruirEnemigos();
                    break;
                case 13:
                    armadura.accionesEvasivas();
                    break;
            }
        } while (opcion != 0);
    }
}