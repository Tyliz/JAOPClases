package Sesion8.Decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear() {
        System.out.println("Basico");
        tengoGSM();
        tengoSMS();
    }

    public void tengoGSM() {
        System.out.println("\t->GSM");
    }

    public void tengoSMS() {
        System.out.println("\t->SMS");
    }
}
