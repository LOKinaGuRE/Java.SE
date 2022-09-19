
public class Discount {
    public static void main(String[] args) {

        System.out.println("Pass Cost , Discount method");

        System.out.println("Discount We can give based on Your Purchase is : " + discountOf(20, 12) + " % ");

    }

    static int discountOf(double... Varag) {
        double sum = 0;
        if (Varag.length == 0)
            return 0;
        else {
            for (double x : Varag) {
                sum += x;
            }
        }

        if (sum < 100) {
            return 0;
        } else if (sum >= 100 && sum < 1000) {
            return 10;
        } else if (sum >= 1000 && sum < 5000) {
            return 20;
        } else
            return 30;

    }

}