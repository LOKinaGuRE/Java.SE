public class Rectangle {

	private  double length ;
	private  double width ;

	Rectangle(){
		this.length = 1 ;
		this.width	= 1 ;
	}
	Rectangle(double length){
		this.length = length ;
		this.width	= length ;
	}
	Rectangle(double length, double width){
		this.length = length ;
		this.width	= width ;
	}
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public  double area(){
		return length * width ;
	}




}

