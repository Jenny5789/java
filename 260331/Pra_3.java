/* scanner 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고, 
 * 3개의 수로 삼각형을 만들 수 있는지 판별하라) */
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


// 교수님풀이
// scanner 객체 생성
//System.out.println("정수 3개 중 가장 큰 수를 입력하세요. >> ");

// 정수 3개 입력
// int p1  = scanner.nextInt();
// int p2  = scanner.nextInt();
// int p3  = scanner.nextInt();
 
//삼각형 판단(두 정수의 합이 나머지 정수보다 크다)
//if(p1 + p2 > p3) {
//	if(p1 + p3 > p2) {
//		if(p2 + p3 > p1) {
//			System.out.println("삼각형이다.");
//			}
//			else {
//				System.out.println("삼각형이 아니다.");
//			}
//		}
//	}
//	scanner.close();
//}



// 정수 3개 입력
// if(p1 + p2 > p3 && p1 + p3 > p2  && p2 + p3 > p1);
/// 	System.out.println("삼각형이다.");
/// else
/// 	System.out.println("삼각형이 아니다.");
///
/// 
/// 
//결과 출력 
/// scanner.close();

 
