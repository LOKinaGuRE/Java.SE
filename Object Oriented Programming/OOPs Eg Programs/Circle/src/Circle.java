public class Circle {
	private  double radius;

	//Setter method for Radius
	void setRadius(double r){
		radius = r;
	}

	//getter method for Radius
	double getRadius(){
		return radius;
	}

	//Calculate circumference  --> 2*Pi*radius
	double circumference(){
		return  2*Math.PI*radius;
	}

	//calculate area	----------> Pi*rad*rad
	double area(){
		return  Math.PI* Math.pow(radius,2);
	}



}
