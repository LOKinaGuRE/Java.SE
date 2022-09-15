import  java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int m1,m2,m3;
        int sum;
        double average;

        System.out.println("Enter the marks of Students : ");
        System.out.println();

        Scanner sc = new Scanner (System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        sum=m1+m2+m3;

        average = (double) sum / 3;
        String grade="";


        System.out.println("average  = "+ average);

        //Grade above 80 A, 60-80 B , 35 to 60 C  then Fail
        if(average >=90){
            grade = "A";
        } else if (average >=60 && average<80) {
            grade = "B";
        } else if (average >=35 && average<60) {
            grade = "C";
        }
        else grade = "F";

        System.out.println("Grade has got : "+ grade + " grade");
    }
}
