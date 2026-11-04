/*2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램을 작성하시오.
 * 한 줄에 한 단씩 출력한다.*/
package ex01;

public class Ex3_4 {

	public static void main(String[] args) {
		for(int i = 1; i<10; i++) {  
			// 1부터 10이전까지 반복, 중첩된 for문(탭으로 띈것까지) 실행 후 i+1
			for(int j = 1; j <10; j++) { 
				//i는 고정, j는 1부터 10이전까지 반복, 끝나면(\t까지 완료 후 ) j+1
				System.out.print(i + "*" + j + "=" + i*j); 
				// i값 * j값 = (i*j)값 출력
				System.out.print('\t'); 
				// 하나씩 탭으로 띄기
			}
			System.out.println();  
			// 한 단이 끝나면 다음 줄로 커서 이동됨
		}
	}
}