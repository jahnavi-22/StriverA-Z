package Step1.Lec5;

public class NaturalNumSum {

    public static int seriesSum(int n) {
        if(n<=0)
            return 0;
        return n + seriesSum(n-1);
    }

    //or return n*(n+1)/2;

}
