package hw3;

import java.util.Scanner;

public class Q3 {
	
	public int random() {
		int x = ((int)(Math.random()*49 )+1);
		return x;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q3 q3 = new Q3();
		int count = 0;
		System.out.println("阿文...請輸入你討厭哪個數字");
		int dislikeNum = sc.nextInt();
		while (dislikeNum < 1 || dislikeNum > 9) {
			System.out.println("請重新輸入數字需介於1~9");
			dislikeNum = sc.nextInt();
		}  
		for (int i = 1; i < 50; i++) {
			if( (i / 10 == dislikeNum) || (i % 10 == dislikeNum)) {
				continue;
			} count++;
			System.out.println(i);
		}System.out.println("總共有"+count+"個可選");
		
		
		}
	}


