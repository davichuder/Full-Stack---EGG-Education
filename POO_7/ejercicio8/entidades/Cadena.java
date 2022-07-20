package POO_7.ejercicio8.entidades;

public class Cadena {
    //Parametros
    private String frase;
    private int longitud;

    //Getters y setters
    public String getFrase() {
        return this.frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    public int getLongitud() {
        return this.longitud;
    }

    //Constructor por defecto
    public Cadena() {}

    //Constructor con frase
    public Cadena(String frase){
        this.frase = frase;
        this.longitud = frase.length();
    }

    //toString
    public String toString(){
        return "Frase: " + this.frase + " Longitud: " + this.longitud;
    }
    
    //Metodo mostrarVocales
    public int mostrarVocales(){
        int contador = 0;
        for(int i = 0; i < this.frase.length(); i++){
            if(this.frase.charAt(i) == 'a' || this.frase.charAt(i) == 'e' || this.frase.charAt(i) == 'i' || this.frase.charAt(i) == 'o' || this.frase.charAt(i) == 'u'){
                contador++;
            }
        }
        return contador;
    }

    //Metodo invertirFrase
    public void invertirFrase(){
        String fraseInvertida = "";
        for(int i = this.frase.length() - 1; i >= 0; i--){
            fraseInvertida += this.frase.charAt(i);
        }
        System.out.println("Entrada: " + this.frase + " Salida: " + fraseInvertida);
    }

    //Metodo vecesRepetido
    public void vecesRepetido(String letra){
        int contador = 0;
        for(int i = 0; i < this.frase.length(); i++){
            if(this.frase.charAt(i) == letra.charAt(0)){
                contador++;
            }
        }
        System.out.println("Frase: " + this.frase + " Salida: El caracter '" + letra + "' se repite " + contador + " veces.");
    }

    //Metodo compararLongitud
    public void compararLongitud(String frase){
        if(this.longitud > frase.length()){
            System.out.println("La frase: " + this.frase + " es mas larga que la frase: " + frase);
        }else if(this.longitud < frase.length()){
            System.out.println("La frase: " + this.frase + " es mas corta que la frase: " + frase);
        }else{
            System.out.println("La frase: " + this.frase + " es igual de larga que la frase: " + frase);
        }
    }

    //Metodo unirFrases
    public void unirFrases(String frase){
        String cadena = this.frase + " " + frase;
        System.out.println("Frase: " + this.frase + " Salida: " + cadena);
    }

    //Metodo reemplazar
    public void reemplazar(String letra){
        String cadena = "";
        for(int i = 0; i < this.frase.length(); i++){
            if(this.frase.charAt(i) == 'a'){
                cadena += letra;
            }else{
                cadena += this.frase.charAt(i);
            }
        }
        System.out.println("Frase: " + this.frase + " Salida: " + cadena);
    }

    //Metodo contiene
    public boolean contiene(String letra){
        boolean contiene = false;
        for(int i = 0; i < this.frase.length(); i++){
            if(this.frase.charAt(i) == letra.charAt(0)){
                contiene = true;
            }
        }
        return contiene;
    }
    
}
