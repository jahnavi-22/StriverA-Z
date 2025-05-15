package Step1.Lec4;

public class ReverseANumber {

        public int reverse(int x) {
            int result = 0;
            while(x!=0){
                if(result > Integer.MAX_VALUE /10) return 0;
                if(result < Integer.MIN_VALUE /10) return 0;
                int last = x%10;
                result = (result*10) + last;
                x = x/10;
            }
            return result;
        }

}
