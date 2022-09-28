public class Rectangle extends Shape{

    private double length;
    private double breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(double length){
        this.length=length;
        this.breadth=1;
    }
public double getBreadth() {
    return breadth;
}
public double getLength() {
    return length;
}
public void setBreadth(double breadth) {
    this.breadth = breadth;
}
public void setLength(double length) {
    this.length = length;
}

@Override
double area(){
    return length*breadth;
}
@Override
double perimeter(){
    return 2*(length+breadth);
}

    
}
