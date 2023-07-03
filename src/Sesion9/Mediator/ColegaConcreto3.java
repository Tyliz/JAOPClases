package Sesion9.Mediator;

public class ColegaConcreto3 extends Colega {
    @Override
    void recibe() {
        System.out.println("Recibi un mensaje soy colega concreto 3");
    }

    @Override
    void envia() {
        System.out.println("Soy colega concreto 3, envio un mensaje");
        mediator.reenvia(this);
    }
}
