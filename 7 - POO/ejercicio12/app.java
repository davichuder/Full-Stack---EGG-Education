/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos:  
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual. 
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.*/
package ejercicio12;

import ejercicio12.entidades.Persona;
import ejercicio12.servicios.PersonaServicio;

public class app {
    public static void main(String[] args) {
        // Creo servicio
        PersonaServicio personaServicio = new PersonaServicio();
        // Creo persona
        Persona persona = personaServicio.crearPersona();
        // Calculo edad
        System.out.println("La edad de " + persona.getNombre() + " es " + persona.calcularEdad() + " años");
        // Veo si es menor
        System.out.println("Es " + persona.getNombre() + " menor que 18 años? " + persona.menorQue(18));
        // Muestro persona
        persona.mostrarPersona();
    }
}
