package example;

import java.util.*;
public class CollectionsEx {
	// LinkednList�� ��� ���� ����ϴ� �޼ҵ�
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {	// ���� ��Ұ� ���������� �ݺ� 
			String e = iterator.next();	// ���� ��Ҹ� e�� ���� 
			String separator;
			if (iterator.hasNext())	// ���� ��Ұ� �ִٸ� 
				separator = "->";	
			else
				separator = "\n";
			System.out.print(e+separator);	// e->e->e->e->���·� ���
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		Collections.sort(myList); // ��� ���� (��������������)
		printList(myList); // ���ĵ� ��� ���
		Collections.reverse(myList); // ����� ������ �ݴ��
		printList(myList); // ��� ���
		// myList�� "�ƹ�Ÿ"�� ��ġ�� �˻��ϴ� binarySearch �޼ҵ�
		// 0���� �����Ϻ�� +1�� ��ġ�� ����Ѵ�. 
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}
}
