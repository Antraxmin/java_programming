package Example;
import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);	// 버퍼 출력 스트림 생성 
			while ((c = fin.read()) != -1) {	// 파일의 끝까지 반복 
				out.write(c);		// 파일 출력 스트림에 쓰기 
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();
			out.flush(); // 버퍼에 남아 있던 문자 모두 출력
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}