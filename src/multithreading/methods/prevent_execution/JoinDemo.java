package multithreading.methods.prevent_execution;

public class JoinDemo extends Thread {

    static Thread mainThread;

    @Override
    public void run() {
        try {
            //Thread-0 will wait for main thread to complete its execution and join
            mainThread.join();
            for(int i=1; i<=5; i++) {
                System.out.println("child thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        mainThread = Thread.currentThread();

        JoinDemo childThread = new JoinDemo();
        childThread.start();

        try {
            for(int i=1; i<=5; i++) {
                System.out.println("main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
