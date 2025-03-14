package hw1;

public class q3 {
	public static void main(String[] args) {
		int total = 256559, sec = 1, min = sec*60, hour = min*60, day = hour*24;
		int days = total / day, daysQuo = total%day;
		int hours = daysQuo / hour, hoursQuo = daysQuo%hour;
		int mins = hoursQuo / min, secs= hoursQuo%min;
		System.out.println(total+"秒為"+days+"天"+hours+"時"+mins+"分"+secs+"秒");
		
	}

}
