/* 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원동전, 100원 동전 ,50원 동전
 * 10원 동전,1원 동전 , 각각 몇 개로 출력하시오.*/
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
/* 교수님 요령
 // scanner 객체 생성
 Scanner scanner = new Scanner(System.in);*/
 
 /*// 금액을 입력 받기
 System.out.println("금액을 입력하시오. >> ");*/
  
// /*int won = scanner.nextInt();
 
// // 만원은 오만원으로 나눈 나머지를 10000으로 나눈다.
 // 같은 과정을 일원까지 반복 진행  
 // 오만원권 계산(원금에서 50000으로 나눈 몫)
// int 오만원 = won / 50000;
// systtem.out.println("오만원권 " + 오만원 + "매,");
 //int 잔액 = won % 50000;
 
 // 만원권 계산(원금에서 10000으로 나눈 몫)
 //int 만원 = 잔액 / 10000;
 // systtem.out.println("만원권 " + 만원 + "매,");
 //잔액 = 잔액 % 10000;
 
 // 천원권 계산(원금에서 1000으로 나눈 몫)
 //int 천원 = 잔액 / 1000;
 //systtem.out.println("천원권 " + 천원 + "매,");
 //잔액 = 잔액 % 1000;
 
  // 백원 계산(원금에서 100으로 나눈 몫)
 //int 천원 = 잔액 / 100;
// systtem.out.println("백원 " + 백원 + "매,");
// 잔액 = 잔액 % 100;
 
  // 오십원 계산(원금에서 50으로 나눈 몫)
// int 천원 = 잔액 / 50;
 //systtem.out.println("천원권 " + 오십원 + "개,");
// 잔액 = 잔액 % 50;
 
  // 십원 계산(원금에서 10으로 나눈 몫)
// int 천원 = 잔액 / 10;
// systtem.out.println("십원 " + 십원 + "개,");
// 잔액 = 잔액 % 10;
 
  // 일원 계산(원금에서 1으로 나눈 몫)
// int 천원 = 잔액 / 1;
// systtem.out.println("일원 " + 일원 + "개,");
 //잔액 = 잔액 % 1;*/
 


// scannner.close(); 