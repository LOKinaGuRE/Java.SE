public class PatternPrint_01 {
	public static void main(String[] args) {
		System.out.println("\n PRINTING  J VALUES \n____\n");
		for (int i=1 ; i<=5 ; i++) {
			//System.out.println("_________");
			for (int j=1 ; j<=5 ; j++) {
				System.out.print( "| " + j + " |") ;
			}
			System.out.println();

		}

		System.out.println("\n PRINTING  I VALUES \n____\n");
		for (int i=1 ; i<=5 ; i++) {
			//System.out.println("_________");
			for (int j=1 ; j<=5 ; j++) {
				System.out.print( "| " + i + " |") ;
			}
			System.out.println();

		}
		System.out.println("\n PRINTING  NUMBER OF BOXES IN THAT PLACE VALUES \n____\n");
		int count =0;
		for (int i=1 ; i<=5 ; i++) {

			for (int j = 1; j <= 5; j++) {

				count++;
				System.out.format("| %02d  |", count);
			}
			System.out.println();
		}


		for (int i=1 ; i<=5 ; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(i + j + " | ");
			}
			System.out.println();
		}

		for (int i=1 ; i<=5 ; i++) {

			for (int j=1 ; j<=i ; j++) {

				System.out.print(j +" | ");
			}
			System.out.println();
		}


int counter=0;
		for (int i=1 ; i<=5 ; i++) {

			for (int j=1 ; j<=i ; j++) {
				counter++ ;
				System.out.print(counter +" | ");
			}
			System.out.println();
		}


		for (int i=1 ; i<=5 ; i++) {

			for (int j=1 ; j<=i ; j++) {

				System.out.print( "&& ");
			}
			System.out.println();
		}

int c=0;

		for (int i=1 ; i<=5 ; i++) {

			for (int j=1 ; j<= 5- i + 1 ; j++) {
c++;
				System.out.print( "* "+ c + " ");
			}
			System.out.println();
		}


		for (int i=1 ; i<=5 ; i++) {

			for (int j=1 ; j<=5 ; j++) {

				if (j<i){
					System.out.print(" ");
				} else {
				System.out.print( "*");
			}
			}

			System.out.println();
		}



		for (int i=1 ; i<=5 ; i++) {

			for (int j=1 ; j<=5 ; j++) {

//				if ( j <= 5-i  ){
//					System.out.print( " ");
//				} else {
//					System.out.print("#");
//				}

				if ( (i+j) >5 ) {
					System.out.print("*");
				} else System.out.print(" ");
			}

			System.out.println();
		}

	}
}
