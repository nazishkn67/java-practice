package multithreading.multiple_tasks.simple_calculator;

public class Sub extends Main implements Runnable {

    @Override
    public void run() {
        result = a - b;
        System.out.println("Subtraction of a & b is " + result);
    }
}
