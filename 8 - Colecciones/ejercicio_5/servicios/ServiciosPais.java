package ejercicio_5.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import ejercicio_5.entidades.Pais;

public class ServiciosPais {
    private Scanner scanner = new Scanner(System.in);
    private HashSet<Pais> paises = new HashSet<>();

    public void crearPais() {
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del país: ");
            String nombre = scanner.nextLine();
            paises.add(new Pais(nombre));

            while (true) {
                System.out.println("¿Desea ingresar otro país? (s/n)");
                respuesta = scanner.nextLine();
                if (respuesta.equals("s") | respuesta.equals("n")) {
                    break;
                } else {
                    System.out.println("Ingrese una opción válida");
                }
            }
        } while (respuesta.equals("s"));
    }

    public void mostrarPaises() {
        System.out.println("Países ingresados: ");
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
    }

    public void ordenarPaises() {
        System.out.println("\nPaíses ordenados alfabéticamente: ");
        ArrayList<Pais> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais() {
        System.out.println("\nIngrese el nombre del país que desea eliminar: ");
        String nombre = scanner.nextLine();
        Iterator<Pais> it = paises.iterator();
        Boolean encontrado = false;
        while (it.hasNext()) {
            Pais pais = it.next();
            if (pais.getNombre().equals(nombre)) {
                it.remove();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El país no se encuentra en el conjunto");
        } else {
            System.out.println("El país se eliminó correctamente");
        }
    }

}
