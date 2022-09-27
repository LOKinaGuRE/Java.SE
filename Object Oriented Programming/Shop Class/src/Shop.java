import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        //You can take inputs from users for u'r convenient

        Product  p1 = new Product(1001,"Samsung Z Fold",45_000);
        Customer c1 = new Customer(3001,"Rahul Tripathi",808841230);

        System.out.println("Enter the Order address");
        Scanner sc = new Scanner(System.in);

        String ad = sc.next();
        c1.setCustomer_Address(ad);
        sc.close();

        System.out.println();
        System.out.println("Order Details: ");
        System.out.println("Customer Name       "+c1.getCustomer_name() );
        System.out.println("Customer Address    "+c1.getCustomer_Address() );
        System.out.println("Product             "+p1.getItemName());
        System.out.println("Price of Product    "+p1.getPrice());

    }


}