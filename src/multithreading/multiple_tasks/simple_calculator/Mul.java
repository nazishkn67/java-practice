package multithreading.multiple_tasks.simple_calculator;

public class Mul extends Main implements Runnable {

    @Override
    public void run() {
        result = a * b;
        System.out.println("Multiply of a & b is " + result);
    }
}