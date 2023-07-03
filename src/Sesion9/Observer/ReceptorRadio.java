package Sesion9.Observer;

public class ReceptorRadio implements Receptor {
    @Override
    public void recive() {
        System.out.println("Radio recive");
    }
}
