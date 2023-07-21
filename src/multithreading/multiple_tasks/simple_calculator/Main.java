package multithreading.multiple_tasks.simple_calculator;

public class Main {

    //Scanner sc = new Scanner(System.in);

    int a = 23;
    int b = 11;
    int result;

    public static void main(String[] args) {

        Add add = new Add();
        Thread addObj = new Thread(add);
        addObj.start();

        Sub sub = new Sub();
        Thread subObj = new Thread(sub);
        subObj.start();

        Mul mul = new Mul();
        Thread mulObj = new Thread(mul);
        mulObj.start();

        Div div = new Div();
        Thread divObj = new Thread(div);
        divObj.start();
    }
}
