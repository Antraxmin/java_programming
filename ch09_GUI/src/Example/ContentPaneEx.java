// ���� 9-2 : 3���� ��ư ������Ʈ�� ���� ���������� �����
// ����Ʈ���� ������ ������������ �ϰ�, �̰��� OK, Cancel, Ignore ��ư���� ������ ���� ���α׷��� �ۼ��϶�.
package Example;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();	// ����Ʈ�� �˾Ƴ��� 
		contentPane.setBackground(Color.ORANGE);	// ���� ����
		contentPane.setLayout(new FlowLayout());	// ���̾ƿ� ��� ����
		// ��ư �߰� 
		contentPane.add(new JButton("OK"));			
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		setSize(300, 150);	// ������ ������ ���� 
		setVisible(true);	// ������ ���̰� ����
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
