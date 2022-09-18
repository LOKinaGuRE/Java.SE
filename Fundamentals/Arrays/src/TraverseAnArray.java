public class TraverseAnArray {
    public static void main(String[] args) {

        int[] array = { 5,10,15,20,25 } ;

        //array declared and elements installed

        //Traverse the every array elements
        //For each loop is suitable if we want to traverse : FRom start to end

        // array.length : returns the length of an array:

        System.out.println("Visiting Every Elements: Ascending Order");
        for ( int i=0 ; i < array.length ; i++){
            System.out.print( array[i] + " |");
        }
        System.out.println();

        //using for-each loop
        System.out.println("Visiting Elements using For-each loop");
        for ( int x : array) {
            System.out.print(x + " |");
        }
        System.out.println();

        //Printing reverse(Descending Traverse)
        System.out.println("Printing reverse(Descending Traverse)");
        System.out.println("<------------------ ");
        for (int i=( array.length-1) ; i>=0 ;i--) {
            System.out.print(array[i] + " |");
        }
        System.out.println();

    }
}
