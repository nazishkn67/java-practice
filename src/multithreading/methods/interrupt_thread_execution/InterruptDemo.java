package multithreading.methods.interrupt_thread_execution;

public class InterruptDemo extends Thread {

    @Override
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        InterruptDemo interruptDemo = new InterruptDemo();
        interruptDemo.start();
        interruptDemo.interrupt();  //interrupt the executing thread
    }
}
