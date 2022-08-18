import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
        // String.
        // El programa pedirá una raza de perro en un bucle, el mismo se guardará en la
        // lista y
        // después se le preguntará al usuario si quiere guardar otro perro o si quiere
        // salir.
        // Si decide salir, se mostrará todos los perros guardados en el ArrayList.
        ArrayList<String> perros = new ArrayList<String>();
        String respuesta;
        do {
            System.out.println("Introduce una raza de perro:");
            String raza = scanner.nextLine();
            perros.add(raza);
            while (true) {
                System.out.println("¿Quieres añadir otro perro? (s/n)");
                respuesta = scanner.nextLine();
                if (respuesta.equals("n") || respuesta.equals("s")) {
                    break;
                } else {
                    System.out.println("Introduce una respuesta valida");
                }
            }
        } while (!respuesta.equals("n"));

        for (String perro : perros) {
            System.out.println(perro);
        }

        // Continuando el ejercicio anterior, después de mostrar los perros, al usuario
        // se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
        // perro en la lista.
        // Si el perro está en la lista, se eliminará el perro que ingresó el usuario y
        // se mostrará la lista ordenada.
        // Si el perro no se encuentra en la lista, se le informará al usuario y se
        // mostrará la lista ordenada.
        Iterator<String> it = perros.iterator();
        System.out.println("Introduce una raza de perro para eliminar: ");
        String raza = scanner.nextLine();
        scanner.close();
        Boolean encontrado = false;
        while (it.hasNext()) {
            String perro = it.next();
            if (perro.equals(raza)) {
                it.remove();
                System.out.println("El perro se ha eliminado");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El perro no se encuentra en la lista");
        }
        Collections.sort(perros);
        for (String perro : perros) {
            System.out.println(perro);
        }

        scanner.close();
    }
}
