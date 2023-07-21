package multithreading.methods.prevent_execution;

public class SleepDemo1 extends Thread {

    //sleep() method will pause & run both thread-0 and thread-1 simultaneously as
    //they are performing same task and executing same lines of code

    @Override
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SleepDemo1 threadObj1 = new SleepDemo1();
        threadObj1.start();

        SleepDemo1 threadObj2 = new SleepDemo1();
        threadObj2.start();

        //if we use run() instead of start(), main thread will not create any thread and
        //threadObj1 and threadObj2 will invoke run() method sequentially unlike threads
    }
}
