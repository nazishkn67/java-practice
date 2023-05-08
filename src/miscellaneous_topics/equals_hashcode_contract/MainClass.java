package miscellaneous_topics.equals_hashcode_contract;

public class MainClass {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(0);
        e1.setName("Nazish");

        Employee e2 = new Employee();
        e2.setId(0);
        e2.setName("Nazish");

        System.out.println("shallow comparison: " + (e1==e2));  //compares memory addresses
        System.out.println("deep comparison: " + (e1.equals(e2)));  //compares memory addresses && content
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
