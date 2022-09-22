package ejercicio4extra.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Simulador {
    private final Random random = new Random();
    // La clase Simulador debe tener un método que genere un listado de alumnos
    // manera
    // aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser
    // generadas de
    // manera aleatoria. Nota: usar listas de tipo String para generar los nombres y
    // los apellidos.

    public ArrayList<String> generarNombres(int cantidad_alumnos) {
        final String[] nombres = { "Santiago", "Sebastián", "Diego", "Nicolás", "Samuel", "Alejandro", "Daniel",
                "Mateo",
                "Ángel", "Matías", "Gabriel", "Tomás", "David", "Emiliano", "Andrés", "Joaquín", "Carlos", "Alexander",
                "Adrián", "Lucas", "Benjamín", "Leonardo", "Rodrigo", "Felipe", "Francisco", "Pablo", "Martín",
                "Fernando", "Isaac", "Manuel", "Juan Pablo", "Emmanuel", "Emilio", "Vicente", "Eduardo", "Juan",
                "Javier", "Jorge", "Aaron", "José", "Erick", "Luis", "Cristian", "Ignacio", "Christopher", "Jesús",
                "Kevin", "Juan José", "Agustín", "Juan David", "Simón", "Joshua", "Maximiliano", "Miguel Ángel",
                "Juan Sebastián", "Bruno", "Iván", "Gael", "Miguel", "Thiago", "Jerónimo", "Hugo", "Ricardo", "Antonio",
                "Ian", "Anthony", "Pedro", "Rafael", "Jonathan", "Esteban", "Juan Manuel", "Julián", "Mauricio",
                "Oscar", "Santino", "Axel", "Sergio", "Guillermo", "Matthew", "Valentín", "Bautista", "Álvaro", "Dylan",
                "Marcos", "Kimberly", "Luciano", "Mario", "César", "Cristóbal", "Luca", "Iker", "Juan Andrés",
                "Gonzalo", "Roberto", "Valentino", "Facundo", "Patricio", "Diego Alejandro", "Josué", "Franco"
        };

        final String[] apellidos = { "García", "González", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez",
                "Pérez",
                "Gómez", "Martin", "Jiménez", "Ruiz", "Hernández", "Diaz", "Moreno", "Muñoz", "Álvarez", "Romero",
                "Alonso", "Gutiérrez", "Navarro", "Torres", "Domínguez", "Vázquez", "Ramos", "Gil", "Ramírez",
                "Serrano", "Blanco", "Molina", "Morales", "Suarez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
                "Marín", "Sanz", "Núñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos", "Lozano",
                "Guerrero", "Cano", "Prieto", "Méndez", "Cruz", "Calvo", "Gallego", "Vidal", "León", "Márquez",
                "Herrera", "Peña", "Flores", "Cabrera", "Campos", "Vega", "Fuentes", "Carrasco", "Diez", "Caballero",
                "Reyes", "Nieto", "Aguilar", "Pascual", "Santana", "Herrero", "Lorenzo", "Montero", "Hidalgo",
                "Giménez", "Ibáñez", "Ferrer", "Duran", "Santiago", "Benítez", "Mora", "Vicente", "Vargas", "Arias",
                "Carmona", "Crespo", "Román", "Pastor", "Soto", "Sáez", "Velasco", "Moya", "Soler", "Parra", "Esteban",
                "Bravo", "Gallardo", "Rojas"
        };

        ArrayList<String> alumnos = new ArrayList<String>();

        for (int i = 0; i < cantidad_alumnos; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            alumnos.add(nombre + " " + apellido);
        }

        return alumnos;
    }

    // • Ahora hacer un generador de combinaciones de DNI posibles, deben estar
    // dentro de un
    // rango real de números de documentos. Y agregar a los alumnos su DNI. Este
    // método
    // debe retornar la lista de dnis.
    public ArrayList<Integer> generarDocumentos(int cantidad_documentos) {
        HashSet<Integer> documentos = new HashSet<Integer>();
        while (documentos.size() < cantidad_documentos) {
            documentos.add(random.nextInt(99999999));
        }
        return new ArrayList<Integer>(documentos);
    }

    // • Ahora tendremos un método que, usando las dos listas generadas, cree una
    // cantidad de
    // objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis
    // de las dos
    // listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni,
    // pero si con el mismo nombre.
    public ArrayList<Alumno> generarAlumnos(ArrayList<String> nombres, ArrayList<Integer> documentos) throws Exception {
        if (nombres.size() != documentos.size())
            throw new Exception("Los tamaños de las listas no coinciden");

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        for (int i = 0; i < nombres.size(); i++) {
            alumnos.add(new Alumno(nombres.get(i), documentos.get(i)));
        }
        return alumnos;
    }

    // • Se debe imprimir por pantalla el listado de alumnos.
    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        alumnos.forEach(System.out::println);
        System.out.println();
    }

    // Crearemos un método votación en la clase Simulador que, recibe el listado de
    // alumnos y para cada alumno genera tres votos de manera aleatoria.
    // En este método debemosguardar a el alumno que vota, a los alumnos a los que
    // votó y sumarle uno a la cantidad de votos a cada alumno que reciba un voto,
    // que es un atributo de la clase Alumno.
    // Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una
    // vez al mismo alumno. Utilizar un hashset para resolver esto.
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos) {
        ArrayList<Voto> votos = new ArrayList<Voto>();
        HashSet<Integer> posicion_auxiliar = new HashSet<Integer>();
        int aleatorio;

        for (int i = 0; i < alumnos.size(); i++) {
            votos.add(new Voto(alumnos.get(i)));
            do {
                aleatorio = random.nextInt(alumnos.size());
                if (aleatorio != i && posicion_auxiliar.add(aleatorio)) {
                    alumnos.get(aleatorio).aumentarVoto();
                    votos.get(i).agregarVoto(alumnos.get(aleatorio));
                }
            } while (posicion_auxiliar.size() < 3);
            posicion_auxiliar.clear();
        }
        return votos;
    }

    // Se debe crear un método que muestre a cada Alumno con su cantidad de votos y
    // cuales fueron sus 3 votos.
    public void mostrarVotos(ArrayList<Alumno> alumnos, ArrayList<Voto> votos) {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("El alumno " + alumnos.get(i).getNombre_completo()
                    + " tiene " + alumnos.get(i).getCantidad_votos()
                    + " votos, y voto a: " + votos.get(i).getVotos().get(0).getNombre_completo() + ", "
                    + votos.get(i).getVotos().get(1).getNombre_completo() + ", "
                    + votos.get(i).getVotos().get(2).getNombre_completo());
        }
        System.out.println();
    }

    // • Se debe crear un método que haga el recuento de votos, este recibe la lista
    // de Alumnos y comienza a hacer el recuento de votos.
    // • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se
    // deben crear 5
    // facilitadores suplentes con los 5 segundos alumnos más votados. A
    // continuación, mostrar
    // los 5 facilitadores y los 5 facilitadores suplentes.
    public void recuentoVotos(ArrayList<Alumno> alumnos) {
        int total = 0;
        Collections.sort(alumnos, (c1, c2) -> c2.getCantidad_votos().compareTo(c1.getCantidad_votos()));

        for (Alumno alumno : alumnos) {
            total = total + alumno.getCantidad_votos();
            System.out.println(alumno.getNombre_completo() + " tuvo " + alumno.getCantidad_votos() + " votos");
        }
        System.out.println("La cantidad de votos totales fueron " + total);

        System.out.println("\nLos falicitadores seran:");
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos.get(i).getNombre_completo());
        }
        System.out.println("\nLos falicitadores suplentes seran:");
        for (int i = 5; i < 10; i++) {
            System.out.println(alumnos.get(i).getNombre_completo());
        }
        System.out.println();
    }
}
