package multithreading.synchronization.mutual_exclusive.static_synchronization;

public class MyThread1 extends Thread {

    BookTheatreSeat b;
    int seats;

    MyThread1(BookTheatreSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.bookSeats(seats);
    }


}
