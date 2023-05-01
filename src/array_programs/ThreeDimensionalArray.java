package array_programs;

public class ThreeDimensionalArray {

    public static void main(String[] args) {

        /* declaration of 3D array
        int[][][] a;

        //creation of 3D array
        a = new int[2][][];
        a[0] = new int[2][3];
        a[1] = new int[2][3];

        or a = new int[2][2][3];
        */

        //initialization of 3D array
        int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};

        //retrieval using for loop
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                for (int k=0; k<a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Array retrieval using for-each loop: " );

        //retrieval using for-each loop
        for(int[][] i: a) {
            for(int[] j : i) {
                for(int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }

    }
}
