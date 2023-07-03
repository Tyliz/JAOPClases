package Sesion9.State;

public class Main {
    public static void main(String[] args) {
        Telefono telefono1 = new Telefono();
        System.out.println(telefono1.estado.desbloquear());
        System.out.println(telefono1.estado.abrirCamara());
        System.out.println(telefono1.estado.tomarFoto());
        System.out.println(telefono1.estado.tomarFoto());
    }
}
