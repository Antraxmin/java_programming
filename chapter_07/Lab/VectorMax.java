package chapter07;			// 434p 실습문제1번
import java.util.*;

public class VectorMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		// 정수 -1이 입력될때까지 반복하여 벡터에 저장
		System.out.print("정수 -1이 입력될 때까지 >> ");
		while (true) {
			int num = sc.nextInt();
			if (num == -1) break;
			v.add(num);
		}
		
		// 벡터에서 가장 큰 수를 출력
		int max = 0;
		for (int i = 0; i < v.size(); i++) {
			if (max < v.elementAt(i))
				max = v.elementAt(i);
		}
		System.out.println("가장 큰 수는 " + max);
		sc.close();
	}
}
