import java.util.Scanner;

public class ReverseOf_GivenNumber {
	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();

		int n = number ;
		int rem ;
		int reverse=0 ;



		while( n > 0 ){
			rem = n % 10 ;

			//System.out.print(""+rem);
			n = n /10 ;
			reverse = reverse * 10 +rem ;
		}

		System.out.println("Reversed Number is : "+reverse);
	}
}
