import java.util.Scanner;

public class Count_Digits_OfNumber {
	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();

		int n = number;
		int rem;
		int count = 0;


		while (n > 0) {
			rem = n % 10;
			//System.out.println("" + rem);
			n = n / 10;
			count ++;


		}

		System.out.println("You Entered Number is : "+ number + " has " +count +" digits");
	}
}

