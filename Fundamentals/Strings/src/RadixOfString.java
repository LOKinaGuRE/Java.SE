import java.util.Scanner;

public class RadixOfString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Please");


        String nS = sc.next();

        if(nS.matches("[01]+")){
            System.out.println("Binary ");
        } else if (nS.matches("[0-7]+")) {
            System.out.println("Octal ");
        } else if (nS.matches("[0-9]+")) {
            System.out.println("Decimal ");
        } else if (nS.matches("[A-Fa-f0-9]+")) {
            System.out.println("Hexadecimal ");
        } else System.out.println("Invalid Number ");
    }
}
