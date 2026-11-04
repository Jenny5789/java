package ex01;

import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); // 점수읽기
		if(score >= 90) // score가 90 이상
			grade = 'A';
		else if(score >= 80) // score가 80 이상
			grade = 'B';
		else if(score >= 70) // score가 70 이상
			grade = 'C';
		else if(score >= 60) // score가 60 이상
			grade = 'D';
		else // score가 60 미만
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		
		// 순차적으로 충족되는 조건 찾은 후 실행됨

		scanner.close();
	}

}
