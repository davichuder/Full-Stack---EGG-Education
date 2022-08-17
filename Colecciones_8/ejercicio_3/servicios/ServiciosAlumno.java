package Colecciones_8.ejercicio_3.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import Colecciones_8.ejercicio_3.entidades.Alumno;

public class ServiciosAlumno {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public void crearAlumno(){
        while (true){
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese las notas del alumno: ");
            Integer[] notas = new Integer[3];
            for (int i = 0; i < notas.length; i++) {
                notas[i] = scanner.nextInt();
            }
            alumnos.add(new Alumno(nombre, notas));

            System.out.println("Desea ingresar otro alumno? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equals("n"))
                break;
            else if (respuesta.equals("s"))
                continue;
            else
                System.out.println("Introduce una respuesta valida");
        }
    }

    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno para la nota final: ");
        String nombre = scanner.nextLine();
        Alumno alumnoFinal;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)){
                alumnoFinal = alumno;
                break;
            }
        }
        if (alumnoFinal == null){
            System.out.println("La nota final del alumno es: " + calcularNotaFinal(alumnoFinal));
        } else {
            System.out.println("El alumno no existe");
        }
    }

    public Float calcularNotaFinal(Alumno alumno){
        float suma = 0;
        for (Integer nota : alumno.getNotas()) {
            suma += nota;
        }
        return (suma/alumno.getNotas().length);
    }
}
