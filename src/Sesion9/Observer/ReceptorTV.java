package Sesion9.Observer;

public class ReceptorTV implements Receptor {
    @Override
    public void recive() {
        System.out.println("TV recive.");
    }
}
