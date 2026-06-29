import java.util.Scanner;

interface Area {
    void calculateArea();
}

class Square implements Area {
    int side;

    Square(int side) {
        this.side = side;
    }

    public void calculateArea() {
        System.out.println("Area of Square = " + (side * side));
    }
}

class Rectangle implements Area {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Circle implements Area {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class AreaInterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        Area s = new Square(side);
        s.calculateArea();

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        Area r = new Rectangle(length, breadth);
        r.calculateArea();

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Area c = new Circle(radius);
        c.calculateArea();

        sc.close();
    }
}