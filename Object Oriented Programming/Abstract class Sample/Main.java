public class Main {
    public static void main(String[] args) {
        
        Shape C1 = new Circle(20);
      System.out.println(C1.area());  
      System.out.println(C1.perimeter());  
      System.out.println();


      Rectangle r1 = new Rectangle(10,20);
      System.out.println(r1.area());  
      System.out.println(r1.perimeter()); 
      System.out.println();

      Shape s1=r1;
      System.out.println(s1.area());
      System.out.println();
      

    }

}