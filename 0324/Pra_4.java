package ex01;
import java.util.Scanner;
public class Pra_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점(x,y)의 x 좌표를 입력하시오: ");
		int x = scanner.nextInt();
		
		System.out.println("점(x,y)의 y 좌표를 입력하시오: ");
		int y = scanner.nextInt();
		
				
		
		if((100 <= x) && ( x <= 200))      
			//if 안에 조건 두개-> 괄호 사용해서 묶어야함
			if((100 <= y) && (y <= 200))
				System.out.println("(" + x + ", " + y +")는 사각형 안에 있습니다.");
			else
				System.out.println("사각형 안에 없습니다.");
		else
			System.out.println("사각형 안에 없습니다.");
		
		scanner.close();
	}
}
