package hw1;

public class Q6 {
	public static void main(String[] args) {
		System.out.println(5+5); //代表兩個整數相加,因為型式一樣
		System.out.println(5+'5');//代表整數與字元相加 字元CHAR'5'在轉換時對照ASCII CODE是53 所以變成5+53
		System.out.println(5+"5");//數值型態遇到與字串相加時會自動轉換成文字串接而變成"55"
	}

}
