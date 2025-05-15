package Step1.Lec4;

//The GCD of two numbers doesn't change if the smaller number is subtracted from the bigger number.
// This is the Euclidean algorithm by subtraction.

public class GCD {
    public static int gcd(int a, int b) {
        // code here
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b)
            return gcd(a-b,b);
        return gcd(a, b-a);

        //or return (b == 0) ? a : gcd(b, a % b)
    }
}
