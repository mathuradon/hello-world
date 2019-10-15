package algorithm;

public class RecursionPractice {

    public static void main(String[] args) {
        //int factorial = factorial(5);
        //System.out.println("The Factorial is:  "+ factorial);
        int fibinacci = fibonacci(5);
        System.out.println(fibinacci);

    }


    private static int fibonacci(int n) {
        if(n < 1)
            return n;
        else if(n<2)
            return n;
        else
            System.out.println(n);
            return   fibonacci(n-1) + fibonacci(n-2);
    }

    private static int factorial(int i) {

        if(i <= 1)
            return i;
        else
            return i * factorial(i-1);
    }


}
