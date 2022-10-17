package Mathematcis;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm2(3,7));
    }
// basic bruteforce implementation for the lcm with time complexity of big O of( a*b - max(a,b))
    static int lcm1(int a, int b){
        int lcm;
        if(a > b){
            lcm = a;
        }else{
            lcm = b;
        }

        for (int i = lcm; i <= a*b ; i++) {
            if(i % a == 0 && i % b == 0){
                lcm = i;
            }

        }

        return lcm;
    }

    static int lcm2(int a, int b){
        return (a*b)/gcd(a,b);

    }

    static int gcd(int a,int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }




}
