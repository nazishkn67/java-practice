package simple_programs;

public class ReverseString {

    public static void main(String[] args) {

        String message = "hello";        //initializing message string to find reverse
        String rev="";                   //initializing rev string to store reverse

        for(int i=message.length()-1; i>=0; i--) {   //4    //3     //2     //1       //0       //-1
            rev = rev + message.charAt(i);           //o    //ol    //oll   //olle    //olleh
        }

        System.out.println(rev);
    }
}
