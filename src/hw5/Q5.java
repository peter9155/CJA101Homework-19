package hw5;

public class Q5 {
	public String getAuthCode(){
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char random[] = new char[8];
		
		
		for (int i = 0; i < 8; i++) {
			random[i] = s.charAt((int)(Math.random()*62));
		}
		
		return new String(random);
		
	}
	
	public static void main(String[] args) {
		Q5 authCode = new Q5();
		System.out.println("本次隨機產生的號碼為:"+"\n"+authCode.getAuthCode());
	}

}
