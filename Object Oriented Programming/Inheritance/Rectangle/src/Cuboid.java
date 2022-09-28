public class Cuboid extends Rectangle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double volume (){
        return area()*getHeight();
    }
}
