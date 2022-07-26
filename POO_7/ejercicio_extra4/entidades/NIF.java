package POO_7.ejercicio_extra4.entidades;

public class NIF {
    //Parametros
    private long dni;
    private char letra;

    //Getters and Setters
    public long getdni() {
        return dni;
    }
    public void setdni(long dni) {
        this.dni = dni;
    }
    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }

    //Constructor
    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra();
    }

    //Vector de letras
    private char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    //Metodo para calcular la letra
    public char calcularLetra() {
        int resto = (int) (dni % 23);
        return letras[resto];
    }

    //Metodo para mostrar el NIF
    public void mostrar(){
        System.out.println(dni + "-" + letra);
    }
    
}
