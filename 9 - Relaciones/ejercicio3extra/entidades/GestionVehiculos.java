// b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca, 
// modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
package ejercicio3extra.entidades;

import ejercicio3extra.enums.MenuVehiculos;
import ejercicio3extra.servicios.Utilidades;

public class GestionVehiculos {
    private static Database database;

    public static boolean opcion(Database db, int opcion) {
        database = db;
        switch (opcion) {
            case 0:
                return false;
            case 1:
                agregarVehiculo();
                break;
            case 2:
                modificarVehiculo();
                break;
            case 3:
                eliminarVehiculo();
                break;
            case 4:
                mostrarVehiculos();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        return true;
    }

    private static int verificarVehiculo(int numero_motor, int numero_chasis) {
        int posicion = 0;
        for (Vehiculo vehiculo : database.getVehiculos()) {
            if (vehiculo.getNumero_motor() == numero_motor && vehiculo.getNumero_chasis() == numero_chasis)
                return posicion;
            posicion++;
        }
        return -1;
    }

    private static void agregarVehiculo() {
        int numero_motor = Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROMOTOR.toString());
        int numero_chasis = Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROCHASIS.toString());
        if (verificarVehiculo(numero_motor, numero_chasis) == -1) {
            database.getVehiculos()
                    .add(new Vehiculo(numero_motor,
                            numero_chasis,
                            Utilidades.ingresarString(MenuVehiculos.INGRESEMARCA.toString()),
                            Utilidades.ingresarString(MenuVehiculos.INGRESEMODELO.toString()),
                            Utilidades.ingresarInt(MenuVehiculos.INGRESEAÑO.toString()),
                            Utilidades.ingresarString(MenuVehiculos.INGRESECOLOR.toString()),
                            Utilidades.ingresarString(MenuVehiculos.INGRESETIPO.toString())));
        } else {
            System.out.println("El vehiculo ya existe");
            Utilidades.presionarEnter();
        }
    }

    private static void mostrarVehiculos() {
        for (Vehiculo cliente : database.getVehiculos()) {
            System.out.println(cliente);
        }
        Utilidades.presionarEnter();
    }

    private static void modificarVehiculo() {
        int numero_motor = Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROMOTOR.toString());
        int numero_chasis = Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROCHASIS.toString());
        int posicion = verificarVehiculo(numero_motor, numero_chasis);
        if (posicion == -1) {
            System.out.println("El vehiculo no existe");
            Utilidades.presionarEnter();
        } else {
            Vehiculo vehiculo = database.getVehiculos().get(posicion);
            vehiculo.setNumero_motor(Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROMOTOR.toString()));
            vehiculo.setNumero_chasis(Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROCHASIS.toString()));
            vehiculo.setAño(Utilidades.ingresarInt(MenuVehiculos.INGRESEAÑO.toString()));
            vehiculo.setColor(Utilidades.ingresarString(MenuVehiculos.INGRESECOLOR.toString()));
            vehiculo.setMarca(Utilidades.ingresarString(MenuVehiculos.INGRESEMARCA.toString()));
            vehiculo.setModelo(Utilidades.ingresarString(MenuVehiculos.INGRESEMODELO.toString()));
            vehiculo.setTipo(Utilidades.ingresarString(MenuVehiculos.INGRESETIPO.toString()));
        }
    }

    private static void eliminarVehiculo() {
        int numero_motor = Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROMOTOR.toString());
        int numero_chasis = Utilidades.ingresarInt(MenuVehiculos.INGRESENUMEROCHASIS.toString());
        if (!database.getVehiculos()
                .removeIf(x -> (x.getNumero_motor() == numero_motor && x.getNumero_chasis() == numero_chasis)))
            System.out.println("El cliente no existe");
    }
}
