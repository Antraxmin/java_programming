// ���� 10-1 : ���� Ŭ������ Action �̺�Ʈ�� ������ �ۼ�
package Example;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");			// ��ư ���� 
		btn.addActionListener(new MyActionListener()); // Action ������ �ޱ�
		c.add(btn);			// ��ư �߰� 
		setSize(350, 150);
		setVisible(true); 
		}
	public static void main(String [] args) {
		new IndepClassListener();
	}
}

// ������ ������ Ŭ���� (�ڹ� ������ ���� �и��ؼ� ���� ��)
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();		// ��ư �ҽ� ���
		if(b.getText().equals("Action"))		// b��ư�� "Action"�̶��
			b.setText("�׼�");					// "�׼�"���� ��ȯ
		else
			b.setText("Action");				// �ƴ϶�� �� ����
	}
}
