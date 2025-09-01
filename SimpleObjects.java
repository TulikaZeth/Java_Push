class SimpleObject {
    // Instance variable to store object number
    private int objectNumber;
    private static int counter = 0;  // Static variable to count objects

    // Default constructor
    public SimpleObject() {
        counter++;
        objectNumber = counter;
        System.out.println("Object " + objectNumber + ": Default constructor called");
        displayMessage("Hello from default constructor!");
    }

    // Parameterized constructor with one parameter
    public SimpleObject(String message) {
        counter++;
        objectNumber = counter;
        System.out.println("Object " + objectNumber + ": Parameterized constructor called");
        displayMessage(message);
    }

    // Method to display messages
    private void displayMessage(String message) {
        System.out.println("Message for Object " + objectNumber + ": " + message);
        System.out.println("----------------------------------------");
    }
}

public class SimpleObjects {
    public static void main(String[] args) {
        // Creating objects using different constructors
        System.out.println("Creating first object:");
        SimpleObject obj1 = new SimpleObject();

        System.out.println("\nCreating second object:");
        SimpleObject obj2 = new SimpleObject("Custom message for second object");

        System.out.println("\nCreating third object:");
        SimpleObject obj3 = new SimpleObject("Another custom message");

        System.out.println("\nAll objects have been created successfully!");
    }
}
