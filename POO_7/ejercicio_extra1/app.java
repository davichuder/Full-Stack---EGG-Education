/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
*/
package POO_7.ejercicio_extra1;

import POO_7.ejercicio_extra1.entidades.Cancion;
 
public class app {
    public static void main(String[] args){
        Cancion cancion = new Cancion("Cancion 1", "Autor 1");
        System.out.println(cancion.getTitulo());
        System.out.println(cancion.getAutor());
    }
}
