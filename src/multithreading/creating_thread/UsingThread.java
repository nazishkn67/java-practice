package multithreading.creating_thread;

public class UsingThread extends Thread {

    @Override
    public void run() {
        System.out.println("some task to perform");     //task 1
    }

    public static void main(String[] args) {

        UsingThread threadObj = new UsingThread();    //creating thread
        threadObj.start();                            //starting thread via start() method
    }

}
