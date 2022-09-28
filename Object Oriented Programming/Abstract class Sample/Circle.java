public class Circle  extends Shape{

    private double radius;
    Circle(double radius){
        this.radius = radius;
    }

    Circle(){
        radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI*radius*radius;
    }

    @Override
    double perimeter(){
        return Math.PI*2*radius;
    }


    
}
