package Sesion9.Observer;

public class ReceptorSatelite implements Receptor {
    @Override
    public void recive() {
        System.out.println("Satelite recive");
    }
}
