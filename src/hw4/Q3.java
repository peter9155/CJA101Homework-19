package hw4;

public class Q3 {
	public static void main(String[] args) {
		int count = 0;
	    String planet [] ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	    for (int i = 0; i < planet.length; i++) {
	    	for (int j = 0; j < planet[i].length(); j++) {
	    		char planetChar = planet[i].charAt(j);
	    		if (planetChar == 'a' || planetChar == 'e' || planetChar == 'i' || planetChar == 'o'|| planetChar == 'u') {
	    			count++;
	    		}
	    	}
	    }
	   System.out.println("共出現"+count+"次");
	   
	}

}
