class Vehicle {
    String brand;
    int speed;

    void setDetails(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    String modelType;

    void setModel(String modelType) {
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Car " + brand + " " + modelType + ", Speed=" + speed);
    }
}

class Bike extends Vehicle {
    String modelType;

    void setModel(String modelType) {
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Bike " + brand + " " + modelType + ", Speed=" + speed);
    }
}

public class VehicleTypes {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDetails("Honda", 180);
        car.setModel("Civic");
        car.display();

        Bike bike = new Bike();
        bike.setDetails("Yamaha", 120);
        bike.setModel("R15");
        bike.display();
    }
}
