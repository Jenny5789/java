/* 숫자를 입력 받아 3~5눈 "봄" 6~8은 "여름", 9~11 은 "가을" 12~2는 "겨울"을
 * 그 외 숫자를 입력한 경우 " 잘못입력하였습니다."를 출력하는 프로그램을 작성하시오*/

package ex01;
import java.util.Scanner;
public class Pra_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("달을 입력하세요.(1~12사이): ");
		int month = scanner.nextInt();
		String season = "";    //String 대문자 구분 잘 하자
		switch(month) {
		case 12:
		case 1:
		case 2:
		 season = "겨울";
		 break;
		case 3:
		case 4:
		case 5:
		 season = "봄";
		 break;
		case 6:
		case 7:
		case 8:
		 season = "여름";
		 break;
		case 9:
		case 10:
		case 11:
		 season = "가을";
		 break;
		default:
			System.out.println("잘못 입력하였습니다.");
			
		}
		System.out.println(season);  
		// System.out.println할 것도 잊지말자
		scanner.close();
	}
}


//교수님 풀이
// scanner 객체 생성
// Scanner scanner = new Scanner(System.in);

// 사용자로부터 월 입력
// System.out.println("달을 입력하세요.(1~12) >> ");
// int 월 = scanner.nextInt();

// switch문을 이용하여 계절 출력
// switch(월){
// case 3:
// case 4:
// case 5:
//	System.out.println("봄");
//	break;
// case 6:
// case 7:
// case 8:
//	System.out.println("여름");
//	break;
// case 9:
// case 10:
// case 11:
//	System.out.println("가을");
//	break;
// case 12:
// case 1:
// case 2:
//	System.out.println("겨울");
//	break;
// default:
//	System.out.println("잘못 입력하였습니다.");
// scanner.close();



// if 문을 이용한 계절 출력
// if(월 >= 3 && 월 <= 5)
//	System.out.println("봄");
// else if (월 >= 6 && 월 <= 8)
//System.out.println("여름");
//if(월 >= 9 && 월 <= 11)
//	System.out.println("가을");
//else if (월 >= 1 && 월 <= 2 || 월 ==12)
//System.out.println("겨울");
// scanner.close();