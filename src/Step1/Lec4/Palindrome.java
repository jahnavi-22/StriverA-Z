package Step1.Lec4;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int result = 0;
        int og = x;
        while(x!=0){
            int last = x%10;
            result = (result*10) + last;
            x/=10;
        }
        return og == result;
    }
}
