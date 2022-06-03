package Example;
import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			// 출력할 파일명과 파일 출력 스트림을 연결
			fout = new FileWriter("c:\\Temp\\test.txt");
			while(true) {	// 무한반복 
				String line = scanner.nextLine();	// 한줄입력받기 
				if(line.length() == 0)	
					break;
				// 라인 길이만큼 파일에 저장
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();	// 파일 닫기 
		} catch (IOException e) {	// 예외 처리 
			System.out.println("입출력 오류");
		}
		scanner.close();	// 스캐너 닫기 
	}
}