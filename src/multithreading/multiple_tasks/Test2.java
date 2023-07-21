package multithreading.multiple_tasks;

public class Test2 extends Thread {

    @Override
    public void run() {
        System.out.println("this is the 2nd thread");
        System.out.println(Thread.currentThread().getName());
    }

}
