package hw3;

import java.math.RoundingMode;
import java.util.Scanner;

public class Q2 {
	public int random() {
		int i = ((int)(Math.random()*101));
		return i;
	}
//public static void main(String[] args) {
//	Q2 q2 = new Q2();
//	int answer = q2.random();
//	int count = 0;
//	int guess = 0;
//	while( guess != answer) {
//		count++;
//		 guess = q2.random();
//		 if (guess > answer) {
//			 System.out.println("第"+count+"回合， 你猜"+guess+"， 太大了");
//		 } else if (guess < answer) {
//			 System.out.println("第"+count+"回合， 你猜"+guess+"， 太小了");
//		 } else {
//			 System.out.println("第"+count+"回合， 你猜"+guess+"， 答對了");
//		 }   
//	}
//}//自動猜
//	
//	public static void main(String[] args) {
//		Q2 q2 = new Q2();
//		int answer = q2.random();
//		int count = 0;
//		int guess = q2.random();
//		int max = 100;
//		int min = 1;
//		while( guess != answer) {
//			count++;
//			 guess = (int) Math.floor((max + min)/2);
//			 if (guess > answer) {
//				 max = guess - 1;
//				 System.out.println("第"+count+"回合， 你猜"+guess+"， 太大了");
//			 } else if (guess < answer) {
//				 min = guess + 1;
//				 System.out.println("第"+count+"回合， 你猜"+guess+"， 太小了");
//			 } else {
//				 System.out.println("第"+count+"回合， 你猜"+guess+"， 答對了");
//			 }   
//		}
//	}//限制次數內 自動猜對
//	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Q2 q2 = new Q2();
		int answer = q2.random();
		int count = 1;
		System.out.println("開始猜數字吧!");
		int guess = sc.nextInt();
		while( guess != answer) {
			 if (guess > answer) {
				 System.out.println("第"+count+"回合，你猜 "+guess+"， 太大了");
			 } else if (guess < answer) {
				 System.out.println("第"+count+"回合，你猜 "+guess+"， 太小了");
			 } count++;
			 guess = sc.nextInt();
			 }  
		
				 System.out.println("第"+count+"回合，你猜 "+guess+"， 答對了");
			 	 
	}
	
	
	
		}

