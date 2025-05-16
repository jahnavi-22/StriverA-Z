package Step1.Lec5;

public class PrintNTimesRecursion {

    void printGfg(int n) {
        if(n==0)
            return;
        System.out.print("GFG" + " ");
        printGfg(n-1);
    }

}
