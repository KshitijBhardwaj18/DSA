package Mathematcis;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits1(13453));
    }


    static int countDigits1(int x){
        int digits = 0;
        while(x > 0){
            digits++;
            x/=10;
        }
        return digits;
    }

    // time complexity for this function is theta(D) if d is the number of digits


}
