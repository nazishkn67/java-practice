package multithreading.methods.prevent_execution;

public class SleepDemo extends Thread {

    @Override
    public void run() {
        try {
            for(int i=1; i<=10; i++) {
                Thread.sleep(1000);
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        SleepDemo sleepDemo = new SleepDemo();
        sleepDemo.start();
    }
}
