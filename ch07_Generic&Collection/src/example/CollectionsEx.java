package example;

import java.util.*;
public class CollectionsEx {
	// LinkednList의 모든 값을 출력하는 메소드
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {	// 다음 요소가 있을때까지 반복 
			String e = iterator.next();	// 다음 요소를 e에 저장 
			String separator;
			if (iterator.hasNext())	// 다음 요소가 있다면 
				separator = "->";	
			else
				separator = "\n";
			System.out.print(e+separator);	// e->e->e->e->형태로 출력
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		Collections.sort(myList); // 요소 정렬 (ㄱㄴㄷㄹ순으로)
		printList(myList); // 정렬된 요소 출력
		Collections.reverse(myList); // 요소의 순서를 반대로
		printList(myList); // 요소 출력
		// myList의 "아바타"의 위치를 검색하는 binarySearch 메소드
		// 0부터 시작하브로 +1한 위치를 출력한다. 
		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}
