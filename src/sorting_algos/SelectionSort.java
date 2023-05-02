package sorting_algos;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {20,10,60,40,30,50};      //initializing array for sorting
        int min, temp=0;                    //declaring min for storing min value and temp for swapping

        for(int i=0; i<a.length; i++) {          //i variable denotes each iteration
            min = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];        //20
            a[i] = a[min];      //10
            a[min] = temp;      //20
        }

        /* i = 0 iteration 1
            i=0 to i<6
            j -> finds min element in which index in each iteration
        //compare ith element with each of the rest element to find min element and swap them
                              array ->            20 10 60 40 30 50
        when i = 0, min-> 10 so swap 20 with 10   20 10 60 40 30 50   ->  10 20 60 40 30 50
        when i = 1, min-> 20 no swap needed       10 20 60 40 30 50
        when i = 2, min-> 30 so swap 60 with 30   10 20 60 40 30 50   ->  10 20 30 40 60 50
        when i = 3, min-> 40 no swap needed       10 20 30 40 60 50
        when i = 4, min-> 50 so swap 60 with 50   10 20 30 40 60 50   ->  10 20 30 40 50 60
        */

        for(int i:a)
            System.out.print(i + " ");
    }
}
