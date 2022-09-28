public class MethodOverridingSample {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.display();
        System.out.println();

        Child c1=new Child();
            c1.display();
        System.out.println();

        Parent pc=new Child();
            pc.display();
        System.out.println();

        /*
         Child cp=new Parent();
             cp.display();
        */


    }
}


class Parent {
    void display(){
        System.out.println("Hello Parent !");
    }

}
class Child extends  Parent {
    @Override
    void  display(){
        System.out.println("Hello Child ! ");
    }
}
