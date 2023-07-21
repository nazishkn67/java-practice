package multithreading.methods.priority_thread;

public class Test extends Thread {

    @Override
    public void run() {
        System.out.println("Child thread priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        System.out.println("multithreading.multiple_tasks.simple_calculator.Main thread old priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("multithreading.multiple_tasks.simple_calculator.Main thread new priority : " + Thread.currentThread().getPriority());

        Test test = new Test();
        test.start();
    }
}
