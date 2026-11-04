// Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다믕 예시와 같이 출력하는 프로그램을 작성하시오(1$ = 1,200원)

package ex01;
import java.util.Scanner;
public class Pra_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위: 원)(1$=1,200원)");
		
		int won = scanner.nextInt();
		double dollar = won / 1200;
		
		System.out.println(won + "원은 $" + dollar +"입니다.");
	
		scanner.close();    //close로 마무리하기
	}

}

/* 교수님 풀이 요령(큰 틀 작성하기)
// scanner 객체 생성
Scanner scanner = new Scanner(System.in);

// scanner로 값 입력 받는다.(double로 원화 입력)
System.out.println("원화를 입력하세요(단위: 원) >> ");
double won = scanner.nextDouble();

// 원화를 달러로 변환(1,490원/$)
double dollar = won / 1490;

// 결과를 화면에 출력
System.out.println(won + "원은 $" + dollar + ("입니다."));
System.out.printf("%.0f원은 $%.2f입니다.", won, dollar); 
// printf는 문자열이다, %d 는 문자열로 받는것!

scanner.close();
*/