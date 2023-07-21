package multithreading.synchronization.mutual_exclusive.synchronized_method;

public class SeatBookingApp extends Thread {

    //this code shows the example of thread synchronization using synchronized method

    static BookTheatreSeat bookTheatreSeat;
    int seats;

    @Override
    public void run() {
        bookTheatreSeat.bookSeats(seats);
    }

    public static void main(String[] args) {

        bookTheatreSeat = new BookTheatreSeat();

        SeatBookingApp customer1 = new SeatBookingApp();
        customer1.seats = 7;
        customer1.start();

        SeatBookingApp customer2 = new SeatBookingApp();
        customer2.seats = 6;
        customer2.start();

        //one thread will acquire the lock of resource object and other threads
        //need to wait for it until it completes its execution and release the lock

    }
}
