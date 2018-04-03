package org.faruk.before;

public class Car {

    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void start(){
        engine.turnOn();
    }

    public void stop(){
        engine.turnOff();
    }
}