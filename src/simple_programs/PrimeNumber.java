package simple_programs;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 121;          //initializing num variable to check prime
        PrimeNumber primeNumber = new PrimeNumber();    //creating instance of class
        primeNumber.checkPrime(num);        //calling checkPrime() method
    }

    public void checkPrime(int num) {

        int temp=0;                 //declaring temp variable for using as a flag
        for(int i=2; i<num; i++) {
            if(num % i ==0)         //if num is divisible by any number i, temp is incremented by 1
                temp +=1;
        }

        if(temp==0)                 //if temp is 0, then number is prime
            System.out.println(num + " is prime");
        else                        //else number is not prime
            System.out.println(num + " is not prime");
    }

}
