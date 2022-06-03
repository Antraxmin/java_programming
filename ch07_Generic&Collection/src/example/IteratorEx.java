package example;
import java.util.*;
public class IteratorEx {
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 5 ���� (�ε��� 0)
		v.add(4); // 4 ����	(�ε��� 1)
		v.add(-1); // -1 ����		(�ε��� 2)
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����
		// Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {	// �湮�� ��Ұ� �������� ������
			int n = it.next();	// ���� ��� �����Ͽ� n�� ���� 
			System.out.println(n);	// n���
		}
		// Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum = 0;
		it = v.iterator(); // Iterator ��ü ���
		while(it.hasNext()) {	// ������ �ѹ� �� �ݺ�
			int n = it.next();	// ���� ��� ���� n�� ���� 
			sum += n;	// ��� ����� ���� sum�� ���� 
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}

