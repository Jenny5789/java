package ex01;
import java.util.Scanner;
public class Pra_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오: ");
		int total = scanner.nextInt();
				
		int a = (total/50000);
		total %= 50000;      // 나머지 금액으로 계산
		int b = (total/10000);
		total %= 10000;
		int c = (total/1000);
		total %= 1000;
		int d = (total/100);
		total %= 100;
		int e = (total/50);
		total %= 50;
		int f = (total/10);
		total %= 10;
		int g = (total/1);
		total %= 1;
		
		
		System.out.print("오만원권 " + a + "매, ");
		System.out.print("만원권 " + b + "매, ");
		System.out.print("천원권 " + c + "매, ");
		System.out.print("백원 " + d + "개, ");
		System.out.print("오십원 " + e + "개, ");
		System.out.print("십원 " + f + "개, ");
		System.out.print("일원 " + g + "개로 변환 출력된다.");
		
		scanner.close();
	}

}
