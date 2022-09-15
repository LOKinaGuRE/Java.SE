import java.util.Scanner;

public class ArithmeticProgression_Series {

	public static void main(String[] args) {

		int number, initial, difference ;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Initial Number : ");
		initial = sc.nextInt();

		System.out.println("Please Enter the Difference Between  Numbers : ");
		difference = sc.nextInt();

		System.out.println("Enter the How many list of Sequence need : ");
		number = sc.nextInt();

		int sum = 0;
		for ( int i=1 ; i<=number ; i++) {
			if(sum ==0 ){
				sum = initial ;

				System.out.print( sum + " ,");
				continue;
			}
			sum = sum + difference ;
			System.out.print( sum + " , ");
		}


	}


}
