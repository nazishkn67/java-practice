package simple_programs;

public class EvenOdd {

    public static void main(String[] args) {

        int number = 123;                    //initializing number variable to check even or odd
        EvenOdd evenOdd = new EvenOdd();     //creating instance of class
        evenOdd.checkEvenOdd(number);        //calling checkEvenOdd() method
    }

    public void checkEvenOdd(int number) {
        if(number%2==0)         //if a number is divisible by 2 then it is even, else it is odd
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}
