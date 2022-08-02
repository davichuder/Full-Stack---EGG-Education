import entidades.Armadura;

public class app {
    public static void main(String[] args) {
        Armadura armadura = new Armadura();
        armadura.caminar();
        armadura.correr();
        armadura.propulsar();
        armadura.volar();
        armadura.mostrarEstado();
        armadura.estadoBateria();
        armadura.mostrarReactor();
    }
}