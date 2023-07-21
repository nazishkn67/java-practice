package multithreading.methods.interrupt_thread_execution;

public class InterruptedDemo extends Thread {

    //interrupted() method checks and clear the interrupted status from true to false,
    //if interrupted

    @Override
    public void run() {
        try {
            System.out.println("Thread interrupted : " + Thread.interrupted());
            System.out.println("Thread interrupted : " + Thread.interrupted());
            for(int i=1; i<=5; i++) {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        InterruptedDemo interruptedDemo = new InterruptedDemo();
        interruptedDemo.start();
        interruptedDemo.interrupt();  //interrupt the executing thread
    }
}
