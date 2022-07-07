/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().
*/
import java.util.Scanner;

public class ejercicio_extra23 {
    public static void main(String[] args) {
        String[] palabras = new String[5];
        int[] fila = new int[5];
        int[] columna = new int[5];
        String[][] sopa = new String[20][20];

        pedir_palabras(palabras);
        elegir_fila(fila);
        elegir_columna(columna, palabras);
        rellenar_sopa(sopa, palabras, fila, columna);
    }

    public static void pedir_palabras(String[] palabras){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            do {
                System.out.print("Ingrese una palabra de 3 a 5 letras: ");
                palabras[i] = scanner.nextLine();
            } while (palabras[i].length()<3 || 5<palabras[i].length());
        }
        scanner.close();
    }

    public static void elegir_fila(int[] fila){        
        // Lleno con -1 para indicar que no se ha elegido la fila
        for (int i=0; i<fila.length; i++) {
            fila[i] = -1;
        }

        // Selecciono una fila aleatoria
        int i = 0;
        boolean libre = false;
        int aleatorio;
        while (i<fila.length) {
            aleatorio = (int) (Math.random()*20);

            for (int j=0; j<fila.length; j++) {
                if (fila[i] == aleatorio) {
                    libre = false;
                    break;
                } else {
                    libre = true;
                }
            }
            if (libre){
                fila[i] = aleatorio;
                i++;
            }
        }

        // Imprimo la fila seleccionada
        for (i=0; i<fila.length; i++){
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }

    public static void elegir_columna(int[] columna, String[] palabras){
        // Relleno columna
        for (int i=0; i<columna.length; i++) {
            columna[i] = (int) (Math.random()*(20-palabras[i].length()));
        }
        // Muestro columnas
        for (int i=0; i<columna.length; i++) {
            System.out.print(columna[i] + " ");
        }
        System.out.println();
    }

    public static void rellenar_sopa(String[][] sopa, String[] palabras, int[] fila, int[] columna){
        // Relleno sopa con numeros aleatorios
        for (int i=0; i<sopa.length; i++){
            for (int j=0; j < sopa[i].length; j++){
                sopa[i][j] = Integer.toString((int) (Math.random()*10));
            }
        }
        // Relleno sopa con palabras
        // For para recorer filas y columnas
        for (int i=0; i<fila.length; i++) {
            // For para cargar palabras
            for (int k=0; k<palabras[i].length(); k++) {
                sopa[fila[i]][columna[i]+k] = palabras[i].substring(k, k+1);
            }
        }

        // Imprimo sopa
        for (int i=0; i<sopa.length; i++){
            for (int j=0; j<sopa[i].length; j++){
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}