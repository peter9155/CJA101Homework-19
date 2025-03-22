package hw5;

public class Q2 {
	public static void randAvg() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int random =((int)(Math.random()*101));
			sum += random;
			System.out.print(random+" ");
		} System.out.println();
		System.out.println("本次平均值為"+(sum/10));
	}
	
	public static void main(String[] args) {
		randAvg();
	}

}
