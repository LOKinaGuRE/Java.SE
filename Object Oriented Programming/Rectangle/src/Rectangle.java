public class Rectangle {

	private  double length ;
	private  double width ;
	private  double height ;


	Rectangle(){
		this.length = 1 ;
		this.width	= 1 ;

	}
	Rectangle(double length){
		this.length = length ;
		this.width	= length ;
		this.height = length;

	}
	Rectangle(double length, double width){
		this.length = length ;
		this.width	= width ;

	}
	Rectangle(double length, double width , double height){
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(length==width) this.height=length;
		else
			this.height = height;
	}

	public  double area(){
		return length * width ;
	}

	public double volume(){
		return length*width*height;
	}
	public double volume(double height){
		return length*width*height;
	}


}

