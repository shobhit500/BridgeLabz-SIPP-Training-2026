abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
    double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double perimeter() {
        return a + b + c;
    }
}

public class Shape_hierarchy {
    public static void main(String[] args) {
        Shape arr[] = new Shape[3];
        arr[0] = new Circle(5);
        arr[1] = new Rectangle(4, 6);
        arr[2] = new Triangle(3, 4, 5);
        for (Shape s : arr) {
            System.out.println("Area = " + s.area());
            System.out.println("Perimeter = " + s.perimeter());
        }
    }
}