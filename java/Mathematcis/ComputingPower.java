package Mathematcis;

public class ComputingPower {
    public static void main(String[] args) {
        System.out.println(power3(2,3));
    }

    // this is an unoptimised solution with complexity theta of n
    static int power1(int x, int n){
        int res = 1;

        for(int i = 0; i < n; i++){
            res = res*x;
        }
        return res;
    }

    // this is an solution with complexity theta of logn

    static int power2(int x, int n){
        if(n == 0){
            return 1;
        }

        int temp = power2(x,n/2);
        temp = temp*temp;

        if(n%2 == 0){
            return temp;
        }
        else{
            return temp*x;
        }

    }


    static int power3(int x, int n){
        int res = 1;

        while(n != 0){
            if(n%2 != 0) {
                res = res * x;
            }

            x = x*x;
            n = n/2;
        }
        return res;
    }

}
