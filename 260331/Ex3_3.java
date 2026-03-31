/*do-whil문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하시오.*/
package ex01;

public class Ex3_3 {

	public static void main(String[] args) {
		char c = 'a'; //char c는 문자 a로 선언
		
		do {
			System.out.print(c);;  
			c = (char) (c+1);      //작업문:하나씩 더해라(영어 오름차순:알파벳순)
		} while(c <= 'z');  // z 만날때 까지 반복해라
	}
}
