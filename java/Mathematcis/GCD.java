package Mathematcis;

public class GCD {
    public static void main(String[] args) {
        System.out.println(getGCD3(4,6));
    }
// this is naive code with theta of minimum of a or b complexity
    static int getGCD1(int a, int b){

        int res = Math.min(a,b);

        while(res>0){
            if(a%res == 0 && b%res == 0){
                break;
            }
            res--;
        }
        return res;
    }

    // A standard euclidean implementation gcd(a,b) = gcd(a-b,b)

    static int getGCD2(int a, int b){
        while(a != b){
            if(a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }

    // a more optimised implementation of euclidean algo

    static int getGCD3(int a,int b){
        if(b == 0){
            return a;
        }else{
            return getGCD3(b, a%b);
        }
    }

}

