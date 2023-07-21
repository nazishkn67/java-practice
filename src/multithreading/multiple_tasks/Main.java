package multithreading.multiple_tasks;

public class Main {

    //this is the example of performing multiple tasks using multiple threads
    //multiple tasks using single thread is not possible

    public static void main(String[] args) {
        System.out.println("this is the main thread");

        Test1 test1 = new Test1();    //creating thread-0
        test1.start();                //starting thread-0

        Test2 test2 = new Test2();    //creating thread-1
        test2.start();                //starting thread-1
    }
}
