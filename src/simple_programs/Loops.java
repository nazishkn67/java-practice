package simple_programs;

public class Loops {

    public static void main(String[] args) {

        int num = 5, sum1=0, sum2=0, sum3=0;           //initializing num variable 7 sum variable

        /*
        for(initialize; condition; update) {
            statement 1
            statement 2
            ,,,,,,,,,,,
            statement n
        }
         */

        for(int i=1; i<=num; i++) {
            sum1 += i;
        }
        System.out.println("Sum of first 5 numbers using for loop is "  + sum1);

        /*
        while(condition) {
            statement 1
            statement 2
            ,,,,,,,,,,,
            statement n
            updation
        }
         */

        int i=1;
        while(i<=num) {
            sum2 += i;
            i++;
        }
        System.out.println("Sum of first 5 numbers using while loop is "  + sum2);

        /*
        do {
            statement 1
            statement 2
            ,,,,,,,,,,,
            statement n
            updation
        } while(condition);
         */

        int j=1;
        do {
            sum3 += j;
            j++;
        } while(j<=num);
        System.out.println("Sum of first 5 numbers using do-while loop is "  + sum3);

    }
}
