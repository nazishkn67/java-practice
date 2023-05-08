package miscellaneous_topics.comparator_comparable;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        int[] a = {1,5,4,7,6,9,11};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        Employee[] employee = new Employee[]{
                new Employee(9, "Nazish"),
                new Employee(4, "Rahul"),
                new Employee(1, "Ajay"),
                new Employee(7, "Arif")};

        Arrays.sort(employee, Employee.nameComparator); //natural ordering

        System.out.println(Arrays.toString(employee));
    }
}
