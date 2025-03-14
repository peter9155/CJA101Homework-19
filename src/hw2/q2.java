package hw2;

public class q2 {
	public static void main(String[] args) {
		int i, j, count = 0;
		for (i = 49; i > 0; i--) {
			if(i / 10 == 4|| i % 10 == 4) {
				continue;
			}count++;
			System.out.println(i);
		}System.out.println("總共有"+count+"個");
		
		System.out.println("--------------------------------------------------------");
		for (i = 10; i > 0; i--) {
			for(j =  1; j <= i; j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		System.out.println("--------------------------------------------------------");
		for(i = 1; i <= 6; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print((char)(i+64));
			}System.out.println();
		}
	}

}
