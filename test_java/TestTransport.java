//package Oops.Interface;

abstract class TransportBooking {
    String bookingId;
    double amount;
    TransportBooking(String bookingId, double amount) {
        this.bookingId = bookingId;
        this.amount = amount;
    }
    void showDetails() {
        System.out.println("Booking ID: " + bookingId + ", Amount: " + amount);
    }

    abstract void book();
    abstract void cancel();
}

interface Refundable {
    void refund();
}

interface Confirmable {
    void confirm();
}

class CabBooking extends TransportBooking implements Refundable {
    CabBooking(String bookingId, double amount) {
        super(bookingId, amount);
    }

    @Override
    void book() {
        System.out.println("Cab booked.");
    }

    @Override
    void cancel() {
        System.out.println("Cab booking cancelled.");
    }

    @Override
    public void refund() {
        System.out.println("Refund for Cab: 300");
    }
}

class TrainBooking extends TransportBooking implements Refundable, Confirmable {
    TrainBooking(String bookingId, double amount) {
        super(bookingId, amount);
    }

    @Override
    void book() {
        System.out.println("Train ticket booked.");
    }

    @Override
    void cancel() {
        System.out.println("Train booking cancelled.");
    }

    @Override
    public void refund() {
        System.out.println("Refund for Train: 1000");
    }

    @Override
    public void confirm() {
        System.out.println("Train ticket confirmed.");
    }
}

class BusBooking extends TransportBooking {
    BusBooking(String bookingId, double amount) {
        super(bookingId, amount);
    }

    @Override
    void book() {
        System.out.println("Bus booked.");
    }

    @Override
    void cancel() {
        System.out.println("Bus booking cannot be cancelled or rescheduled.");
    }

    void generateTicket() {
        System.out.println("Bus ticket generated.");
    }
}

public class TestTransport {
    public static void main(String[] args) {
        CabBooking cab = new CabBooking("CAB101", 500);
        TrainBooking train = new TrainBooking("TRN202", 1200);
        BusBooking bus = new BusBooking("BUS303", 200);

        cab.showDetails(); cab.book(); cab.cancel(); cab.refund();
        System.out.println();
        train.showDetails(); train.book(); train.confirm(); train.cancel(); train.refund();
        System.out.println();
        bus.showDetails(); bus.book(); bus.generateTicket(); bus.cancel();
    }
}
