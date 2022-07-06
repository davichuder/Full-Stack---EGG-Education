/* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.
*/
public class ejercicio_extra21 {
    public static void main(String[] args) {
        int n_alumnos = 10;
        float[][] notas = new float[4][n_alumnos];
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = (int) (Math.random()*10);
            }
        }

        float[] nota_final = calcular_nota_final(notas);
        mostrar(notas, nota_final);
        aprobados_desaprobados(nota_final);
    }

    public static float[] calcular_nota_final(float[][] notas){
        float[] nota_final = new float[notas[0].length];
        for (int i = 0; i < nota_final.length; i++) {
            nota_final[i] = (float) ((notas[0][i] * 0.1) + (notas[1][i] * 0.15) + (notas[2][i] * 0.25) + (notas[3][i] * 0.5));
        }
        return nota_final;
    }

    public static void mostrar(float[][] notas, float[] notas_final){
        for (int i = 0; i < notas[0].length; i++) {
                System.out.println(notas[0][i] + " " + notas[1][i] + " " +notas[2][i] + " " + notas[3][i] + " "+notas_final[i]);
        }
    }

    public static void aprobados_desaprobados(float[] nota_final){
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < nota_final.length; i++) {
            if (nota_final[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }
}