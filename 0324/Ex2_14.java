package ex01;
import java.util.Scanner;
public class Ex2_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();      //값 입력
		switch (score/10) {    //값을 받아 10으로 나눈 정수값
		case 10: //score = 100   // 받은 값을 case와 비교하여 해당되는 case 찾아감
		case 9: // score 90~99   
			grade = 'A';
			break;
		case 8: //score 80~89
			grade = 'B';
			break;
		case 7: //score 70~79
			grade = 'C';
			break;
		case 6: //score 60~69
			grade = 'D';
			break;
		default:// score는 59 이하
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
	}
}

// if ~ elseif~else문과 switch문과 비교하였을 때 
// 계산속도면에서 차이가 있어 switch 문을 잘 사용한다.

//파이썬에서는 switch 문이 없다. java에서는 왜 있을까?
//if문에서는 순차 비교함 = 컴퓨터 자원을 비효율적으로 사용
//switch 는 비순차비교문이기 때문에 해당되는 것을 바로 찾으러 갈 수 있음
//if문은 조건식-> 참/거짓 판단함/ switch문은 값이 들어감-->
//if문은 조건 만나 실행되고 빠짐/ switch문은 조건 없으면 끝까지 진행됨--> if 도 그런거 아닌가??????????????????????????

