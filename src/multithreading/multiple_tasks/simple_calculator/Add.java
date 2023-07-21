package multithreading.multiple_tasks.simple_calculator;

public class Add extends Main implements Runnable {

    @Override
    public void run() {
        result = a + b;
        System.out.println("Sum of a & b is " + result);
    }
}
