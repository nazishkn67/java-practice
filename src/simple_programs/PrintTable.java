package simple_programs;

public class PrintTable {

    public static void main(String[] args) {

        int number = 12;        //initializing number variable to print its table
        int i=1;
        while(i<=10) {          //loop will run from i=1 to i<=10
            System.out.println(number + " x " + i + " = " + number*i);  //12 x 1 = 12
            i++;                                                        //2
        }
    }
}
