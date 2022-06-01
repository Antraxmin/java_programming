package ch07lab;
import java.util.*;

public class ArrayListScore {
	public static void main(String[] args) {
		ArrayList<Character> ScoreList = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		// 학점을 입력받아 ArrayList에 저장
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 6; i++) {
			char score = sc.next().charAt(0);
			ScoreList.add(score);
		}
		
		// ArrayList 검색
		double sum = 0;
		for (int i = 0; i < ScoreList.size(); i++) {
			switch(ScoreList.get(i)) {
			case 'A': 
				sum += 4.0;
				break;
			case 'B': 
				sum += 3.0;
				break;
			case 'C': 
				sum += 2.0;
				break;
			case 'D': 
				sum += 1.0;
				break;
			case 'F': 
				sum += 0.0;
				break;
			}
		}
		System.out.println(sum/ScoreList.size());
		sc.close();
	}
}
