package Mathematcis;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome2(78987));
    }

    static boolean checkPalindrome1(int n){
        if(n/10 == 0){
            return true;
        }
        int temp = 0;
        int orig = n;

        while(n > 0){
            temp = temp*10 + n%10;
            n /= 10;
//            if(n!=0){
////                temp *= 10;
//            }
        }

        return temp == orig;
    }


    static boolean checkPalindrome2(int n){
        if(n/10 == 0){
            return true;
        }

        int rev = 0;
        int temp = n;

        while(temp > 0){
            int ld = temp % 10;

            rev = rev * 10 + ld;

            temp = temp / 10;
        }

        return(rev == n);
    }


}
