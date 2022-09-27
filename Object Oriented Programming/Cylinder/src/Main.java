import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Cylinder cy1  = new Cylinder();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius and Height of the Cylinder");
		System.out.print("Radius	:	");
		double r = sc.nextDouble();

		System.out.print("Height	:	");
		double h = sc.nextDouble();
		sc.close();


		cy1.setRadius(r);
		cy1.setHeight(h);


		System.out.println("Radius	:	" +cy1.getRadius()	+"cm");
		System.out.println("Height	:	" +cy1.getHeight()	+"cm");

		System.out.println("Area	:	"+cy1.area()  	+" cm2");
		System.out.println("Volume	:	"+cy1.volume()	+" cm3");


	}
}
