// ���� 9-1 : 300x300 ũ���� ���� ������ �����
package Example;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");	// ������ ���� ���� 
		setSize(300,300); // ������ ũ�� 300x300
		setVisible(true); // ������ ��� (ȭ�鿡 ���̰� �ϱ�)
	}
	public static void main(String[] args) {
		// MyFrame Ŭ���� ��ü�� ���� - ������ ���ÿ� �����ڿ� ���õ� ���ǵ��� GUI�� ����
		MyFrame frame = new MyFrame();
	}
}
