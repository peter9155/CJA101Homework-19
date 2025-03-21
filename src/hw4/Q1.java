package hw4;


public class Q1 {
	public static void main(String args[]) {
		int [] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		
		double average =((double) sum / arr.length);
		
		System.out.println(average);
		
		System.out.println("大於平均值的有");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > average) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
