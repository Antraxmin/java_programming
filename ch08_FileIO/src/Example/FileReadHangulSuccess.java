package Example;
import java.io.*;

public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;	
		FileInputStream fin = null;	// ���� �Է� ��Ʈ�� 
		try {
			// ���Ͽ��� ����Ʈ ������ �б� ���� fin�� ���� 
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			// MS949�� ���ڷ� �б� ���� in�� ���� 
			in = new InputStreamReader(fin, "MS949");	
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			// ������ ������ �ݺ�
			while ((c = in.read()) != -1) {
				System.out.print((char)c);	// ���ڷ� ��ȯ�Ͽ� ��� 
			}
			in.close();
			fin.close();
		} catch (IOException e) {	// ���� ó�� 
			System.out.println("����� ����");
		}
	}
}
