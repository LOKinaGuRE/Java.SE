public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10);
		Rectangle r3 = new Rectangle(10,15);


		System.out.println("Area 	of R1 Rectangle		=" +r1.area());

		System.out.println();


		System.out.println("Area 	of R2 Rectangle		=" +r2.area());

		System.out.println();

		r3.setLength(40);
		System.out.println("Area 	of R3 Rectangle		=" +r3.area());

		System.out.println();


		Cuboid cuboid_one  = new Cuboid();
		cuboid_one.setLength(15);
		cuboid_one.setWidth(25);
		cuboid_one.setHeight(10);

		System.out.println("Area 	of  Cuboid		=" +cuboid_one.area());
		System.out.println("Volume 	of 	Cuboid 		=" +cuboid_one.volume());





	}

}
