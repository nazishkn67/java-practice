package multithreading.synchronization.inter_thread_communication;

public class BookingApp {

    //this code shows the example of inter-thread communication

    public static void main(String[] args) throws InterruptedException {
        TotalEarnings totalEarnings = new TotalEarnings();
        totalEarnings.start();

        synchronized (totalEarnings) {
            totalEarnings.wait();
        }
        System.out.println("Total earnings : " + totalEarnings.totalEarnings + " Rs");

        //wait() method will stop the current thread(main) and release the lock
        //main thread will go in paused state until another thread completes its execution,
        //notify the waiting thread and release the lock
    }
}
