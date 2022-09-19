public class SumUsingCommadlineArgument {
    public static void main(String[] args) {

        // double sum = 0;
        // if(args.length ==0 ) System.out.println("Sum = 0;");
        // else {
        // for (int i=0 ; i<args.length ; i++){
        // sum += Double.parseDouble(args[i]);
        // }
        // System.out.println("Sum = "+ sum);
        // }

        // Above code only work , untill u give sonly non-String value
        // For string , some one enters -- we need to skip this and need to go to next
        // valur

        double sum = 0;
        for (String x : args) {
            if (x.matches("[0-9\\.]+"))
                sum = sum + Double.parseDouble(x);
        }
        System.out.println("Sum = " + sum);
    }
}
