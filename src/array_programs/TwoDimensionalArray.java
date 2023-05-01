package array_programs;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        /* possible declaration of 2-D array
        int[][] a;
        int[] []a;
        int a[][];
        int[] a[];
        int [][]a;

        //creation of 2-D array
        a = new int[3][2];          //matrix array -> same no. of columns

        row1-> 0,0  0,1
        row2-> 1,0  1,1
        row3-> 2,0  2,1

        a = new int[3][];           //jagged array -> different no. of columns
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[3];

        row1-> 0,0  0,1  0,2
        row2-> 1,0  1,1
        row3-> 2,0  2,1  2,2

        //creation & declaration in one line
        int[] a = new int[2][2];        //matrix array
        int[] a = new int[2][];         //jagged array
        a[0] = new int[2];
        a[1] = new int[3];

        //initialization
        a[0] = {10,20} , a[1] = {30, 40};       //matrix array
        a[0] = {10,20} , a[1] = {30, 40, 50};   //jagged array

         */

        //declaration & initialization in one line (hardcoded)
        int[][] a = {{1,2,3},{4,5,6}};  //matrix array
        int[][] b = {{1,2},{3,4,5}};    //jagged array

        System.out.println("Array retrieval using for loop: " );

        //retrieval using for loop
        for(int i=0; i<b.length; i++) {             //0<2                  //1<2                          //2<2
            for(int j=0; j<b[i].length; j++) {      //0<2  //1<2  //2<2    //0<3  //1<3  //2<3    //3<3
                System.out.print(b[i][j] + " ");    //1    //1 2           //3    //3 4  //3 4 5
            }
            System.out.println();
        }

        System.out.println("Array retrieval using for-each loop: " );

        //retrieval using for-each loop
        for(int[] i: a) {                   //1,2,3                     //4,5,6
            for(int j : i) {                //1    //2      //3         //4     //5     //6
                System.out.print(j + " ");  //1    // 1 2   //1 2 3     //4     //4 5   //4 5 6
            }
            System.out.println();
        }

        System.out.println(a);           //hashcode of 2D array class name
        System.out.println(a[0]);        //hashcode of 1D array class name
        System.out.println(a[0][0]);     //1

        System.out.println(a.length);       //2
        System.out.println(a[0].length);    //3
        //System.out.println(a[0][0].length); -> error

    }

}
