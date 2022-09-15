import java.util.Map;
import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();

		int n = number;
		int m = number;
		int rem;
		int count = 0;

//counting the number of digits
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			count++;
		}

		//Without Math library
		long arm_number =0  ;
		long power = 1;


		while (m>0){
			rem = m % 10 ;

			for (int i=1 ; i<=count ; i++){
				power = power * rem ;
			}

			m = m/10;
			arm_number = arm_number + power ;
			power=1;
		}
		if(arm_number == number){
			System.out.println("Yes ! Number "+ number + " is ARMSTRONG Number ");
		}else  System.out.println("NO ! Number "+ number + " is NOT AN ARMSTRONG Number ");


//		double sum =0;
//		double reminder=1;
//		while(m>0) {
//			reminder = m %10 ;
//			sum = sum + Math.pow(reminder,count) ;
//			m = m / 10;
//		}
//		if(number == sum ){
//			System.out.println("Yes ! Number "+ number + " is ARMSTRONG Number ");
//		} else
//			System.out.println("NO ! Number "+ number + " is NOT AN ARMSTRONG Number ");



	}
}
// armstrong number is :
/*
if 456 is number : total 3 digits
then , arm_number = 4^3 + 5^3 + 6^3
 */