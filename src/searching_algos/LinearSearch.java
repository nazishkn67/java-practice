package searching_algos;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {70,50,10,20,60,30,40};   //initialized an integer array
        int item = 30, temp=0;                //initialized item to be searched & temp as a flag

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == item) {
                System.out.println(item + " is found at index: " + i);
                temp = temp+1;
            }
        }

        if(temp==0)
            System.out.println(item + " does not exist in this array");
    }
}
