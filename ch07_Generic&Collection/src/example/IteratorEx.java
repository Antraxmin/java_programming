package example;
import java.util.*;
public class IteratorEx {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 5 삽입 (인덱스 0)
		v.add(4); // 4 삽입	(인덱스 1)
		v.add(-1); // -1 삽입		(인덱스 2)
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {	// 방문할 요소가 남아있을 때까지
			int n = it.next();	// 다음 요소 리턴하여 n에 저장 
			System.out.println(n);	// n출력
		}
		// Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) {	// 끝까지 한번 더 반복
			int n = it.next();	// 다음 요소 값을 n에 저장 
			sum += n;	// 모든 요소의 합을 sum에 누적 
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}

