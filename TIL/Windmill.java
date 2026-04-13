package ex01;

public class Windmill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< 16 ; i++) {
			for(int j = 0; j <= 16; j++ )
				if(i == j || i+j == 16 || i == 7 || j == 8 || (i < 8 && j == 0)||(i >= 7 && j == 15)||(j <= 8 && i == 15)||(j >= 8 && i == 0))
				System.out.print("*");
				else
				System.out.print(" ");
			
			
			System.out.println();
		}
	}
}