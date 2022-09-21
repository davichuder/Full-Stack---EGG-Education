package ejercicio4extra.entidades;

import java.util.ArrayList;
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
        String[] nombres = { "Santiago", "Sebastián", "Diego", "Nicolás", "Samuel", "Alejandro", "Daniel", "Mateo",
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

        String[] apellidos = { "García", "González", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez", "Pérez",
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
    public ArrayList<Integer> generarDocumento(int cantidad_documentos) {
        HashSet<Integer> documentos = new HashSet<Integer>();
        while (documentos.size() < cantidad_documentos - 1) {
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
    }

    // Crearemos un método votación en la clase Simulador que, recibe el listado de
    // alumnos y
    // para cada alumno genera tres votos de manera aleatoria.
    // En este método debemos
    // guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la
    // cantidad de
    // votos a cada alumno que reciba un voto, que es un atributo de la clase
    // Alumno.
    // Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una
    // vez al
    // mismo alumno. Utilizar un hashset para resolver esto.
    public void votacion(ArrayList<Alumno> alumnos) {
        HashSet<Integer> posicion_auxiliar = new HashSet<>();
        for (int i = 0; i < alumnos.size(); i++) {

        }
    }
}
