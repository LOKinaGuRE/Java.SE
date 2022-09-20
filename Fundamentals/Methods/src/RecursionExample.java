public class RecursionExample {
    static int count = 5;

    public static void main(String[] args) {

        display();

    }

    static void display() {
        count--;
        if (count > 0) {
            System.out.println(count + "  Hello");
            display();
        }

        // Hear display() function call itself untill count becomes less than or equal
        // to zero
        // when display() method called , than count value decread by 1 value

    }

}
