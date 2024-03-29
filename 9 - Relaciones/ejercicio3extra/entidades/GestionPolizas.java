// c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un 
// vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de 
// póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
// asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra 
// terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las 
// relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de 
// muchos a uno o de muchos a muchos.  
package ejercicio3extra.entidades;

import java.util.stream.Collectors;

import ejercicio3extra.enums.MenuPolizas;
import ejercicio3extra.servicios.Utilidades;

public class GestionPolizas {
    private static Database database;

    public static boolean opcion(Database db, int opcion) {
        database = db;
        switch (opcion) {
            case 0:
                return false;
            case 1:
                agregarPoliza();
                break;
            case 2:
                modificarPoliza();
                break;
            case 3:
                eliminarPoliza();
                break;
            case 4:
                mostrarPolizas();
            default:
                System.out.println("Ingrese una opcion valida");
        }
        return true;
    }

    private static int verificarPoliza(int numero_poliza) {
        int posicion = 0;
        for (Poliza vehiculo : database.getPolizas()) {
            if (vehiculo.getNumero_poliza() == numero_poliza)
                return posicion;
            posicion++;
        }
        return -1;
    }

    private static void agregarPoliza() {
        int numero_poliza = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROPOLIZA.toString());
        if (verificarPoliza(numero_poliza) == -1) {
            int numero_motor = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROMOTOR.toString());
            int numero_chasis = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROCHASIS.toString());
            Vehiculo vehiculo;
            try {
                vehiculo = database.getVehiculos().stream()
                        .filter(x -> (x.getNumero_chasis() == numero_chasis && x.getNumero_motor() == numero_motor))
                        .collect(Collectors.toList())
                        .get(0);
            } catch (Exception e) {
                System.out.println("Ingrese un numero de chasis y motor validos");
                return;
            }
            int documento = Utilidades.ingresarInt(MenuPolizas.INGRESEDOCUMENTO.toString());
            Cliente cliente;
            try {
                cliente = database.getClientes().stream()
                        .filter(x -> (x.getDocumento() == documento))
                        .collect(Collectors.toList())
                        .get(0);
            } catch (Exception e) {
                System.out.println("Ingrese un documento valido");
                return;
            }
            database.getPolizas()
                    .add(new Poliza(
                            vehiculo,
                            cliente,
                            numero_poliza,
                            Utilidades.ingresarString(MenuPolizas.INGRESEFECHAINICIO.toString()),
                            Utilidades.ingresarString(MenuPolizas.INGRESEFECHAFIN.toString()),
                            Utilidades.ingresarInt(MenuPolizas.INGRESECANTIDADCUOTAS.toString()),
                            Utilidades.ingresarInt(MenuPolizas.INGRESEMONTOASEGURADO.toString()),
                            Utilidades.ingresarString(MenuPolizas.INGRESETIPOCOBERTURA.toString())));
        } else {
            System.out.println("La poliza ya existe");
            Utilidades.presionarEnter();
        }
    }

    private static void mostrarPolizas() {
        for (Poliza cliente : database.getPolizas()) {
            System.out.println(cliente);
        }
        Utilidades.presionarEnter();
    }

    private static void modificarPoliza() {
        int numero_poliza = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROPOLIZA.toString());
        int posicion = verificarPoliza(numero_poliza);
        if (posicion == -1) {
            System.out.println("La poliza no existe");
            Utilidades.presionarEnter();
        } else {
            int numero_motor = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROMOTOR.toString());
            int numero_chasis = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROCHASIS.toString());
            Vehiculo vehiculo;
            try {
                vehiculo = database.getVehiculos().stream()
                        .filter(x -> (x.getNumero_chasis() == numero_chasis && x.getNumero_motor() == numero_motor))
                        .collect(Collectors.toList())
                        .get(0);
            } catch (Exception e) {
                System.out.println("Ingrese un numero de chasis y motor validos");
                return;
            }
            int documento = Utilidades.ingresarInt(MenuPolizas.INGRESEDOCUMENTO.toString());
            Cliente cliente;
            try {
                cliente = database.getClientes().stream()
                        .filter(x -> (x.getDocumento() == documento))
                        .collect(Collectors.toList())
                        .get(0);
            } catch (Exception e) {
                System.out.println("Ingrese un documento valido");
                return;
            }
            Poliza poliza = database.getPolizas().get(posicion);
            poliza.setVehiculo(vehiculo);
            poliza.setCliente(cliente);
            poliza.setNumero_poliza(numero_poliza);
            poliza.setFecha_inicio(Utilidades.ingresarString(MenuPolizas.INGRESEFECHAINICIO.toString()));
            poliza.setFecha_fin(Utilidades.ingresarString(MenuPolizas.INGRESEFECHAFIN.toString()));
            poliza.setCantidad_cuotas(Utilidades.ingresarInt(MenuPolizas.INGRESECANTIDADCUOTAS.toString()));
            poliza.setMonto_asegurado(Utilidades.ingresarInt(MenuPolizas.INGRESEMONTOASEGURADO.toString()));
            poliza.setTipo_cobertura(Utilidades.ingresarString(MenuPolizas.INGRESETIPOCOBERTURA.toString()));
        }
    }

    private static void eliminarPoliza() {
        int numero_poliza = Utilidades.ingresarInt(MenuPolizas.INGRESENUMEROPOLIZA.toString());
        if (!database.getPolizas().removeIf(x -> (x.getNumero_poliza() == numero_poliza)))
            System.out.println("El cliente no existe");
    }
}
