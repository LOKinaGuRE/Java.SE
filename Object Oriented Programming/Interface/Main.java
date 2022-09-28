public class Main {
    public static void main(String[] args) {
        

        
        Shop s1=new Shop();

        Customer c1=new Customer("Jonathan Bayer");
        Customer c2=new Customer("Jhon Wick");

        s1.registerMembers(c1);
        s1.registerMembers(c2);

        s1.saleInvite();



    }
}
