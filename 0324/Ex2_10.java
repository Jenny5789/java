package ex01;
import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		
		// 메시지를 먼저 보내줘야 한다
		// print 줄 변경 없이 프린트
		// println  줄 변경 후 프린트
		System.out.print("점수를  입력하시오.");
		int score = scanner.nextInt();
		if(score >= 80)
			System.out.println("축하합니다! 합격입니다.");
			
		scanner.close();

	}

}
