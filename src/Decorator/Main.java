package Decorator;

public class Main {
    public static void main(String[] args) {
        TelefonoBasico basico = new TelefonoBasico();
        System.out.println(basico);

        TelefonoNextGen nextGen =  new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));

        System.out.println(nextGen);
    }
}
