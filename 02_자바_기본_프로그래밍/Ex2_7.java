package ex01;

public class Ex2_7 {

	public static void main(String[] args) {
		// 비교 연산
		System.out.println('a' >'b');
		System.out.println('c' >'b');     //아스키코드 순서
		System.out.println(3 >= 2);   
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));  
		// (부정(3과 2 다르니)) = (부정(참))= (거짓)
		
		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));     
		// T &&(and) F -> F
		System.out.println((3 != 2 ) || (-1 > 0)); 
		// T ||(or)  F -> T
		System.out.println((3 != 2) ^ (-1 > 0 ));   
		// T ^ (xor) F -> T

	}

}
