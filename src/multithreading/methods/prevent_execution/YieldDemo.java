package multithreading.methods.prevent_execution;

public class YieldDemo extends  Thread {

    @Override
    public void run() {
        for(int i=1; i<=5; i++)
            System.out.println(Thread.currentThread().getName() + " : " + i);
    }

    public static void main(String[] args) {

        YieldDemo yieldDemo = new YieldDemo();
        yieldDemo.start();

        Thread.yield();
        for(int i=1; i<=5; i++)
            System.out.println(Thread.currentThread().getName() + " : " + i);

    }
}
