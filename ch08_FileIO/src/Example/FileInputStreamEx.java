package Example;

import java.io.*;
public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // 비어 있는 byte 배열
		try {
			// 파일과 입력 스트림 연결 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n = 0, c;
			while((c = fin.read())!= -1) {	// 파일의 끝까지 읽기 
				b[n] = (byte)c;		// 배열의 각 요소에 파일 읽은 값 저장 
				n++;
			}
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			// 배열 b의 길이만큼 요소 모두 출력 
			for(int i = 0; i < b.length; i++) 
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();	// 닫기 
		} catch(IOException e) {
			System.out.println( "c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}