class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

public class VechicleSpeedDisplay {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();

        c.displaySpeed();
        b.displaySpeed();
    }
}
