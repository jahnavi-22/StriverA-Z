package Step1.Lec4;

public class ArmstrongNum {
    static boolean armstrongNumber(int n) {
        // code here
        int exponent = String.valueOf(n).length();
        int result = 0;
        int og = n;
        while(n!=0){
            int last = n%10;
            result += Math.pow(last,exponent);
            n/=10;
        }
        return og==result;
    }
}
