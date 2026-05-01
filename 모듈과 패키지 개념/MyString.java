package ch6;

public class MyString { // public 유지 가능
    String str;
    
    public MyString(String str) {
        this.str = str;
    }
    
    public int length() {
        return str.length();
    }

    public String trim() {
        String trimStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                trimStr += str.charAt(i);
            }
        }
        this.str = trimStr;
        return trimStr;
    }

    public String toLowerCase() {
        String lowerStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32);
            lowerStr += ch;
        }
        this.str = lowerStr;
        return lowerStr;
    }

    public String toUpperCase() {
        String upperStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char) (ch - 32);
            upperStr += ch;
        }
        this.str = upperStr;
        return upperStr;
    }

    public boolean contains(String s) {
        for (int i = 0; i <= str.length() - s.length(); i++) {
            String temp = "";
            for (int j = i; j < i + s.length(); j++) {
                temp += str.charAt(j);
            }
            if (temp.equals(s)) return true;
        }
        return false;
    }

    public String concat(String add) {
        this.str = this.str + add;
        return this.str;
    }

    public String replace(String target, String replacement) {
        int x = -1, y = -1;
        out: for (int i = 0; i <= str.length() - target.length(); i++) {
            String temp = "";
            for (int j = i; j < i + target.length(); j++) {
                temp += str.charAt(j);
            }
            if (target.equals(temp)) {
                y = i; 
                x = i + target.length() - 1;
                break out;
            }
        }
        if (x == -1) return str;
        String outStr = str.substring(0, y) + replacement + str.substring(x + 1);
        this.str = outStr;
        return outStr;
    }

    public String substring(int beginIndex) {
        String subStr = "";
        for (int i = beginIndex; i < str.length(); i++) {
            subStr += str.charAt(i);
        }
        this.str = subStr;
        return subStr;
    }

    public int compareTo(String anotherString) {
        int minLen = Math.min(str.length(), anotherString.length());
        for (int i = 0; i < minLen; i++) {
            if (str.charAt(i) != anotherString.charAt(i)) {
                return str.charAt(i) - anotherString.charAt(i);
            }
        }
        return str.length() - anotherString.length();
    }
}
