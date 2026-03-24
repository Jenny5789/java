package ex01;
import java.util.Scanner;
public class pra_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위: 원)(1$=1,200원)");
		
		int won = scanner.nextInt();
		double dollar = won / 1200;
		
		System.out.println(won + "원은 $" + dollar +"입니다.");
	
		scanner.close();    //close로 마무리하기
	}

}
