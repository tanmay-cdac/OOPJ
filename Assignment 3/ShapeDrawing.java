abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        c.draw();

        Rectangle r = new Rectangle();
        r.setDimensions(5, 10);
        r.draw();
    }
}
