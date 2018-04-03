package org.faruk.after;

public class Main {

    public static void main(String[] args) {

        Engine petrolEngine = new PetrolEngine();

        Car car = new Car(petrolEngine);
        car.start();
        car.stop();
    }
}