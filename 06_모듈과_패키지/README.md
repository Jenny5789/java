# 6장. 모듈과 패키지

📅 2026-04-28 ~ 2026-05-01

`String` 클래스의 메소드(`trim`, `replace`, `concat` …)를 직접 구현한 `MyString` 클래스.
처음 초안부터 완성본까지 버전별로 남겨 두었습니다.

## 파일

| 파일 | 단계 | 내용 |
|:---|:---:|:---|
| [MyStringEx_v1](./MyStringEx_v1.java) | 초안 | 클래스 뼈대와 메소드 이름만 작성 |
| [MyStringEx_v2](./MyStringEx_v2.java) | 구현 중 | `concat`, `trim`, `replace` 구현 |
| [MyStringEx_v3](./MyStringEx_v3.java) | 구현 중 | `split`, `toLowerCase`, `toUpperCase` 자리 추가 (미완성) |
| [MyString](./MyString.java) | 완성본 | `length`, `trim`, `toLowerCase`, `toUpperCase`, `contains`, `concat`, `replace`, `substring`, `compareTo` |
| [StringExample](./StringExample.java) | 실행 | 같은 패키지(`ch6`)의 `MyString` 을 import 없이 사용 |

## 핵심 코드

```java
// 공백 제거 : 공백이 아닌 글자만 이어 붙인다
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

// 대문자 → 소문자 : 'A'~'Z' 는 아스키코드 +32
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
```

## StringExample 실행 결과

```
HelloJavaWorld
hellojavaworld
HELLOJAVAWORLD
true
HELLOJAVAWORLD!!!
HELLOJAVAWORLD!!!
LLOJAVAWORLD!!!
4
```
