// 예제 9-1 : 300x300 크기의 스윙 프레임 만들기
package Example;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");	// 프레임 제목 설정 
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력 (화면에 보이게 하기)
	}
	public static void main(String[] args) {
		// MyFrame 클래스 객체를 생성 - 생성과 동시에 생성자에 셋팅된 조건들이 GUI를 구성
		MyFrame frame = new MyFrame();
	}
}
