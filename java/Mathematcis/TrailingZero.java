package Mathematcis;

public class TrailingZero {
    public static void main(String[] args) {
        System.out.println(countTrailingZeros(251));
    }
// this function have serious limitation. It gets out of bounds real quick.
    static int countTrailing1(int n){
        int factorial =  fact(n);
        int count = 0;

        while(factorial % 10 == 0){
            count++;
            factorial = factorial/10;
        }

        return count;

    }

    static int fact(int x){
        int ans = 1;

        for (int i = 2; i <= x ; i++) {
            ans *= i;
        }

        return ans;
    }

    static int countTrailingZeros(int n){
        int res = 0;
        for(int i = 5; i <= n; i = i*5){
            res += n/i;
        }
        return res;
    }

}
