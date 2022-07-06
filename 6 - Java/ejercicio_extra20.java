/* . Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
public class ejercicio_extra20 {
    public static void main(String[] args) {
        int[] n = new int[10];
        rellenar(n);
        mostrar(n);        
    }

    public static void rellenar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random()*100);
        }
    }

    public static void mostrar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}