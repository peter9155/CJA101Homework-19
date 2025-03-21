package hw4;

public class Q6 {
	public static void main(String[] args) {
		int scores [][] = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 30, 99, 75}
				};
		
		int hightestCount [] =new int [8]; //儲存每位學生出現最高分的次數
		
		for (int i = 0; i < 6; i++) {
			int maxScore = -1; //避免有0分為最高的情形 所以用-1
			for (int j = 0; j < 8; j++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
				}
			}   //先找出每次考試學生最高分數
			for (int j = 0; j < 8; j++) {
				if (scores[i][j] == maxScore) {
					hightestCount[j]++;
				}
					
			} //如果該次考試學生分數為剛剛所找的最高分 計算學生最高分次數+1
			
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println((i + 1)+"號同學考最高分的次數為"+hightestCount[i]);
		}
	
	}
}
