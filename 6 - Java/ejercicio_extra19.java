/* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
*/
public class ejercicio_extra19 {
    public static void main(String[] args) {
        int[] n1 = new int[3];
        int[] n2 = new int[3];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = (int) (Math.random()*10);
            n2[i] = (int) (Math.random()*10);
        }

        mostrar(n1, n2);

        boolean igual;
        igual = iguales(n1, n2);

        if(igual){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores no son iguales");
        }
        
    }

    public static void mostrar(int[] n1, int[] n2){
        for (int i = 0; i < n1.length; i++) {
            System.out.println(n1[i]+" "+n2[i]);
        }
    }

    public static boolean iguales(int[] n1, int[] n2){
        boolean iguales = true;
        for (int i = 0; i < n1.length; i++) {
            if(n1[i] != n2[i]){
                iguales = false;
                break;
            }
        }
        return iguales;
    }
}