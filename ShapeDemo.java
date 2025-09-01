// Abstract base class Shape
abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract void draw();
    public abstract void erase();
}

// Circle subclass
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
        System.out.println("  ******  ");
        System.out.println(" *      * ");
        System.out.println("*        *");
        System.out.println(" *      * ");
        System.out.println("  ******  ");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Circle");
        System.out.println("------------------------");
    }
}

// Triangle subclass
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Triangle");
        System.out.println("------------------------");
    }
}

// Square subclass
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
        System.out.println("**********");
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("**********");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Square");
        System.out.println("------------------------");
    }
}

// Main class to demonstrate polymorphism
public class ShapeDemo {
    // Method that demonstrates polymorphic behavior
    public static void processShape(Shape shape) {
        System.out.println("\nProcessing shape...");
        shape.draw();
        shape.erase();
    }

    public static void main(String[] args) {
        // Create objects of different shapes
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        // Demonstrate polymorphism by calling processShape with different shapes
        processShape(circle);
        processShape(triangle);
        processShape(square);

        // Alternative demonstration using array of shapes
        System.out.println("\nDemonstrating with array of shapes:");
        Shape[] shapes = {new Circle(), new Triangle(), new Square()};
        
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
        }
    }
}
