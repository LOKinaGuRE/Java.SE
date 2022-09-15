import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {


		int number;
		long factorial =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();

		//factorial of n numbers
		//0! = 1
		//1! = 1
		//2! = 2 * 1
		//3! = 3 * 2 * 1

		for (int i=1 ; i <= number ; i++){
			factorial = factorial * i ;
		}

		//	System.out.printf("Factorial of %d! is : %d \n",number,factorial);

		System.out.println("Factorial of "+ number + "! is : " + factorial);
	}
}
