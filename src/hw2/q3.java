package hw2;

public class q3 {
	public static void main(String args[]) {
		int i;
		for (i = 1; i < 10; i++) {
			int j = 1;
			while (j < 10) {

				System.out.print( i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------");
		for (i = 1; i < 10; i++) {
			int j = 1;
			do {
				System.out.print( i + "*" + j + "=" +i * j+"\t");
				j++;
			} while(j < 10);
			System.out.println();
			
		}
		System.out.println("------------------------------------------------------------------------------");
		 i = 1;
		while (i < 10) {
			int j = 1;
			do {
				System.out.print( i + "*" + j + "=" + i * j + "\t");
				j++;
				} while( j < 10);
			i++;
			System.out.println();
		
		}
		
		
	}

}
