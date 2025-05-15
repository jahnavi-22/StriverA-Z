package Step1.Lec4;

import java.util.ArrayList;
import java.util.Collections;

public class DivisorsOfNum {
    public static void print_divisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i)
                    divisors.add(i);
                else
                    divisors.add(n/i);
            }
        }
        Collections.sort(divisors);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}
