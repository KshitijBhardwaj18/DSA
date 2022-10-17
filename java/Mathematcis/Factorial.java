package Mathematcis;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact1(5));
    }


    // iterative
    static double fact1(int n){
        double ans = 1;

        for (int i = 2; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }

    // recursive

    static int fact2(int n){
        if(n==0){
            return 1;
        }
        return n * fact2(n-1);
    }




}
