/* 원의 중심을 난타내는 한 점과 반지름을 실수 값으로 입력받고, 
 * 실수 값으로 다른 (x,y)를 입력받아 이 점이 원의 내부에 있는지를 판별하여 출력하시오*/

package ex01;
import java.util.Scanner;
public class Pra_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("원의 중심점(x,y)의 x 좌표를 입력하시오: ");
		double x = scanner.nextDouble();
		System.out.print("원의 중심점(x,y)의 y 좌표를 입력하시오: ");
		double y = scanner.nextDouble();
		System.out.println("반지름을 입력하시오: ");
		double r = scanner.nextDouble();
		System.out.print("다른 원의 중심점(p,q)의 p 좌표를 입력하시오: ");
		double p = scanner.nextDouble();
		System.out.print("다른 원의 중심점(p,q)의 q 좌표를 입력하시오: ");
		double q = scanner.nextDouble();

		if((((x-p)*(x-p))+((y-q)*(y-q)))<(r*r))
			System.out.println("점 (" + p +"," + q + ")은 원 안에 있습니다.");
		else
			System.out.println("원 안에 없습니다.");
			
		
		scanner.close();	
	}

}


// 교수님 풀이
//scanner 객체 생성
// Scanner scanner = new Scanner(System.in);
// 원의 중심과 반지름 입력
//System.out.println("원의 중심과 반지름을 입력하세요. >>";)
// int 원중심x = scanner.nextInt();
// int 원중심y = scanner.nextInt();

// double 반지름 = scanner.nextDouble();
// 점의 좌표를 입력 받는다.
// System.out.println("점의 좌표를 입력하세요. >>");
// int 점x = scanner.nextInt();
// int 점y = scanner.nextInt();

// 범위 내.외 판단
// int x거리 = 원중심x - 점x;
// int y거리 = 원중심y - 점y;

// 삼각비를 활용한 원점에서의 거리 구하기
// double 길이 = Math.sqrt(Math.pow(x거리,2) + Math.pow(y거리, 2));
// System.out.println("반지름 길이 확인: " + 길이);
// 결과 출력
// if(반지름 > 길이)
//	System.out.printf("점(%d,%d)는 원 안에 있습니다.", 점x, 점y);
// else
//	System.out.printf("점(%d,%d)는 원 밖에 있습니다.", 점x, 점y);