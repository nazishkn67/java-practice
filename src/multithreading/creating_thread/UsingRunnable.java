package multithreading.creating_thread;

public class UsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("some task to perform");     //task 1
    }

    public static void main(String[] args) {

        UsingRunnable threadObj = new UsingRunnable();    //creating class instance
        Thread thread = new Thread(threadObj);            //creating thread using Thread(Runnable target) constructor
        thread.start();                                   //starting thread via start() method
    }
}
