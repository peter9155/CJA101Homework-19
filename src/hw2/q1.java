package hw2;

public class q1 {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i < 1001; i++) {
			if (i % 2 == 1) {
				continue; // 學習使用continue,可以簡化成if(i%2=0) sum+=i
			}
			sum += i;
		}
		System.out.println(sum);
		System.out.println("--------------------------------------------------------");
		sum = 1;
		for (i = 1; i <= 10; i++) {
			sum *= i;
		}
		System.out.println(sum);
		System.out.println("--------------------------------------------------------");
		sum = 1;
		i = 1;
		while (i <= 10) {
			sum *= i;
			i++;
		}
		System.out.println(sum);
		System.out.println("--------------------------------------------------------");
		for (i = 1; i <= 10; i++) {
			System.out.print((int) Math.pow(i, 2) + " ");
		}
	}

}
