package hw1;

public class q4 {
	public static void main(String[] args) {
		final double pi = 3.141;
		double circleArea, diameter;
		int radius = 5;
		circleArea = pi * Math.pow(radius,2);
		diameter = pi * radius * 2;
		System.out.println("圓面積為: "+circleArea+"\n"+"直徑為: "+diameter);
 	}

}
