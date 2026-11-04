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
