/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
*/
public class ejercicio_extra18 {
    public static void main(String[] args) {
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random()*100);
        }

        mostrar(n);
        sumar(n);
    }

    public static void mostrar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }

    public static void sumar(int[] n) {
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma += n[i];
        }
        System.out.println("La suma es: " + suma);
    }
}