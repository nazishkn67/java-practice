package multithreading.methods.interrupt_thread_execution;

public class IsInterruptedDemo extends Thread {

    //isInterrupted() method checks the interrupted status only

    @Override
    public void run() {
        try {
            System.out.println("Thread interrupted : " + Thread.currentThread().isInterrupted());
            System.out.println("Thread interrupted : " + Thread.currentThread().isInterrupted());
            for(int i=1; i<=5; i++) {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        IsInterruptedDemo isInterruptedDemo = new IsInterruptedDemo();
        isInterruptedDemo.start();
        isInterruptedDemo.interrupt();  //interrupt the executing thread
    }
}
