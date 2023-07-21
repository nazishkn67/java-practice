package multithreading.synchronization.mutual_exclusive.static_synchronization;

public class BookTheatreSeat {

    static int totalSeats = 20;

    static synchronized void bookSeats(int seats) {
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
