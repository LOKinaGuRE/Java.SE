import java.util.Scanner;

public class RectangleClass {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle ");

		Rectangle r_one = new Rectangle();

		r_one.length=sc.nextDouble();
		r_one.breadth=sc.nextDouble();

		System.out.println(" Whether This Rectangle is Square :  " + r_one.isSquare());
		System.out.println(" Area of Rectangle				  :  "	+r_one.area());
		System.out.println(" Perimeter of Rectangle			  :  "	+r_one.perimeter());
	}
}

class Rectangle {
	double length , breadth ;

	boolean isSquare () {
		return length == breadth;
	}

	double area(){
		if(isSquare()) {
			return length*length;
		}
		else return length*breadth;
	}



	double perimeter(){
		if(isSquare()){
			return 4*length;
		}
		else  return 2* (length+breadth);
	}

}

