package Sesion9.Observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisora.ingresaReceptor(tv);
        emisora.ingresaReceptor(radio);
        emisora.ingresaReceptor(satelite);

        emisora.emite();
    }
}
