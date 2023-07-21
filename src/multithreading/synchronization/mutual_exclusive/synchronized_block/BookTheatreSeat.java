package multithreading.synchronization.mutual_exclusive.synchronized_block;

public class BookTheatreSeat {

    int totalSeats = 10;

    public void bookSeats(int seats) {

        System.out.println(Thread.currentThread().getName() + " start");
        System.out.println(Thread.currentThread().getName() + " start");
        System.out.println(Thread.currentThread().getName() + " start");
        System.out.println(Thread.currentThread().getName() + " start");
        //1000 lines of code

        synchronized (this) {
            if(totalSeats >= seats) {
                System.out.println(seats + " seats booked successfully");
                totalSeats = totalSeats - seats;
                System.out.println("seats left : " + totalSeats);
            } else {
                System.out.println("not enough seats to book");
                System.out.println("seats left : " + totalSeats);
            }
        }

        //1000 lines of code
        System.out.println(Thread.currentThread().getName() + " end");
        System.out.println(Thread.currentThread().getName() + " end");
        System.out.println(Thread.currentThread().getName() + " end");
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
