package multithreading.multiple_tasks;
import java.time.LocalTime;

public class Test1 extends Thread {

    @Override
    public void run() {
        LocalTime time = LocalTime.now();
        System.out.println("this is the 1st task");
        System.out.println(Thread.currentThread().getName() + " : " + time);
    }
}
