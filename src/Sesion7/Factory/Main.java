package Sesion7.Factory;

public class Main {
    public static void main(String[] args) {
        PrecioFactory precioEspanna = new PrecioFactory("España");
        PrecioFactory precioUSA = new PrecioFactory("USA");

        System.out.println(precioEspanna.getPrecio());
        System.out.println(precioUSA.getPrecio());
    }
}
