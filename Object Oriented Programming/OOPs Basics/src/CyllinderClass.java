import java.util.Scanner;

public class CyllinderClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius Value");

		Cylinder cy_one = new Cylinder();
		cy_one.radius= sc.nextDouble();

		System.out.println("Enter the Height Value");
		cy_one.height= sc.nextDouble();

//		System.out.println("LidArea of Cylinder 		: " + cy_one.lidArea());
//		System.out.println("Perimeter of circle : " + cy_one.perimeter());
//		System.out.println("Perimeter of circle : " + cy_one.circumference());
	}
}

class  Cylinder {

	double radius ;
	double height ;

}

