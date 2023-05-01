package array_programs;

public class AnonymousArray {

    public static void main(String[] args) {
        AnonymousArray anonymousArray = new AnonymousArray();           //creating instance of class
        //calling sumOfArrayElements() passing Anonymous array as an argument
        anonymousArray.sumOfArrayElements(new int[]{10,20,30,40,50});
    }

    public void sumOfArrayElements(int[] num) {
        int total = 0;
        for(int i: num) {   //10      //20      //30      //40      //50
            total += i;     //0+10    //10+20   //30+30   //60+40   //100+50
        }
        System.out.println("Sum of array elements is " + total);    //150
    }
}
