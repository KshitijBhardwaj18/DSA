package Mathematcis;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println(absolute(-32));
    }
    static int  absolute(int I) {

      if(I/10 == 0) {
          if (I * -1 == I) {
              return I / -1;
          } else {
              return I;
          }
      }else{
          if (I * -1 == I) {
              return I;
          } else {
              return I * -1;
          }
      }
    }

}
