package array_programs;

public class OneDimensionalArray {

    public static void main(String[] args) {

        /* possible declaration of 1-D array
        int[] a;
        int []a;
        int[]a;
        int a[];

        //creation of 1-D array
        a = new int[3];

        //creation & declaration in one line
        int[] a = new int[3];
        int[] a = new int[0];  //will compile & run successfully
        int[] a = new int[-2]  //will compile & throw NegativeArraySizeException

        //initialization
        a[0] = 12;
        a[1] = 26;
        a[2] = 56;
        a[3] = 45;            // throw ArrayOutOfBoundException in runtime

         */

        //declaration & initialization in one line (hardcoded)
        int[] a = {1,2,3};

        System.out.println("Array retrieval using for loop: " );

        //retrieval using for loop
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nArray retrieval using for-each loop: " );

        //retrieval using for-each loop
        for(int i : a)
            System.out.print(i + " ");

    }
}
