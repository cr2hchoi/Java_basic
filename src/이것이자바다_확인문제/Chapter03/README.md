# 📝 이것이 자바다 확인문제 - CH03

---

## 01. 연산자의 증감 연산

### Q. 다음 코드를 실행했을 때 출력 결과를 작성하세요.

```java
int x = 10;
int y = 20;
int z = (++x) + (y--);

System.out.println(z);
```

> **정답 :** `31`
>
> **해설 :**  
> `++x`는 전위 증가 연산자로 먼저 1 증가한 뒤 연산에 사용된다.  
> 따라서 `x`는 11이 된다.
>
> `y--`는 후위 감소 연산자로 현재 값인 20을 먼저 사용한 뒤 감소한다.  
> 따라서 계산 결과는 `11 + 20 = 31` 이다.

---

## 02. 삼항 연산자

### Q. 다음 코드를 실행했을 때 출력 결과를 작성하세요.

```java
int score = 85;

String result = (!(score > 90)) ? "가" : "나";

System.out.println(result);
```

> **정답 :** `가`
>
> **해설 :**  
> `score > 90`은 `85 > 90` 이므로 `false`이다.  
> 여기에 `!` 연산자를 적용하면 `true`가 된다.
>
> 따라서 삼항 연산자의 참 값인 `"가"`가 출력된다.

---

## 03. 산술 연산자 (나눗셈과 나머지)

### Q. 534자루의 연필을 30명의 학생에게 똑같이 나누어 줄 때, 빈칸에 들어갈 알맞은 코드를 작성하세요.

```java
int pencils = 534;
int students = 30;

// 학생 한 명이 가지는 연필 수
int pencilsPerStudent = ( pencils / students );
System.out.println(pencilsPerStudent);

// 남은 연필 수
int pencilsLeft = ( pencils % students );
System.out.println(pencilsLeft);
```

> **정답 :**  
> `pencils / students`  
> `pencils % students`
>
> **해설 :**  
> `/` 연산자는 나눗셈의 몫을 구한다.  
> `%` 연산자는 나눗셈 후 남은 나머지를 구한다.

---

## 04. 산술 연산자를 이용한 자리수 버림

### Q. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 `value`의 값이 356일 때 300이 출력되도록 빈칸에 들어갈 코드를 작성하세요.

```java
int value = 356;

System.out.println(value / 100 * 100);
```

> **정답 :** `value / 100 * 100`
>
> **해설 :**  
> 정수 나눗셈은 소수점을 버린다.
>
> `356 / 100`의 결과는 `3`이며,  
> 여기에 다시 `100`을 곱하면 `300`이 된다.

---

## 05. 사다리꼴의 넓이

### Q. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확한 실수 결과가 나오도록 빈칸에 들어갈 수 있는 코드를 모두 선택하세요.

```java
int lengthTop = 5;
int lengthBottom = 10;
int height = 7;

double area = ( );

System.out.println(area);
```

- [x] ➊ (lengthTop + lengthBottom) * height / 2.0
- [x] ➋ (lengthTop + lengthBottom) * height * 1.0 / 2
- [x] ➌ (double)(lengthTop + lengthBottom) * height / 2
- [ ] ➍ (double)((lengthTop + lengthBottom) * height / 2)

> **정답 : ➊ ➋ ➌**
>
> **해설 :**  
> 실수 연산 결과를 얻으려면 연산 과정에 `double` 또는 `float` 타입이 포함되어야 한다.
>
> ➍번은 정수 연산이 먼저 수행된 뒤 `double`로 변환되므로,  
> 이미 소수점 정보가 사라진 상태이다.

---

## 06. 비교 및 논리 연산자

### Q. 다음 연산식의 출력 결과를 작성하세요.

```java
int x = 10;
int y = 5;

System.out.println((x > 7) && (y <= 5));
System.out.println((x % 3 == 2) || (y % 2 != 1));
```

> **정답 :**
>
> ```text
> true
> false
> ```
>
> **해설 :**  
> `(10 > 7)`은 `true`이고 `(5 <= 5)`도 `true`이므로  
> `true && true`의 결과는 `true`이다.
>
> `(10 % 3 == 2)`는 `1 == 2`이므로 `false`이고,  
> `(5 % 2 != 1)`은 `1 != 1`이므로 `false`이다.
>
> 따라서 `false || false`의 결과는 `false`이다.

---

## 07. NaN 검사

### Q. NaN 값을 검사하여 올바른 결과가 출력되도록 빈칸에 들어갈 코드를 작성하세요.

```java
double x = 5.0;
double y = 0.0;

double z = 5 % y;

if (Double.isNaN(z)) {
    System.out.println("0.0으로 나눌 수 없습니다.");
} else {
    double result = z + 10;
    System.out.println("결과: " + result);
}
```

> **정답 :** `Double.isNaN(z)`
>
> **해설 :**  
> 자바의 실수 연산에서 `0.0`으로 나누거나 나머지 연산을 수행하면  
> `NaN(Not a Number)` 값이 발생할 수 있다.
>
> 이를 검사하기 위해 `Double.isNaN()` 메서드를 사용한다.