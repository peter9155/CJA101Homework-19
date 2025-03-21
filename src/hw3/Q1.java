package hw3;

import java.util.Scanner;

public class Q1 {
	public String isTriangle(int sideA, int sideB, int sideC) {
		if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)){
			if ((sideA == sideB) && (sideB == sideC)) {
				return "正三角形";
			} else if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC) ){
				return "等腰三角形";
			} else if (Math.pow(sideA,2) == (Math.pow(sideB, 2) + Math.pow(sideC, 2))
					|| Math.pow(sideB,2) == (Math.pow(sideA, 2) + Math.pow(sideC, 2))
					|| Math.pow(sideC,2) == (Math.pow(sideA, 2) + Math.pow(sideB, 2))) {
				return "直角三角形";
			}
			else {
				return "其他三角形";
			}
		}else {
			return "不是三角形";
		}
	}
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("請輸入三個邊長:");
		  int sideA =sc.nextInt();
		  int sideB =sc.nextInt();
		  int sideC =sc.nextInt();
		  
		  Q1 q = new Q1();
		  String result = q.isTriangle(sideA,sideB,sideC);
		  System.out.println(result);
	}
	}


