package simple_programs;

public class Factorial {

    static int fact = 1;

    public static void main(String[] args) {

        int num = 3;                            //initializing num variable to find factorial
        Factorial factorial = new Factorial();  //creating instance of class
        factorial.factorialOfNumber(num);       //calling factorialOfNumber() method
    }

    public void factorialOfNumber(int num) {

        if(num>=1) {                    //suppose 3     //2         //1         //0
            fact = fact * num;          //1*3           //3*2       //6*1
            factorialOfNumber(num-1);   //3-1           //2-1       //1-1
        }
        System.out.println("Factorial of " + num + " " + fact);
    }
}
