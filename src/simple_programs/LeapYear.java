package simple_programs;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;                        //initializing year variable to check leap year
        LeapYear leapYear = new LeapYear();     //creating instance of class
        leapYear.checkLeapYear(year);           //calling checkLeapYear() method
    }

    public void checkLeapYear(int year) {

        if(year % 4 == 0) {     //if year is divisible by 4, it is a leap year
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {        //else it is not a leap year
            System.out.println(year + " is not a leap year");
        }
    }
}
