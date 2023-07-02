package Prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "BMW";
        coche.modelo = "Alguno";
        coche.puertas = 3;

        System.out.println(coche);

        Coche clonado;
        try {
            clonado = coche.clonar();
            clonado.puertas = 4;

            System.out.println(clonado);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
