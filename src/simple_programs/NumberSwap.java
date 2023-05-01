package simple_programs;

public class NumberSwap {

    public static void main(String[] args) {

        int a = 35, b = 49;     //initializing two numbers for swapping
        NumberSwap numberSwap = new NumberSwap();       //creating instance of class
        numberSwap.swapUsingTemp(a,b);                  //calling swapUsingTemp() method
        numberSwap.swapWithoutUsingTemp(a,b);           //calling swapWithoutUsingTemp() method
    }

    public void swapUsingTemp(int a, int b) {

        int temp = 0;
        System.out.println("Numbers before swapping: a=" + a + " b=" + b);
        temp = a;           //35
        a = b;              //49
        b = temp;           //35
        System.out.println("Numbers after swapping: a=" + a + " b=" + b);
    }

    public void swapWithoutUsingTemp(int a, int b) {
        System.out.println("Numbers before swapping: a=" + a + " b=" + b);
        a = a + b;          //3+4=7
        b = a - b;          //7-4=3
        a = a - b;          //7-3=4
        System.out.println("Numbers after swapping: a=" + a + " b=" + b);
    }
}
