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