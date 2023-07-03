package Sesion7.Builder;

import Sesion7.Builder.abstracta.Empleado;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new CocheBuilder("BMW")
            .setPuertas(5)
            .setMotor("electrico")
            .build();

        System.out.println(coche);

        // Investigacion para hacerlo con clase abstracta
        Empleado empleado = new Empleado.Builder()
            .setNombre("Ismael")
            .setEdad(27)
            .setDireccion("Calle 1024")
            .setRol("Desarrollador Jr.")
            .build();

        System.out.println(empleado);
    }
}
