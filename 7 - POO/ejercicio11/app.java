/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío.  
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date();
*/

package ejercicio11;

import java.util.Date;

public class app {
    public static void main(String[] args) {
        // Creo variables
        int dia, mes, anio;
        // Pido datos
        System.out.println("Introduce el dia: ");
        dia = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el mes: ");
        mes = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el anio: ");
        anio = Integer.parseInt(System.console().readLine());
        // Creo fecha
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Fecha: " + fecha.toString());
        Date fecha_actual = new Date();
        System.out.println("Fecha actual: " + fecha_actual.toString());
        int diferencia = (int) ((fecha_actual.getTime() - fecha.getTime()) / 1000 / 60 / 60 / 24 / 365);
        System.out.println("Años entre la fecha introducida y la fecha actual: " + diferencia);
    }
}
