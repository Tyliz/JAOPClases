package Sesion9.Mediator;

public class ColegaConcreto2 extends Colega {
    @Override
    void recibe() {
        System.out.println("Recibi un mensaje soy colega concreto 2");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto 2, envio un mensaje");
        mediator.reenvia(this);
    }
}
