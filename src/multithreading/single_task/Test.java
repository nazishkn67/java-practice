package multithreading.single_task;
import java.time.LocalTime;

public class Test extends Thread {

    //this is the example of performing single task using multiple threads
    //we can also perform single task using single thread here only by just having only 1 thread

    @Override
    public void run() {
        LocalTime time = LocalTime.now();
        System.out.println("this is task 1 : " + time);     //task 1
    }

    public static void main(String[] args) {
        System.out.println("this is the main thread");

        Test test1 = new Test();    //creating Thread-0
        test1.start();              //starting Thread-0

        Test test2 = new Test();    //creating Thread-1
        test2.start();              //starting Thread-1
    }

}
