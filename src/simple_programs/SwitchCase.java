package simple_programs;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      //creating scanner object for user input

        int a = scan.nextInt();                     //initializing variable for 1st int operand
        int b = scan.nextInt();                     //initializing variable for 2nd int operand

        char operation = scan.next().charAt(0);     //initializing variable for operation type
        int result;                                 //declaring variable for storing result
        switch (operation) {
            case '+' :                              //case if operation is '+'
                result = a+b;
                System.out.println(result);
                break;
            case '-' :                              //case if operation is '-'
                result = a-b;
                System.out.println(result);
                break;
            case '*' :                              //case if operation is '*'
                result = a*b;
                System.out.println(result);
                break;
            case '/' :                              //case if operation is '/'
                try {                               //try block if no exception occurs
                    result = a/b;
                    System.out.println(result);
                    break;
                } catch(Exception e) {              //catch block if exception occurs
                    System.out.println("Exception occurred is " + e.getMessage());
                    System.exit(-1);            //exit with status code -1
                }

            default :
                System.out.println("wrong input");
        }

    }
}
