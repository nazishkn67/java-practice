package simple_programs;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 543;     //initializing num variable to find reverse
        int rev=0, rem;    //declaring rev variable to store reverse & rem variable to store remainder

        while(num != 0) {           //543!=0      //54!=0      //5!=0         //0
            rem = num % 10;         //3           //4          //5
            rev = rev * 10 + rem;   //0*10+3      //3*10+4     //34+10+5
            num = num / 10;         //54          //5          //0
        }

        System.out.println("Reverse is " + rev);
    }
}
