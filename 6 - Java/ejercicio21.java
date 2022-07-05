/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices: 
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6
*/

import java.util.Random;

public class ejercicio21 {
    public static void main(String[] args) {
        int max = 3;
        int min = 1;
        int[][] matriz_grande;
        int[][] matriz_chica;
        boolean encontrado = false;

        do {
            matriz_grande = crearMatriz(10, min, max);
            matriz_chica = crearMatriz(3, min, max);

            System.out.println("");
            System.out.println("Matriz grande: ");
            mostrar(matriz_grande);
            System.out.println("Matriz pequeña: ");
            mostrar(matriz_chica);

            encontrado = buscar(matriz_grande, matriz_chica);

        } while (encontrado == false);
    }

    public static int[][] crearMatriz(int n, int min, int max) {
        Random random = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matriz;
    }

    public static void mostrar(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean buscar(int[][] matriz_grande, int[][] matriz_chica){
        int fila = 0;
        int columna = 0;
        boolean encontrado = false;
        // Recorremos la matriz grande hasta el tamaño de la matriz grande menos el tamaño de la matriz chica
        for_grande:
        for (int i = 0; i < matriz_grande.length-matriz_chica.length; i++){
            for (int j = 0; j < matriz_grande[i].length-matriz_chica.length; j++){
                // Verifico si coincide el primer elemento de la matriz pequeña con el elemento de la matriz grande
                if (matriz_grande[i][j] == matriz_chica[0][0]){
                    //Guardo fila y columna
                    fila = i;
                    columna = j;
                    // Recorro la porcion de matriz grande con el tamaño de la matriz pequeña
                    for_chico:
                    for (int k = i; k<i+matriz_chica.length; k++){
                        for (int l = j; l<j+matriz_chica[0].length; l++){
                            // Verifico si coincide el elemento de la matriz pequeña con el elemento de la matriz grande
                            if (matriz_grande[k][l] == matriz_chica[k-i][l-j]){
                                encontrado = true;
                            } else {
                                encontrado = false;
                                break for_chico;
                            }
                        }
                    }
                    //Salgo del for grande si es correcto
                    if (encontrado){
                        break for_grande;
                    }
                }
            }
        }

        if (encontrado){
            System.out.println("La matriz pequeña se encuentra en la fila "+fila+" y la columna "+columna);
            for (int i = 0; i <matriz_grande.length; i++){
                for (int j = 0; j < matriz_grande[i].length; j++){
                    //Muestro con color la matriz chica dentro de la matriz matriz_grande
                    if (i >= fila && i < fila+matriz_chica.length && j >= columna && j < columna+matriz_chica[0].length){
                        System.out.print("\033[31m"+matriz_grande[i][j]+"\033[0m");
                    } else {
                        System.out.print(matriz_grande[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }

        return encontrado;
    }

        
}