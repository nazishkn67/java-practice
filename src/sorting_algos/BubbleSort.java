package sorting_algos;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {20,10,60,40,30,50};          //initializing array for sorting
        int temp;                               //declaring temp for swapping values

        for(int i=0; i<a.length; i++) {          //i variable denotes each round
            for(int j=0; j<a.length-1-i; j++) {
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        /* i = 0 round 1
            j=0 -> j<5
                20>10 60 40 30 50     //compare two adjacent elements and swap them
                10 20>60 40 30 50
                10 20 60>40 30 50
                10 20 40 60>30 50
                10 20 40 30 60>50
                10 20 40 30 50 60    //largest element is stored at the end after round 1

           //repeat for length - 1 no. of rounds

         */

        for(int i:a)
            System.out.print(i + " ");
    }
}
