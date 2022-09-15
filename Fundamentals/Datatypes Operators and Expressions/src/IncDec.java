package javabootcamp.MyJava.DataTypes;

public class IncDec {
    public static void main(String[] args) {
        int a=3, b=8, c=3;

        int v = a++ * 3+ c++ * ++c * b++ * ++b + a  ;
        // v=   3 * 3  + 3  * 5 *   8    *  10 +4
        // 1213

        System.out.println("V value is :"+ v);
//        int v2=2 , v3=3 ;
//        int v1= v2++ + ++v3;
//        System.out.println("V1 = "+v1);

//        int t1 = 1 , t2 = 2 , t3 = 3 ;
//        int t = --t1 * ++t2 + t3 ++ + ++t3;
//        //       0   *  2   + 3 + 5
//
//        System.out.println("t3 = "+ t3);
//        System.out.println("T = " +t);
    }
}
