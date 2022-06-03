package Example;

import java.io.*;
public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;	// 입력 스트림 생성 
		try {
			// 파일과 입력 스트림 연결 
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			// 파일의 끝을 만나면 read()메소드는 -1을 리턴
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
				System.out.print((char)c);	// 바이트 c를 문자로 변환하여 출력 
			}
			fin.close();	// 스트림과 파일 닫기 
		}
		catch (IOException e) {	// 파일 입력 시 예외 처리 
			System.out.println("입출력 오류");
		}
	}
}
