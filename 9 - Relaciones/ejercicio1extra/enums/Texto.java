package ejercicio1extra.enums;

public enum Texto {
    NOVALIDO("Opcion no valida: Ingrese una opción valida"),
    TITULO("\nElija una opción"),
    SALIR_0("0 - Salir"),
    MOSTRARPERSONAS_1("1 - Mostrar personas"),
    MOSTRARPERROS_2("2 - Mostrar perros"),
    AGREGARPERSONA_3("3 - Agregar persona"),
    AGREGARPERRO_4("4 - Agregar perro"),
    ELIMINARPERSONA_5("5 - Eliminar persona"),
    ELIMINARPERRO_6("6 - Eliminar perro"),
    ADOPTARPERRO_7("7 - Adoptar perro"),
    DEVOLVERPERRO_8("8 - Devolver perro"),
    MENU(TITULO + "\n" +
            MOSTRARPERSONAS_1 + "\n" +
            MOSTRARPERROS_2 + "\n" +
            AGREGARPERSONA_3 + "\n" +
            AGREGARPERRO_4 + "\n" +
            ELIMINARPERSONA_5 + "\n" +
            ELIMINARPERRO_6 + "\n" +
            ADOPTARPERRO_7 + "\n" +
            DEVOLVERPERRO_8 + "\n" +
            SALIR_0),

    INGRESENOMBRE("Ingrese nombre"),
    INGRESEAPELLIDO("Ingrese apellido"),
    INGRESEEDAD("Ingrese edad"),
    INGRESEDOCUMENTO("Ingrese documento"),
    INGRESETAMAÑO("Ingrese tamaño"),
    INGRESERAZA("Ingrese raza"),

    ELIJAPERSONA("Elija una persona"),
    ELIJAPERRO("Elija un perro"),

    PERROYAADOPTADO("ERROR: Este perro ya fue adoptado, y tiene dueño"),
    NOADOPTADO("ERROR: Este perro no se puede devolver porque no fue adoptado");

    private String texto;

    private Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
