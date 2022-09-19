import java.util.Scanner;

public class ValidateStudent {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student ");
        name = sc.next();

        System.out.println("Enter the age of student");
        age = sc.nextInt();

        sc.close();

        System.out.println("Name is Correct : " + validate(name));
        System.out.println("Age is Correct : " + validate(age));

    }

    static boolean validate(String name) {
        boolean v = name.matches("[A-Za-z]+");
        return v;
    }

    static boolean validate(int age) {
        boolean v = false;
        if (age >= 4 && age <= 15) {
            v = true;
        }

        return v;
    }

}
