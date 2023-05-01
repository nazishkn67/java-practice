package simple_programs;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //creating scanner object for user input
        int num = sc.nextInt();                     //getting num value from user
        float decimalNo = sc.nextFloat();           //getting decimalNo value from user
        boolean condition = sc.nextBoolean();       //getting condition value from user
        char character = sc.next().charAt(0);       //getting character value from user
        sc.nextLine();
        String message = sc.nextLine();             //getting message value from user
        System.out.println("Integer is " + num);
        System.out.println("Float is " + decimalNo);
        System.out.println("Boolean is " + condition);
        System.out.println("Character is " + character);
        System.out.println("String is " + message);
    }
}
