import java.util.Scanner;

public class CircleOperations {

	public  static  void  main(String[] arg ){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius Value");

		Circle c_one = new Circle();
		c_one.radius= sc.nextDouble();

		System.out.println("Area of circle 		: " + c_one.area());
		System.out.println("Perimeter of circle : " + c_one.perimeter());

	}
}


class Circle {

	double radius = 40 ; // It will override by the c_one.radius statement
	// radius = 40 changes to ------>user inputted value

	 double area(){
		 return Math.PI*radius*radius;
	 }
	 double perimeter(){
		 return 2*Math.PI*radius ;
	 }
}

