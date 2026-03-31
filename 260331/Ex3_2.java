/*while문을 이용하여 정수를 여러 개 입력받고 평균을 출력하라. -1이 입력되면 입력을 종료한다.*/
package ex01;

import java.util.Scanner;
public class Ex3_2 {
	public static void main(String[] args) {
		int count=0; // count는 입력된 정수의 개수
		int sum=0;  // sum은 합
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt(); // 정수입력
		while(n != -1) { // -1이 아닐동안
			sum += n; // n값을 합해라
			count++; // 입력된 정수 개수 count
			n = scanner.nextInt();  // 정수입력
		}
		if(count == 0) System.out.println("입력된 수가 없습니다."); 
		// 입력된 숫자가 없을 경우
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			// count를 count값에 프린트
			System.out.println("평균은 " + (double)sum/count + "입니다.");
			// 실수형으로 sum/count 값 프린트
		}
		scanner.close();
	}
}
