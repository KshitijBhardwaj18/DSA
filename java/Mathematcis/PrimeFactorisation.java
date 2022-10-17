package Mathematcis;

public class PrimeFactorisation {
    public static void main(String[] args) {
        printFactors4(112);
    }
// this is an unoptimised algo for generating the factors with time complexity is equal to big 0 of n*n*logn
    static void printFactors1(int n){
        for (int i = 2; i < n; i++) {
            if(checkPrime3(i)){
                int x = i;

                while(n%x == 0){
                    System.out.print(i + " ");
                    x = x*i;
                }
            }
        }
    }





    static boolean checkPrime3(int a) {
        if (a == 1) {
            return false;
        }

        if(a == 2 || a == 3){
            return true;
        }

        if( a % 2 == 0 || a % 3 == 0){
            return false;
        }


        for (int i = 5; i*i <= a; i = i+6) {
            if (a % i == 0 || a % i+2 == 0) {
                return false;
            }

        }
        return true;

    }

    static void printFactors2(int n){
        for (int i = 2; i*i <= n; i++) {
            if(checkPrime3(i)){
                int x = n;
                while(x%i == 0){
                    System.out.print(i);
                    x= x/i;
                }
            }
        }
    }


    static void printFactors3(int n){
        if(n <= 1){
            return;
        }

        for (int i = 2; i < n*n; i++) {
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
        }

        if(n > 1){
            System.out.println(n);
        }
    }

    // this is the most optimised function with complexity equal  to root of n
    static void printFactors4(int n){
        if(n <= 1){
            return;
        }

        while(n % 2 == 0){
            System.out.print(2 + " ");
            n = n/2;
        }

        while(n % 3 == 0){
            System.out.print(3 + " ");
            n = n/3;
        }

        for (int i = 5; i*i <= n; i = i+6) {
            if(n % i == 0){
                System.out.print(i + " ");
                n = n/i;
            }

            if(n % i+2 == 0){
                System.out.print(3 + " ");
                n = n/(i+2);
            }
        }

        if(n > 3){
            System.out.print(n);
        }
    }



}
