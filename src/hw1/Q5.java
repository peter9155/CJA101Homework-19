package hw1;

public class Q5 {
	public static void main(String[] args) {
		int money = 1500000;
		double rate = 0.02, compoundInterest;
		compoundInterest = money * Math.pow(1+rate, 10);
		System.out.println("10年後,本金加利息共有"+compoundInterest+"元");
	}

}
