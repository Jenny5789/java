package ch6;

public class StringExample {
    public static void main(String[] args) {
        // 같은 패키지(ch6)에 있으므로 import 없이 MyString 사용 가능
        MyString ms = new MyString("   Hello Java World   ");
        
        System.out.println(ms.trim());
        System.out.println(ms.toLowerCase());
        System.out.println(ms.toUpperCase());
        System.out.println(ms.contains("JAVA"));
        System.out.println(ms.concat("!!!"));
        System.out.println(ms.replace("Java", "Python"));
        System.out.println(ms.substring(2));
        System.out.println(ms.compareTo("HELLO"));
    }
}