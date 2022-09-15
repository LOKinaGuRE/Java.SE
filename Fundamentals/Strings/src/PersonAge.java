import java.util.Scanner;

public class PersonAge {
    public static void main(String[] args) {

        int age ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Agr of Person :");
        age = sc.nextInt();

        //I assumed that 14-35 ageed persons are Young
//        if (age >=14 && age<=35 ) {
//            System.out.println("Person is Young");
//        }
//        else System.out.println("Person is not Young");

        //using OR , we can get Not Young Statement

        if(age<14 || age >35){
            System.out.println("Person is not Young");
        }
        else System.out.println("Person is Young");

    }

}
