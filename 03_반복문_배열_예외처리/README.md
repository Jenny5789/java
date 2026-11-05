# 3장. 반복문, 배열, 예외 처리

📅 2026-03-31 ~ 2026-04-13

## TIL
1. [자바 기초 1 연습문제 풀이 (자료형, printf), 반복문 이론](./2026-03-31_TIL.ipynb)
2. [배열 (1차원, 2차원, 비정방형), 레퍼런스 변수](./2026-04-07_TIL.ipynb)

## 예제
1. [for 문으로 1~10 덧셈식과 합 출력](./Ex3_1.java)
2. [while 문으로 입력한 정수들의 평균 (-1 이면 종료)](./Ex3_2.java)
3. [do-while 문으로 'a' ~ 'z' 출력](./Ex3_3.java)
4. [중첩 for 문으로 구구단 출력](./Ex3_4.java)
5. [continue 로 양수만 더하기](./Ex3_5.java)
6. ["exit" 입력 시 break 로 종료](./Ex3_6.java)

## 실습 문제
1. [원화 → 달러 변환 (+ 교수님 풀이 요령)](./Pra_1.java)
    - [printf 로 다시 풀기](./Extra.java)
2. [금액을 오만원권 ~ 50원 동전으로 나누기](./Pra_2.java)
3. [세 변의 길이로 삼각형 판별](./Pra_3.java)
4. [점이 사각형 안에 있는지 판별](./Pra_4.java)
5. [점이 원 안에 있는지 판별](./Pra_5.java)
6. [달을 입력받아 계절 출력](./Pra_6.java)

## 별 찍기
1. [직각삼각형, 빈 삼각형, 나비](./Quiz2.java)
2. [풍차](./Windmill.java)

## 핵심 코드

```java
// Ex3_4 : 중첩 for 문으로 구구단
for (int i = 1; i < 10; i++) {        // 단
    for (int j = 1; j < 10; j++) {    // 곱하는 수
        System.out.print(i + "*" + j + "=" + i * j);
        System.out.print('\t');
    }
    System.out.println();             // 한 단이 끝나면 줄바꿈
}
```

```java
// Windmill : 조건식 하나로 풍차 모양 찍기
for (int i = 0; i < 16; i++) {
    for (int j = 0; j <= 16; j++)
        if (i == j || i + j == 16 || i == 7 || j == 8
            || (i < 8 && j == 0) || (i >= 7 && j == 15)
            || (j <= 8 && i == 15) || (j >= 8 && i == 0))
            System.out.print("*");
        else
            System.out.print(" ");
    System.out.println();
}
```
