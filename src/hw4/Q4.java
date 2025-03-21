package hw4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int a [][] = {{25, 32, 8, 19, 27},
					  {2500, 800, 500, 1000, 1200}};
		int count = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("請輸入預借的金額");
		 int money = sc.nextInt();
		 for (int i = 0; i < a[0].length; i++) {
			 if (a[1][i] >= money) {
				 System.out.print(a[0][i]+" ");
				 count++;
			 }
				 }System.out.println("共"+count+"人");
			  
		 
	}

}
