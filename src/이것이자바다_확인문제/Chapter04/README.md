# 📝 이것이 자바다 확인문제 ch04

## 1. 조건문과 반복문
**Q. 조건문과 반복문에 대해 잘못 설명한 것은 무엇입니까?**
- [ ] ➊ if 문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다.
- [x] ➋ switch 문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
- [ ] ➌ for 문은 카운터 변수로 지정한 횟수만큼 반복시킬 때 사용할 수 있다.
- [ ] ➍ break 문은 switch 문, for 문, while 문을 종료할 때 사용할 수 있다.

> **정답: ➋**
> **해설**: 자바의 `switch` 문에서 사용할 수 있는 변수(또는 식)의 타입은 `int` 타입을 포함한 정수형(byte, short, int, char)과 `String` 타입, 그리고 `Enum` 타입 등이다. `double`이나 `float` 같은 실수 타입은 `switch` 문의 조건으로 사용할 수 없다.

## 2. switch 표현식 (Switch Expression)
**Q. 왼쪽 switch 문을 Expression(표현식)으로 변경해서 작성해보세요.**

```java
// 기존 switch 문
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
* 변경된 switch 표현식
```
//변경된 표현식
int score1 = switch (grade) {
    case "A" -> 100;
    case "B" -> {
        int result = 100 - 20;
        yield result;
    }
    default -> 60;
};
```
* 해설
> 해설: i % 3 == 0 조건식은 i를 3으로 나누었을 때 나머지가 0인 경우, 즉 i가 3의 배수임을 의미한다. 이 조건을 만족할 때만 sum에 i 값을 더한다.

## 3. 3의 배수의 총합 구하기
**Q. for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성해보세요.**

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

## 4. 주사위 눈의 합이 5가 될 때까지 반복
**Q. while 문과 Math.random()을 사용하여 두 주사위의 합이 5가 될 때까지 반복하고, 각 눈을 (눈1, 눈2) 형태로 출력하는 코드를 작성해보세요.**

```java
public class Q4 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            
            System.out.println("(" + num1 + ", " + num2 + ")");
            
            if (num1 + num2 == 5) {
                break;
            }
        }
    }
}
``` 
* 해설
> 해설: Math.random() * 6은 0.0에서 5.99... 사이의 실수 값을 반환한다. 여기에 1을 더하고 int로 강제 형변환하면 1에서 6 사이의 정수 값을 얻을 수 있다. 눈의 합이 5가 되는지 매번 if 문으로 검사하여 루프를 탈출한다.

## 5. 방정식의 해 구하기
**Q. 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성해보세요. (단, x와 y는 10 이하의 자연수입니다.)**

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
* 해설
> 해설: x가 1부터 10까지 변할 때마다, 각 경우에 대해 y도 1부터 10까지 대입해보며 방정식의 결과가 60이 되는 조합을 찾는다. 자연수 조건(1 이상 10 이하)을 모두 검사하므로 모든 해를 빠짐없이 구할 수 있다.

## 6. 별 찍기 (for 문)
**Q. for 문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.**
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
* 해설
> 해설: 바깥쪽 for 문이 1부터 5까지 반복될 때, 안쪽 for 문은 1부터 i까지 반복하며 *를 출력한다. 한 줄의 출력이 끝날 때마다 System.out.println()을 호출하여 줄 바꿈을 수행한다.

## 7. 은행 계좌 관리 프로그램
**Q. while 문과 Scanner의 nextLine() 메소드를 이용해서 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.**

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
                    System.out.print("예금액>");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
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
* 해설
> 해설: Integer.parseInt(scanner.nextLine())을 사용하여 입력받은 문자열을 정수로 변환한다. 메뉴 선택 번호에 따라 balance 변수의 값을 증감시키거나 현재 상태를 출력하며, 4번 선택 시 run 변수를 false로 바꾸어 루프를 종료한다.