package ex01;

public class Quiz2 {

	public static void main(String[] args) {
		int intArray[][] = new int[5][];
		intArray[0] = new int[5];
		intArray[1] = new int[6];
		intArray[2] = new int[7];
		intArray[3] = new int[8];
		intArray[4] = new int[9];
		
		System.out.println("*");
	/*
	 * //사각형
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) 
				System.out.print("*");
			

	//삼각형
		for(int i = 0 ; i< 5 ; i++) {
			for(int j = 0; j < (i+1); j++) 
				System.out.print("*");

	//안에 작은 삼각형
		int i = 0;
		for(int i = 0 ; i< 9 ;i++) {
			for(int j = 0; j < (i-1); j++)
				System.out.print("*");
		*/
			
		// 직각삼각형
		for(int i = 0 ; i< 5 ; i++) {
			for(int j = 0; j < 5; j++)
				if(j == 0 || i == 4 || i==j)
				System.out.print("*");
				else
				System.out.print(" ");
			
			
			System.out.println();
		}
		
		// 직각삼각형
		for(int i = 0 ; i< 5 ; i++) {
			for(int j = 4; j >= 0; j--)
				if(j == 0 || i == 4 || i == j)
				System.out.print("*");
				else
				System.out.print(" ");
			
			
			System.out.println();
		}
		
		//빈 삼각형
		for(int i = 0 ; i< 5 ; i++) {
			for(int j = 0; j <= 8; j++ )
				if( i == 4 || i+j == 4 || j-i == 4)
				System.out.print("*");
				else
				System.out.print(" ");
			
			
			System.out.println();
		}
		//나비
		for(int i = 0 ; i< 17 ; i++) {
			for(int j = 0; j <= 17; j++ )
				if( j == 0 || i+j == 17 || i == j || j == 17 || j == 8 ||j==9)
				System.out.print("*");
				else
				System.out.print(" ");
			
			
			System.out.println();
		}
	}
}
