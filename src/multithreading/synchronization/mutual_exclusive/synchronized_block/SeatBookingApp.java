package multithreading.synchronization.mutual_exclusive.synchronized_block;

public class SeatBookingApp extends Thread {

    //this code shows the example of thread synchronization using synchronized block

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

        //it works same as the synchronized method, just the scope is only within the synchronized block
        //it is used when we need to synchronized only some part of the code
        //it reduces waiting time for threads and increase performance
    }
}
