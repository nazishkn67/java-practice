package simple_programs;

public class FibonacciSeries {

    //initializing first two numbers and series variable to calculate and store other numbers in series
    static int a = 0, b = 1, series = 0;

    public static void main(String[] args) {
        System.out.print(a + " " + b + " ");        //0 1
        FibonacciSeries fibonacciSeries = new FibonacciSeries();    //creating instance of class
        int num =10;                     //initializing num variable for total number in fibonacci series
        fibonacciSeries.printFibonacciSeries(num);  //calling printFibonacciSeries() method
    }

    public void printFibonacciSeries(int num) {
        
        if(num >=1) {       //10>=1  //9>=1  //8>=1  //7>=1  //6>=1  //5>=1  //4>=1  //3>=1  //2>=1  //1>=1  //0
            series = a+b;   //1      //2     //3     //5     //8     //13    //21    //34    //55    //89
            System.out.print(series + " ");
            a = b;          //1      //1     //2     //3     //5     //8     //13    //21    //34    //55
            b = series;     //1      //2     //3     //5     //8     //13    //21    //34    //55    //89
            printFibonacciSeries(num-1);
        }
    }
}
