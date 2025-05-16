package Step1.Lec5;

public class PrintNto1Recursion {

    void printNos(int n) {
        if(n==0)
            return;
        System.out.print(n + " ");
        printNos(n-1);
    }
}
