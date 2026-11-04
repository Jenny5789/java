package ex01;

public class Ex2_9 {

	public static void main(String[] args) {
		short a = (short)0x55ff;  // a = 0101 0101 1111 1111
		short b = (short)0x00ff;  // b = 0000 0000 1111 1111
		
		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a&b)); 
		// 비트 AND  
		System.out.printf("%04x\n", (short)(a|b)); 
		// 비트 or
		System.out.printf("$04x\n", (short)(a^b));
		// 비트 XOR
		System.out.printf("$04x\n", (short)(~a)); 
		// 비트 NOT
		 
		byte c = 20; // 0x14    c = 0000 0000 0001 0100
		byte d = -8; // 0x18    d = 1111 1111 1111 1000
				
		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2); 
		// c를 2비트 왼쪽 시프트 
		// c = 0000 0000 0101 0000 = 80
		System.out.println(c >> 2);
		// c를 2비트 오른족 시프트, 0 삽입
		// c = 0000 0000 0000 0101 = 5
		System.out.println(d >> 2); 
		// d를 2비트 오른족 시프트 삽입 1삽입
		// d = 1111 1111 1111  1110(부호 비트 1 -> 음수로 변경)
		// 1의 보수 = 0000 0000 0000 0001
		// 1의 보수 + 1 = 0000 0000 0000 0010 = -2
		System.out.printf("%x\n", (d >>> 2)); 
		// d를 2비트 오른족 시프트 삽입 0 삽입
		// d = 0011 1111 1111 1110(부호비트 0 -> 그대로 읽음) = 3FFE(16진수)
		// 흐으으으음 왜 32bit로 해야하나??
		}

}
