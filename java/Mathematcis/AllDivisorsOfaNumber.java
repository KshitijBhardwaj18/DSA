package Mathematcis;

public class AllDivisorsOfaNumber {
    public static void main(String[] args) {

    }

    static void printAllDivisors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
    }

    static void printAllDivisors2(int n){
        for (int i = 1; i*i <= n; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    System.out.print(n/i + " ");
                }

            }
        }
    }

    static void printAllDivisors3(int n){
        int i;
        for(i=1; i*i < n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }

        for(; i >= 1; i--)
        {
            if(n % i == 0)
            {
                System.out.print((n / i)+" ");
            }
        }
    }

}
