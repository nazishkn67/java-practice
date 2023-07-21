package multithreading.synchronization;

public class SeatBookingApp extends Thread {

    //this code shows the problem arising without synchronization

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

        //both threads will run concurrently resulting in data inconsistency
        //this can be resolved using thread synchronization
        //it is of two types - mutual exclusive & cooperation (inter-thread communication)
    }
}
