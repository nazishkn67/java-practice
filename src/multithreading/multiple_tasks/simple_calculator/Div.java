package multithreading.multiple_tasks.simple_calculator;

public class Div extends Main implements Runnable {

    @Override
    public void run() {
        try {
            result = a / b;
            System.out.println("Division of a & b is " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}