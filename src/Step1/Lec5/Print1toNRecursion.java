package Step1.Lec5;

public class Print1toNRecursion {

    public void printNos(int n) {
        if(n>1)
            printNos(n-1);
        System.out.print(n + " ");
    }
}
