# 📝 이것이 자바다 확인문제 ch03

## 1. 연산자의 증감 연산
**Q. 다음 코드를 실행했을 때 출력 결과를 작성해보세요.**
```java
int x = 10;
int y = 20;
int z = (++x) + (y--);
System.out.println(z);
```

정답: **31**

* 해설: ++x는 전위 증가 연산자로 x를 11로 만든 뒤 식에 적용하고, y--는 후위 감소 연산자로 현재 값인 20을 식에 먼저 사용한 뒤 y를 19로 만든다.
따라서 11 + 20 = 31이 됨 

## 2. 삼항 연산자
**Q. 다음 코드를 실행했을 때 출력 결과를 작성해보세요.**

```java
int score = 85;
String result = (!(score>90))? "가":"나";
System.out.println(result);
```

정답: **가**
* 해설: score > 90은 85 > 90으로 false이다. 이를 !(NOT) 연산했으므로 결과는 true가 되어 참일 때의 값인 "가"가 선택된다.

## 3. 산술 연산자 (나눗셈과 나머지)
**Q. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때, ( )에 들어갈 알맞은 코드를 차례대로 작성해보세요.**

```java
int pencils = 534;
int students = 30;
//학생 한 명이 가지는 연필 수
int pencilsPerStudent = ( pencils / students );
System.out.println(pencilsPerStudent);
//남은 연필 수
int pencilsLeft = ( pencils % students );
System.out.println(pencilsLeft);
```
정답: **pencils / students, pencils % students**
* 해설: 나눗셈 연산자(/)는 몫을 구하며, 나머지 연산자(%)는 나누고 남은 값을 구한다.

## 4. 산술 연산자를 이용한 자리수 버림
**Q. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도록 ( )에 알맞은 코드를 작성하세요(산술 연산자만 사용).**

```java
int value = 356;
System.out.println( value / 100 * 100 );
```

정답: **value / 100 * 100**
* 해설: 정수 나눗셈은 소수점을 버린다. 356 / 100을 수행하면 3이 되고, 여기에 다시 100을 곱하면 300이 되어 십의 자리 이하가 버려진다.

## 5. 사다리꼴의 넓이
**Q. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수 자릿수가 나올 수 있도록 ( ) 에 들어갈 수 있는 코드를 모두 선택하세요.**

```java
int lengthTop = 5;
int lengthBottom = 10;
int height = 7;
double area = ( );
System.out.println(area);
```
- ➊ (lengthTop+lengthBottom ) * height / 2.0
- ➋ (lengthTop+lengthBottom ) * height * 1.0 / 2
- ➌ (double )(lengthTop+lengthBottom ) * height / 2
- ➍ (double )((lengthTop+lengthBottom ) * height / 2 )

정답: **➊, ➋, ➌**
* 해설: 나눗셈 연산 시 피연산자 중 하나 이상이 실수(double 또는 float)여야 실수 결과값이 도출된다. ➍번은 정수 연산을 먼저 수행한 후 double로 변환하므로 소수점 정보가 이미 사라진 상태이다.

## 6. 비교 및 논리 연산자
**Q. 다음 연산식의 출력 결과를 작성해보세요.**

```java
int x = 10;
int y = 5;
System.out.println( (x>7) && (y<=5) );
System.out.println( (x%3 == 2) || (y%2 != 1) );
```
정답:
> true \
> false

* 해설 
* * (10>7)은 true이고, (5<=5)도 true이므로 true && true의 결과는 true이다.
* * (10%3 == 2)는 1 == 2로 false이고, (5%2 != 1)은 1 != 1로 false이므로 false || false의 결과는 false이다.

## 7. NaN 검사
**Q. NaN 값을 검사해서 올바른 결과가 출력될 수 있도록 ( )에 들어갈 코드를 작성해보세요.**

```java
double x = 5.0;
double y = 0.0;
double z = 5 % y;
if ( Double.isNaN(z) ) {
    System.out.println("0.0으로 나눌 수 없습니다.");
} else {
    double result = z + 10;
    System.out.println("결과: " + result);
}
```
정답: **Double.isNaN(z)** 
* 해설: 자바의 부동소수점 연산에서 0.0으로 나누거나 나머지 연산을 할 경우 NaN(Not a Number)이 발생한다. 이를 확인하기 위해 Double.isNaN() 메서드를 사용한다.