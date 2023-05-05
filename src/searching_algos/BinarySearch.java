package searching_algos;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {20,10,60,50,40,70,80,90,120,100};    //initialized an integer array
        int item = 30;                                    //initialized item to be searched
        int li = 0;                                       //initialized lower index - 0th
        int hi = arr.length - 1;                          //initialized higher index - 9th
        int mi = (li+hi)/2;                               //initialized middle index - 4th

        Arrays.sort(arr);   // 10 20 40 50 60 70 80 90 100 120

        while(li<=hi) {
            if(arr[mi] == item) {
                System.out.println(item + " is found at index: " + mi);
                break;
            } else if(arr[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li+hi)/2;
        }

        if(li>hi)
            System.out.println(item + " does not exist in this array");
    }
}
