package ex01;
import java.util.Scanner;
public class Pra_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		// 정수 3개를 입력하라고 했지만 난 하나씩 입력하도록 했네..
		System.out.println("정수 3개 중 가장 큰 수를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.println("정수 3개 중 두번째 큰 수를 입력하세요: ");
		int b = scanner.nextInt();
		System.out.println("정수 3개 중 가장 작은 수를 입력하세요: ");
		int c = scanner.nextInt();
		
		if((b+c) >= a) {;
			System.out.println("삼격형이 됩니다.");
		}
		else {
			System.out.println("삼각형이 안됩니다.");
		}
		scanner.close();
				
	}

}
