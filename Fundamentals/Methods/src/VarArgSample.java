
public class VarArgSample {
    public static void main(String[] args) {

        // Vararg is used for a we didn't know exactly , what numbers of parameters we
        // accepting
        // in that case we do use a Vararg
        // Vararg takes only similar type of data
        // in Method signatute Varargs should be one and the last element

        int a[] = { 5, 5, 5, 5, 5 };

        display();
        display(10);
        display(56);
        display(10, 20, 30, 40);
        display(new int[] { 1, 2, 3, 4, 5, 6, });// Anonymous Array
        display(a);// Array
        // display("Name"); should be datatype match

    }

    static void display(int... Vararg) {
        System.out.println("Varag length =" + Vararg.length);
        System.out.println("Vararg accepted Elements ");
        for (int x : Vararg) {
            System.out.print(x + " |");
        }
        System.out.println("\n");

    }

}
