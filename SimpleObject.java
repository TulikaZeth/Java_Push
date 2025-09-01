public class SimpleObject {
    // Constructor with no parameters (default constructor)
    public SimpleObject() {
        System.out.println("This is a message from default constructor");
    }

    // Constructor with one parameter
    public SimpleObject(String message) {
        System.out.println("Message from parameterized constructor: " + message);
    }

    // Constructor with two parameters
    public SimpleObject(String message, int number) {
        System.out.println("Message from two-parameter constructor: " + message + ", Number: " + number);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        System.out.println("Creating first object...");
        SimpleObject obj1 = new SimpleObject();

        System.out.println("\nCreating second object...");
        SimpleObject obj2 = new SimpleObject("Hello World!");

        System.out.println("\nCreating third object...");
        SimpleObject obj3 = new SimpleObject("Testing constructor", 42);
    }
}
