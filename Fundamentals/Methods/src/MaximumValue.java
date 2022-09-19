public class MaximumValue {
    public static void main(String[] args) {

        // This program purpose is to Find the greatest element of passed values

        findMax();
        findMax(10.264);
        findMax(45, 88, 99, 0);
        findMax(0, 1, 2.356, 789);
        findMax(0, 1, 2);
        findMax(new double[] { 15, 5, 6, 9, 4 });

    }

    static void findMax(double... Varag) {
        double max = 0;
        if (Varag.length == 0)
            System.out.println("max = 0");

        else {
            for (double x : Varag) {
                if (max < x) {
                    max = x;
                }
            }
            System.out.println("Max = " + max);
        }

    }

}
