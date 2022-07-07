/*  Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
*/
public class ejercicio_extra22 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] matriz = new int[n][m];
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                suma += matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma de los elementos de la matriz: " + suma);
    }
}