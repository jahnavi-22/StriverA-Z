package Step1.Lec5;

public class Factorial {

    static int factorial(int n) {
        if(n==1 || n==0)
            return 1;
        return n*factorial(n-1);
    }

}
