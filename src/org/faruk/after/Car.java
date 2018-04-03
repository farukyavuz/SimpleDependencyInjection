package org.faruk.after;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.turnOn();
    }

    public void stop(){
        engine.turnOff();
    }
}