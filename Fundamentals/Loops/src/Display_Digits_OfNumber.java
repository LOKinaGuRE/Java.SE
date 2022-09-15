import java.util.Scanner;

public class Display_Digits_OfNumber {
	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();

		int n = number ;
		int m ;
		int rem , rev =0 ;
		int reminder = 0;


//Not Tailing with ZERO

//		while( m > 0 ){
//			rem = n % 10 ;
//			rev = rev * 10 + rem ;
//			m = m /10 ;
//
//		}
//
//		while(  rev > 0 ){
//			reminder  = rev  % 10 ;
//
//			switch ( reminder ) {
//				case 0:
//					System.out.print("ZERO ");	break;
//				case 1:
//					System.out.print("ONE ");	break;
//				case 2:
//					System.out.print("TWO ");	break;
//				case 3:
//					System.out.print("THREE ");	break;
//				case 4:
//					System.out.print("FOUR ");	break;
//				case 5:
//					System.out.print("FIVE ");	break;
//				case 6:
//					System.out.print("SIX ");	break;
//				case 7:
//					System.out.print("SEVEN ");	break;
//				case 8:
//					System.out.print("EIGHT ");	break;
//				case 9:
//					System.out.print("NINE ");	break;
//				default:
//					System.out.print("INVALID DIGIT ");	break;
//
//
//			}
//
//			rev = rev / 10 ;

//		}


		String Reverse ="";

		while( n > 0 ) {
			rem = n % 10;

			Reverse = Reverse + rem ; //Concatenation

			n = n / 10;
		}

		//System.out.println("Reverse : " + Reverse);

		int ReversedInteger = Integer.parseInt(Reverse);
		int r=0;
		int sLen = Reverse.length();

//				while(  sLen > 0 ){
//			r = ReversedInteger  % 10 ;
//
//			switch ( r ) {
//				case 0:
//					System.out.print("ZERO ");	break;
//				case 1:
//					System.out.print("ONE ");	break;
//				case 2:
//					System.out.print("TWO ");	break;
//				case 3:
//					System.out.print("THREE ");	break;
//				case 4:
//					System.out.print("FOUR ");	break;
//				case 5:
//					System.out.print("FIVE ");	break;
//				case 6:
//					System.out.print("SIX ");	break;
//				case 7:
//					System.out.print("SEVEN ");	break;
//				case 8:
//					System.out.print("EIGHT ");	break;
//				case 9:
//					System.out.print("NINE ");	break;
//				default:
//					System.out.print("INVALID DIGIT ");	break;
//
//
//			}
//			ReversedInteger = ReversedInteger / 10 ;
//			sLen--;
//
//		}

		for (int i=sLen-1 ; i>=0 ; i--){
			char c =  Reverse.charAt(i);
//			System.out.println(c);

			switch (c) {
				case '0' -> System.out.print("ZERO ");
				case '1' -> System.out.print("ONE ");
				case '2' -> System.out.print("TWO ");
				case '3' -> System.out.print("THREE ");
				case '4' -> System.out.print("FOUR ");
				case '5' -> System.out.print("FIVE ");
				case '6' -> System.out.print("SIX ");
				case '7' -> System.out.print("SEVEN ");
				case '8' -> System.out.print("EIGHT ");
				case '9' -> System.out.print("NINE ");
				default -> System.out.print("INVALID DIGIT ");
			}
		}


	}
}
