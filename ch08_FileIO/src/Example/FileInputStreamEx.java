package Example;

import java.io.*;
public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // ��� �ִ� byte �迭
		try {
			// ���ϰ� �Է� ��Ʈ�� ���� 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n = 0, c;
			while((c = fin.read())!= -1) {	// ������ ������ �б� 
				b[n] = (byte)c;		// �迭�� �� ��ҿ� ���� ���� �� ���� 
				n++;
			}
			System.out.println("c:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
			// �迭 b�� ���̸�ŭ ��� ��� ��� 
			for(int i = 0; i < b.length; i++) 
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();	// �ݱ� 
		} catch(IOException e) {
			System.out.println( "c:\\Temp\\test.out���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}
	}
}