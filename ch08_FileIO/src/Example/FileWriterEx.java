package Example;
import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			// ����� ���ϸ�� ���� ��� ��Ʈ���� ����
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {	// ���ѹݺ� 
				String line = scanner.nextLine();	// �����Է¹ޱ� 
				if(line.length() == 0)	
					break;
				// ���� ���̸�ŭ ���Ͽ� ����
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();	// ���� �ݱ� 
		} catch (IOException e) {	// ���� ó�� 
			System.out.println("����� ����");
		}
		scanner.close();	// ��ĳ�� �ݱ� 
	}
}