package multithreading.synchronization.mutual_exclusive.static_synchronization;

public class MyThread2 extends Thread {

    BookTheatreSeat b;
    int seats;

    MyThread2(BookTheatreSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.bookSeats(seats);
    }

}
