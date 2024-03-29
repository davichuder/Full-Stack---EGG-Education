/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes. 
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

package ejercicio4;

import ejercicio4.entidades.Rectangulo;

public class app {
    
    public static void main(String[] args) {
        //Creo objeto rectangulo
        Rectangulo rectangulo = new Rectangulo();
        //Llamo al metodo para crear el rectangulo
        rectangulo.crearRectangulo();
        //Llamo al metodo para calcular el perimetro, y area
        System.out.println("Perimetro: " + rectangulo.perimetro());
        System.out.println("Superficie: " + rectangulo.superficie());
    }
    
}
