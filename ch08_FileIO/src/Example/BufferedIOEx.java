package Example;
import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);	// ���� ��� ��Ʈ�� ���� 
			while ((c = fin.read()) != -1) {	// ������ ������ �ݺ� 
				out.write(c);		// ���� ��� ��Ʈ���� ���� 
			}
			// ���� �����Ͱ� ��� ��µ� ����
			new Scanner(System.in).nextLine();
			out.flush(); // ���ۿ� ���� �ִ� ���� ��� ���
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}