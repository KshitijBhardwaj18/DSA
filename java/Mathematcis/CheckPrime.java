package Mathematcis;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime3(37));
    }

    static boolean checkPrime1(int a) {
        if (a == 1) {
            return false;
        }


        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }

        }
        return true;

    }

    // more optimised way reduced time complexity by square root of n

    static boolean checkPrime2(int a) {
        if (a == 1) {
            return false;
        }


        for (int i = 2; i*i < a; i++) {
            if (a % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static boolean checkPrime3(int a) {
        if (a == 1) {
            return false;
        }

        if( a == 2|| a == 3){
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

}
