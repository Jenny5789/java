/* (100,100) (200,200)의 두 점으로 이루어진 사각형이 있을 때, 
 * 정수 x 와 y값을 입력받고 점(x,y)가 이 직사각형 안에 있는지 판별하는 프로그램을 작성하시오 */
package ex01;
import java.util.Scanner;
public class Pra_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점(x,y)의 x 좌표를 입력하시오: ");
		int x = scanner.nextInt();
		
		System.out.println("점(x,y)의 y 좌표를 입력하시오: ");
		int y = scanner.nextInt();
		
		
		if((100 >= x) && ( x <= 200))      
			//if 안에 조건 두개-> 우선순위 적용된다. 원하는 값끼리 괄호로 묶어야함
			//우선순위: 증산시관비논삼대
			if((100 >= y) && (y <= 200))
				System.out.println("(" + x + ", " + y +")는 사각형 안에 있습니다.");
			else
				System.out.println("사각형 안에 없습니다.");
		else
			System.out.println("사각형 안에 없습니다.");
		
		scanner.close();
	}
}


// 교수님 풀이
// scanner 객체 생성
// Scanner scanner = new Scanner(System.in);

// 사용자로부터 x,y좌표 입력
// System.out.println("좌표 x와 y를 입력하세요ㅕ. >>");
// int x = scanner.nextInt();
// int y = scanner.nextInt();

// 사각형 범위인지 판단.
// if((100 >= x) && ( x <= 200) && (100 >= y) && ( y <= 200))

// 결과 출력
/// System.out.printf("(%d, %d)는 사각형 안에 있습니다.", x, y):
///		else
///	System.out.printf("(%d, %d)는 사각형 안에 없습니다.", x, y):

// scanner.close();
