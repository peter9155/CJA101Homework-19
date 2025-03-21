package hw4;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		int normalYear [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		System.out.println("請輸入年份(西元)");
		year = sc.nextInt();
		System.out.println("請輸入月份");
		month = sc.nextInt();
		System.out.println("請輸入日期");
		day = sc.nextInt();
		
	
		
		
		boolean isLeapYear = isLeapYear(year);
		
		if (isLeapYear) {
			normalYear[1] = 29;
		}
		
		if (month < 1 || month >12 || day < 1 || day > normalYear[month - 1]) {
			System.out.println("輸入的日期不存在");
			return;
		}
		
		int dayOfyear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayOfyear += normalYear[i];}
		    dayOfyear += day;
		    System.out.println("輸入的日期為該年的"+dayOfyear+"天");
		
		
	
	}
    public static boolean isLeapYear(int year) {
				if (year % 4 == 0) {
					if(year % 100 == 0) {
						if (year % 400 == 0) {
							return true;
						} else {
							return false;
						} 
						} else {
							return true;
						}
					} else {
						return false;
					}
    }
		

}
