package Example;
import java.io.*;

public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;	
		FileInputStream fin = null;	// 파일 입력 스트림 
		try {
			// 파일에서 바이트 단위로 읽기 위해 fin과 연결 
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			// MS949형 문자로 읽기 위해 in과 연결 
			in = new InputStreamReader(fin, "MS949");	
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			// 파일의 끝까지 반복
			while ((c = in.read()) != -1) {
				System.out.print((char)c);	// 문자로 변환하여 출력 
			}
			in.close();
			fin.close();
		} catch (IOException e) {	// 예외 처리 
			System.out.println("입출력 오류");
		}
	}
}
