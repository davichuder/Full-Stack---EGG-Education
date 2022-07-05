/* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/

public class ejercicio_extra12 {
    public static void main(String[] args) {

        /*String frase;
        String caracter1;
        String caracter2;
        String caracter3;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if (i==3){caracter1 = "E";} else {caracter1 = Integer.toString(i);}
                    if (j==3){caracter2 = "E";} else {caracter2 = Integer.toString(j);}
                    if (k==3){caracter3 = "E";} else {caracter3 = Integer.toString(k);}
                    frase = caracter1 + "-" + caracter2 + "-" + caracter3;
                    System.out.println(frase);
                }
            }
        }*/

        String [] frase = new String[10];
        for (int i = 0; i <10; i++){
            frase[i] = Integer.toString(i);
            if (frase[i].equals("3")){
                frase[i] = "E";
            }
        }

        for (int i = 0; i <10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    System.out.println(frase[i] + "-" + frase[j] + "-" + frase[k]);
                }
            }
        }

    } 
}