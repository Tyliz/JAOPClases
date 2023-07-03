package Adapter;

public class Lightbulb {
    boolean poweredOn = false;
    int voltage = 50;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
    }

    public void turnOff() {
        poweredOn = false;
        voltage = 0;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}
