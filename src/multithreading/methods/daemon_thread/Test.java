package multithreading.methods.daemon_thread;

public class Test extends Thread {

    @Override
    public void run() {

        if(Thread.currentThread().isDaemon())
            System.out.println("this is a daemon thread");
        else
            System.out.println("this is a child thread");
    }

    public static void main(String[] args) {

        System.out.println("this is the main thread");
        Test test = new Test();
        test.setDaemon(true);
        test.start();

        /* Note :
        *
        *    1.  We need to set thread as daemon before starting the thread else
        *        we will get IllegalThreadStateException
        *
        *    2.  We cannot set the main thread as daemon since
        *        it already started running once the main() method is invoked
        *
        *    3.  If the main thread does not have any task to perform then
        *        daemon thread will not execute
        *
        * */
    }
}
