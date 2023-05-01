package simple_programs;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 121;                  //initializing num variable to check palindrome or not
        PalindromeNumber palindromeNumber = new PalindromeNumber(); //creating instance of class
        palindromeNumber.checkPalindromeNumber(num);    //calling checkPalindromeNumber() method
    }

    public void checkPalindromeNumber(int num) {

        //declaring rev to store reverse, rem to store remainder, and temp to store num value & find reverse
        int rev=0, rem, temp=num;
        while(temp!=0) {            //121!=0      //12!=0      //1!=0      //0

            rem = temp % 10;        //1           //2          //1
            rev = rev * 10 + rem;   //0*10+1      //1*10+2     //12*10+1
            temp = temp/10;         //12          //1          //0
        }

        if(rev==num)                //121==121
            System.out.println(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }
}

