package multithreading.synchronization.mutual_exclusive.synchronized_method;

public class BookTheatreSeat {

    int totalSeats = 10;

    synchronized void bookSeats(int seats) {
        if(totalSeats >= seats) {
            System.out.println(seats + " seats booked successfully");
            totalSeats = totalSeats - seats;
            System.out.println("seats left : " + totalSeats);
        } else {
            System.out.println("not enough seats to book");
            System.out.println("seats left : " + totalSeats);
        }
    }
}
