package hw5;

import java.util.Scanner;

public class Q1 {
	public void starSqare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬度");
		int width = sc.nextInt();
		System.out.println("請輸入高度");
		int height = sc.nextInt();
		Q1 q1 = new Q1();
		q1.starSqare(width, height);
	}

}
