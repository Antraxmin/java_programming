package Example;

import java.io.*;
public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;	// �Է� ��Ʈ�� ���� 
		try {
			// ���ϰ� �Է� ��Ʈ�� ���� 
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			// ������ ���� ������ read()�޼ҵ�� -1�� ����
			while ((c = fin.read()) != -1) { // �� ���ھ� ���� ������ �б�
				System.out.print((char)c);	// ����Ʈ c�� ���ڷ� ��ȯ�Ͽ� ��� 
			}
			fin.close();	// ��Ʈ���� ���� �ݱ� 
		}
		catch (IOException e) {	// ���� �Է� �� ���� ó�� 
			System.out.println("����� ����");
		}
	}
}
