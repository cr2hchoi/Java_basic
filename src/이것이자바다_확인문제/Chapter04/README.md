# 📝 이것이 자바다 확인문제 - CH04

---

## 01. 조건문과 반복문

### Q. 조건문과 반복문에 대해 잘못 설명한 것은 무엇입니까?

- [ ] ➊ if 문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다.
- [x] ➋ switch 문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
- [ ] ➌ for 문은 카운터 변수로 지정한 횟수만큼 반복할 때 사용할 수 있다.
- [ ] ➍ break 문은 switch 문, for 문, while 문을 종료할 때 사용할 수 있다.

> **정답 : ➋**
>
> **해설 :**  
> `switch` 문에서는 `byte`, `short`, `char`, `int`, `String`, `enum` 타입 등을 사용할 수 있다.  
> 하지만 `double`, `float` 같은 실수 타입은 사용할 수 없다.

---

## 02. switch 표현식 (Switch Expression)

### Q. 기존 switch 문을 switch 표현식으로 변경하여 작성하세요.

### 기존 switch 문

```java
String grade = "B";
int score1 = 0;

switch (grade) {
    case "A":
        score1 = 100;
        break;

    case "B":
        int result = 100 - 20;
        score1 = result;
        break;

    default:
        score1 = 60;
}
```

### 변경된 switch 표현식

```java
String grade = "B";

int score1 = switch (grade) {
    case "A" -> 100;

    case "B" -> {
        int result = 100 - 20;
        yield result;
    }

    default -> 60;
};
```

> **해설 :**  
> switch 표현식에서는 `->` 기호를 사용한다.
>
> 여러 실행문을 작성할 경우 `{ }` 블록을 사용하며,  
> 값을 반환하기 위해 `yield` 키워드를 사용한다.

---

## 03. 3의 배수의 총합 구하기

### Q. for 문을 이용하여 1부터 100까지의 정수 중 3의 배수의 총합을 출력하는 코드를 작성하세요.

```java
public class Q3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("3의 배수의 총합: " + sum);
    }
}
```

> **해설 :**  
> `i % 3 == 0` 조건은 `i`가 3의 배수인지 확인하는 조건이다.
>
> 조건이 참일 때만 `sum`에 값을 누적하여 총합을 구한다.

---

## 04. 주사위 눈의 합이 5가 될 때까지 반복

### Q. while 문과 `Math.random()`을 사용하여 두 주사위 눈의 합이 5가 될 때까지 반복하는 코드를 작성하세요.

```java
public class Q4 {
    public static void main(String[] args) {

        while (true) {
            int num1 = (int)(Math.random() * 6) + 1;
            int num2 = (int)(Math.random() * 6) + 1;

            System.out.println("(" + num1 + ", " + num2 + ")");

            if (num1 + num2 == 5) {
                break;
            }
        }
    }
}
```

> **해설 :**  
> `Math.random()`은 0.0 이상 1.0 미만의 실수를 반환한다.
>
> `(Math.random() * 6) + 1`을 사용하면 1~6 범위의 정수를 만들 수 있다.
>
> 두 주사위 눈의 합이 5가 되면 `break` 문으로 반복을 종료한다.

---

## 05. 방정식의 해 구하기

### Q. 중첩 for 문을 이용하여 방정식 `4x + 5y = 60`의 모든 해를 `(x, y)` 형태로 출력하세요.
### (단, x와 y는 10 이하의 자연수)

```java
public class Q5 {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {

                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
```

> **해설 :**  
> 바깥쪽 반복문으로 `x` 값을 변화시키고,  
> 안쪽 반복문으로 `y` 값을 변화시키며 모든 경우를 검사한다.
>
> 조건식 `(4 * x) + (5 * y) == 60`이 참일 때만 결과를 출력한다.

---

## 06. 별 찍기 (for 문)

### Q. for 문을 이용하여 다음과 같은 실행 결과가 나오도록 코드를 작성하세요.

```text
*
**
***
****
*****
```

```java
public class Q6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

> **해설 :**  
> 바깥쪽 for 문은 줄 수를 반복한다.
>
> 안쪽 for 문은 현재 줄 번호(`i`)만큼 `*`을 출력한다.
>
> 한 줄 출력이 끝나면 `println()`으로 줄바꿈한다.

---

## 07. 은행 계좌 관리 프로그램

### Q. while 문과 `Scanner`의 `nextLine()` 메서드를 이용하여 예금, 출금, 조회, 종료 기능을 구현하세요.

```java
import java.util.Scanner;

public class Q7_BankAccountManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        boolean run = true;

        while (run) {

            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");

            int menuNo = Integer.parseInt(scanner.nextLine());

            switch (menuNo) {

                case 1:
                    System.out.print("예금액> ");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;

                case 2:
                    System.out.print("출금액> ");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;

                case 3:
                    System.out.println("잔고> " + balance);
                    break;

                case 4:
                    run = false;
                    break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
```

> **해설 :**  
> `scanner.nextLine()`으로 입력받은 문자열을  
> `Integer.parseInt()`를 이용해 정수로 변환한다.
>
> 메뉴 번호에 따라 예금, 출금, 잔고 조회 기능을 수행하며,  
> 4번 입력 시 `run = false`가 되어 반복문이 종료된다.