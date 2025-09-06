class Shape {
    double area() {
		return 0;
    }
}

class Rectangle extends Shape {
    double area(double length, double breadth) {
        return length * breadth;
    }
}

class Circle extends Shape {
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class ShapeAreaCalculation {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Rectangle Area = " + rect.area(5, 10));
        System.out.printf("Circle Area = %.2f\n", circle.area(7));
    }
}
