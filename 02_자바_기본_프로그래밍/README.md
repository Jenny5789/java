# 2장. 자바 기본 프로그래밍

📅 2026-03-24

## 예제
4. [Scanner로 이름, 도시, 나이, 체중, 독신 여부 입력받기](./Ex2_4.java)
5. [정수 입력받기](./Ex2_5.java)
6. [대입 연산자 (`+=`, `-=` …)](./Ex2_6.java)
7. [비교 연산 (문자 비교 = 아스키코드 순서)](./Ex2_7.java)
8. [조건 연산자 `? :` 로 두 수의 차 구하기](./Ex2_8.java)
9. [비트 논리 연산](./Ex2_9.java)
10. [if 문](./Ex2_10.java)
11. [if-else 로 3의 배수 판별](./Ex2_11.java)
12. [다중 if 로 학점 매기기](./Ex2_12.java)
13. [중첩 if 문](./Ex2_13.java)
14. [switch 로 학점 매기기](./Ex2_14.java)
15. [switch 로 커피 주문](./Ex2_15.java)

## 실습 문제
1. [원화 → 달러 변환](./Pra_1.java)
2. [금액을 오만원권 ~ 50원 동전으로 나누기](./Pra_2.java)
3. [세 변의 길이로 삼각형 판별](./Pra_3.java)
4. [점이 사각형 안에 있는지 판별](./Pra_4.java)
5. [점이 원 안에 있는지 판별](./Pra_5.java)
6. [달을 입력받아 계절 출력](./Pra_6.java)

## 핵심 코드

```java
// Ex2_11 : if ~ else 는 둘 중 하나만 실행된다
Scanner in = new Scanner(System.in);
int number = in.nextInt();

if (number % 3 == 0)
    System.out.println("3의 배수입니다.");
else
    System.out.println("3의 배수가 아닙니다.");
in.close();
```
