public class Cylinder {

	private double radius ;
	private double height ;

	//Radius and Height are properties of A Cylinder Class


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	//This keyword used denote that, this variable is belongs to current instance(constructor)


	//Cylinder has : Area and Volume
	//Area of Cylinder: (Upper circle area + lower circle area )  2*circle area + Rectangle area
	// ( Rectangle area :length x width ---> height x circumference : 2Pir x h : 2*Pi*r*h
	//
		// 2(PI*r*r) + 2*Pi*r*h  : 2*Pi*r(r+h)
	//Volume: Pi*r*r * height


	double area(){
		return 2*Math.PI*radius * (radius+height);
	}
	double volume (){
		return Math.PI*radius*radius*height;
}



}
