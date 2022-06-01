import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;	
		try {
			fin = new FileReader("c:\\windows\\system.ini");	// 스트림 생성하고 파일과 연결
			int c;	
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
