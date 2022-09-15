public class PrintingPattern_02 {


	public static void main(String[] args) {

		for ( int i=1 ; i <= 5 ; i++ ) {

			for ( int m=1; m<=5 ; m++) {

				if((i+m)>5){
					System.out.print("*  ");
				} else System.out.print("   ");

			}

			for (int n=1 ; n<5 ; n++){

				if(n<i){
					System.out.print("*  ");
				} else System.out.print("   ");
			}



			System.out.println();


		}


		for (int i= 1 ; i <=4 ; i++) {

			for ( int m= 1 ; m <=5 ; m++) {
				if(m>i){
					System.out.print("*  ");
				}else  System.out.print("   ");
			}

			for (int n=1 ; n<=4 ; n++){
				if( (n+i) > 4) {
					System.out.print("   ");
				} else System.out.print("*  ");
			}
			System.out.println();
		}




	}
}