package multithreading.methods.basic_and_naming_methods;

public class Test extends Thread {

    @Override
    public void run() {
        System.out.println("some task to perform");
        System.out.println("Thread name : " + Thread.currentThread().getName());    //get thread name
        //currentThread gives current thread reference
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.start();                           //starting thread
        test.setName("child thread");           //set thread name
        System.out.println("Thread name : " + Thread.currentThread().getName());
        System.out.println("Is child thread alive :" + test.isAlive());     //check thread is alive or not
    }
}
