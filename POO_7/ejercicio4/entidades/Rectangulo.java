package POO_7.ejercicio4.entidades;

public class Rectangulo {
    //Parametros
    private int base;
    private int altura;

    //Getters y setters
    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Constructor por defecto
    public Rectangulo(){}

    //toString
    @Override
    public String toString() {return "base=" + base + ", altura=" + altura + '}';}

    //Funcion para cargar base y altura para el rectangulo
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        this.base = Integer.parseInt(System.console().readLine());        
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = Integer.parseInt(System.console().readLine());
    }

    //Funcion para calcular perimetro del rectangulo
    public int perimetro(){return (this.base + this.altura) * 2;}
    
    //Funcion para calcular la superficie del rectangulo
    public int superficie(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return this.base * this.altura;
    }
}
