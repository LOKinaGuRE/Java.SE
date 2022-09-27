public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10);
		Rectangle r3 = new Rectangle(10,15);
		Rectangle r4 = new Rectangle(10,15,12);

		System.out.println("Area 	of R1 Rectangle		=" +r1.area());
		System.out.println("Volume 	of R1 Rectangle 	=" +r1.volume(1));
		System.out.println();

		r2.setHeight(15);
		System.out.println("Area 	of R2 Rectangle		=" +r2.area());
		System.out.println("Volume 	of R2 Rectangle 	=" +r2.volume());
		System.out.println();

		r3.setLength(40);
		r3.setHeight(32);
		System.out.println("Area 	of R3 Rectangle		=" +r3.area());
		System.out.println("Volume 	of R3 Rectangle 	=" +r3.volume());
		System.out.println();

		r4.setWidth(1);
		System.out.println("Area 	of R4 Rectangle		=" +r4.area());
		System.out.println("Volume 	of R4 Rectangle 	=" +r4.volume(12));
		System.out.println();



	}

}
