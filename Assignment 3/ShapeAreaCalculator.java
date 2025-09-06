interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Shape {
    double side;

    void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.printf("Circle Area = %.1f\n", c.calculateArea());

        Rectangle r = new Rectangle();
        r.setDimensions(10, 5);
        System.out.println("Rectangle Area = " + r.calculateArea());

        Square s = new Square();
        s.setSide(4);
        System.out.println("Square Area = " + s.calculateArea());
    }
}
