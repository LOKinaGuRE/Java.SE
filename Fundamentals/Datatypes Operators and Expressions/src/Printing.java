package javabootcamp.MyJava;

public class Printing {
    public static void main(String[] args) {
        System.out.println(2+3+"Hi "+3/2);
        int x = 126,y=56,z=-10;
        float a=-12.56789f;
        String s="Java";
        System.out.printf("%2$6d Number\n",x,y);
        System.out.printf("%2$(06d Number\n",x,y);
        System.out.printf("%(06d Number\n",z);
        System.out.printf("%+6d Number\n",z);
        System.out.printf("%05.2f Number\n",a);
        System.out.printf("%-10s String\n",s);

    }
}
