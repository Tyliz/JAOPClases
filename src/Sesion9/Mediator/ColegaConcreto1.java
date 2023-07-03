package Sesion9.Mediator;

public class ColegaConcreto1 extends Colega {
    @Override
    void recibe() {
        System.out.println("Recibi un mensaje soy colega concreto 1");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto 1, envio un mensaje");
        mediator.reenvia(this);
    }
}
