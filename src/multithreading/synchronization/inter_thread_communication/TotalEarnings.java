package multithreading.synchronization.inter_thread_communication;

public class TotalEarnings extends Thread {

    int totalSeats = 10;
    int totalEarnings = 0;

    //notify() method will notify single paused thread to wake up and start executing

    @Override
    public void run() {

        synchronized (this) {
            for(int i=1; i<=totalSeats; i++)
                totalEarnings = totalEarnings + 100;
            this.notify();
        }
    }
}
