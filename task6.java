abstract class Vehicle {

    // abstract methods
    abstract void startEngine();
    abstract void stopEngine();
}

// Car class
class Car extends Vehicle {

    void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {

    void startEngine() {
        System.out.println("Motorcycle engine started with a self start.");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        bike.startEngine();
        bike.stopEngine();
    }
}