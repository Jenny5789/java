/*"exit"이 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램ㅇ르 작성하라.*/
package ex01;
import java.util.Scanner;
public class Ex3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			String text = scanner.nextLine();
			if(text.equals("exit"))
				//"exit" 입력되면 반복 종료
				break;
			//가장 가까운 block의 완전 끝까지 가서 빠져 나온다.
		}
		System.out.println("종료합니다...");
		//"종료합니다..." 출력
		scanner.close();
		// scanner 닫기
	}
}