package simple_programs;

public class LargestOfThree {

    public static void main(String[] args) {

        int a=34, b=56, c=22;            //initializing three integer variables
        LargestOfThree largestOfThree = new LargestOfThree();   //creating instance of class
        largestOfThree.findLargestNumber(a,b,c);      //calling findLargestNumber() method
    }

    public void findLargestNumber(int a, int b, int c) {

        if(a>b && a>c)          //if a is greater than b and c, then a is largest of three
            System.out.println("a is largest");
        else if (b>a && b>c )   //if b is greater than a and c, then b is largest of three
            System.out.println("b is largest");
        else                    //else c is largest of three
            System.out.println("c is largest");
    }
}
