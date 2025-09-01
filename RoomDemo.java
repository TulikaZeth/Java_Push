class Room {

    private int roomNo;
    private String roomType;
    private double roomArea;
    private boolean hasACMachine;
    public void setData(int roomNo, String roomType, double roomArea, boolean hasACMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.hasACMachine = hasACMachine;
    }

    public void displayData() {
        System.out.println("Room Details:");
        System.out.println("------------------------");
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " square feet");
        System.out.println("AC Machine: " + (hasACMachine ? "Yes" : "No"));
        System.out.println("------------------------");
    }
}
public class RoomDemo {
    public static void main(String[] args) {

        Room room1 = new Room();
        Room room2 = new Room();
        System.out.println("Setting data for Room 1:");
        room1.setData(101, "Deluxe", 300.5, true);
        room1.displayData();
        System.out.println("\nSetting data for Room 2:");
        room2.setData(102, "Standard", 250.0, false);
        room2.displayData();
    }
}
