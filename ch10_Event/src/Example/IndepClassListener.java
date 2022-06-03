// 예제 10-1 : 독립 클래스로 Action 이벤트의 리스너 작성
package Example;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");			// 버튼 생성 
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기
		c.add(btn);			// 버튼 추가 
		setSize(350, 150);
		setVisible(true); 
		}
	public static void main(String [] args) {
		new IndepClassListener();
	}
}

// 독립된 리스너 클래스 (자바 파일을 따로 분리해서 만들어도 됨)
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();		// 버튼 소스 얻기
		if(b.getText().equals("Action"))		// b버튼이 "Action"이라면
			b.setText("액션");					// "액션"으로 변환
		else
			b.setText("Action");				// 아니라면 값 유지
	}
}
