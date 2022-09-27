import java.util.Scanner;
import java.util.SortedMap;

public class Main {
	public static void main(String[] args) {

		System.out.println();
		Circle c1 = new Circle();
		//calls default constructor
		//No explicit constructor is defined

		System.out.println("Enter the Radius of Circle");
		Scanner sc = new Scanner(System.in);
		double rad =  sc.nextDouble();
		//taken radius value from the user

		//c1.radius;
		//We can't assign radius value to Radius var.Because it has defined as private
		//So with the help of Getter and Setter methods we can use and update radius value with more control over that.

		c1.setRadius(rad);
		System.out.println("Radius of Circle is 		= "+c1.getRadius());
		System.out.println("Area of Circle is 			= "+c1.area());
		System.out.println("Circumference of Circle is 	= "+c1.circumference());




	}
}
