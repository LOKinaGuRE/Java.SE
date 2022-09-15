import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {

		int number ;
		System.out.println("Enter the How many numbers of Sequence :");

		Scanner sc  =  new Scanner(System.in);
		number = sc.nextInt();

		long first = 0 , second = 1;
		long fibonacci = 0;

		System.out.print(first + " , "+ second +" , ");

		for (int i=1 ; i <=number-2 ; i++){
//			if(i==1 ) {
//				first = 0;
//				//System.out.print( first +" ");
//				continue;
//			}
//			if(i==2 ) {
//				second = 1;
//				System.out.print( second +" ");
//				continue;
//			}

			fibonacci = second + first ;

			System.out.print(fibonacci + " , ");
			first = second ;
			second = fibonacci ;

		}


	}

}
