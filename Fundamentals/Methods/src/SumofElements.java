public class SumofElements {
    public static void main(String[] args) {

        sum();
        sum(10.264);
        sum(45, 88, 99, 0);
        sum(0, 1, 2.356, 789);
        sum(0, 1, 2);
        sum(new double[] { 15, 5, 6, 9, 4 });

    }

    static void sum(double... Varag) {
        double sum = 0;
        if (Varag.length == 0)
            System.out.println("sum = " + sum);
        else {

            for (double x : Varag) {
                sum = sum + x;
            }
        }
        System.out.println(" Sum = " + sum);
    }
}
