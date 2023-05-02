package array_programs;

public class ArrayTraversal {

    /* Arrays can be traversed using :-
        1. for loop
        2. for-each loop
        3. while loop
        4. do-while loop
     */

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        System.out.println("Array traversal using for loop: ");
        //array traversal using for loop
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nArray traversal using for-each loop: ");
        //array traversal using for-each loop
        for(int i : a) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray traversal using while loop: ");
        //array traversal using while loop
        int i=0;
        while(i<a.length) {
            System.out.print(a[i] + " ");
            i++;
        }

        System.out.println("\nArray traversal using do-while loop: ");
        int j=0;
        do {
            System.out.print(a[j] + " ");
            j++;
        } while(j<a.length);

    }
}
