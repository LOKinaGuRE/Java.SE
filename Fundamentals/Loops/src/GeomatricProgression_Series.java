import java.util.Scanner;

public class GeomatricProgression_Series {

	public static void main(String[] args) {

		int number, initial, ratio;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Initial Number : ");
		initial = sc.nextInt();

		System.out.println("Please Enter the Ratio Between  Numbers : ");
		ratio = sc.nextInt();

		System.out.println("Enter the How many list of Sequence need : ");
		number = sc.nextInt();

		int mul = 1 ;
		for ( int i=1 ; i<=number ; i++) {
			if(mul == 1 ){
				mul = initial ;

				System.out.print( mul + " , ");
				continue;
			}
			mul = mul * ratio ;
			System.out.print( mul + " , ");
		}

	}

}
