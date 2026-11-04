package ex01;
import java.util.Scanner;
public class Extra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위: 원) >> ");
		
		int won = scanner.nextInt();
		double dollar = won / 1490;
		

		System.out.printf("%d원은 $%.2f입니다.", won, dollar);
		scanner.close();

	}

}
