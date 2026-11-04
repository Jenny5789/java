package ex03;

class MyString {
	
	String str;
	char[] s = new char[50];
	
	public MyString(String str) {
		this.str = str;
		for(int i = 0; i <= str.length()-1; i++) 
			s[i] = str.charAt(i);
	}
	
	public String toString() {
		return str;
	}
	
	// 직접 구현
	public String concat(String str) {
		return "";
	}
	public String trim() {
		return "";
	}
	public String replace() {
		return "";
	}
	public String split() {
		return "";
	}
	public String substring() {
		return "";
	}
}

public class MyStringEx {
	public static void main(String[] args) {
		MyString str = new MyString("hello");
		System.out.println(str);
	}
}
