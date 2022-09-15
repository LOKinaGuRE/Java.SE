import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();


        //For Loop
//        for(int i=1 ; i<=10 ; i++){
//            System.out.printf(  " %d  *  %d  =  %d \n",number,i,number*i ) ;
//        }

        //While Loop
//        int i=1;
//        while (i<=10){
//            System.out.printf(  " %d  *  %d  =  %d \n",number,i,number*i ) ;
//            i++;


        //Do While Loop
        int i=1;
        do{

            System.out.printf(  " %d  *  %d  =  %d \n",number,i,number*i ) ;
            i++;
        }while (i<=10);


    }

}
