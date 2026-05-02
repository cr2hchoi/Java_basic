# 📝 이것이 자바다 확인문제 ch02

## 1. 변수의 특징
**Q. 변수에 대해 잘못 설명한 것은 무엇입니까?**
- [ ] ➊ 변수는 하나의 값만 저장할 수 있다.
- [ ] ➋ 변수는 선언 시에 사용한 타입의 값만 저장할 수 있다.
- [ ] ➌ 변수는 변수가 선언된 중괄호 { } 안에서만 사용 가능하다.
- [x] ➍ 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다.

> **정답: ➍**
> **해설**: 자바의 로컬 변수는 반드시 초기화(Initializaion)를 해야 읽기가 가능함. 초기화하지 않은 변수를 사용하면 컴파일 에러가 발생함.

---

## 2. 변수 명명 규칙
**Q. 변수 이름으로 사용할 수 없는 것을 모두 선택하세요.**
- [ ] ➊ modelName
- [x] ➋ class (자바 예약어 사용 불가)
- [x] ➌ 6hour (숫자로 시작할 수 없음)
- [ ] ➍ $value
- [ ] ➎ _age
- [x] ➏ #name (특수문자 # 사용 불가)
- [x] ➐ int (자바 예약어 사용 불가)
---

## 3. 자바의 기본 타입 (8개)
**Q. 다음 표의 빈 칸에 자바의 기본 타입 8개를 적어보세요.**

| 크기 | 1byte | 2byte | 4byte | 8byte |
| :--- | :--- | :--- | :--- | :--- |
| **정수타입** | **byte** | **short** | **int** | **long** |
| **문자타입** | | **char** | | |
| **실수타입** | | | **float** | **double** |
| **논리타입** | **boolean** | | | |

---

## 4. 타입, 변수 이름, 리터럴 구분
**Q. 다음 코드에서 타입, 변수 이름, 리터럴에 해당하는 것을 적어보세요.**
```java
int age;
age = 10;
double price = 3.14;
```
* 타입: int, double
* 변수 이름: age, price
* 리터럴: 10, 3.14

## 5. 자동 타입 변환 (Promotion)
**Q. 다음 자동 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.**

> byte byteValue = 10;
> 
> char charValue = 'A';
>
-[ ] ➊ int intValue = byteValue;
-[ ] ➋ int intValue = charValue;
-[x] ➌ short shortValue = charValue; (❌ 에러!)
-[ ] ➍ double doubleValue = byteValue;

**정답: ➌**

**해설:** char는 0~65535 범위로 음수가 없음
반면 short는 음수를 포함하는 타입이므로, char에서 short로의 자동 타입 변환은 불가능

---

## 6. 강제 타입 변환 (Casting)
**Q. 다음 강제 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.**

> int intValue = 10;
> char charValue = 'A';
> double doubleValue = 5.7;
> String strValue = "A";
>
-[ ] ➊ double var = (double) intValue;
-[ ] ➋ byte var = (byte) intValue;
-[ ] ➌ int var = (int) doubleValue;
-[x] ➍ char var = (char) strValue; (❌ 에러!)

**정답: ➍**

**해설:** String(참조 타입)과 char(기본 타입)은 근본적으로 형변환이 불가능합니다. 문자열을 문자로 바꾸려면 charAt() 등의 메서드를 써야 합니다.

---

## 7. 변수 초기화 오류
**Q. 변수를 잘못 초기화한 것은 무엇입니까?**

> ➊ int var1 = 10;
> ➋ long var2 = 10000000000L;
> ➌ char var3 = ''; (❌ 에러!)
> ➍ float var4 = 10;
> ➎ String var5 = "abc\ndef";

**정답: ➌**
**해설:** char 타입은 빈 리터럴('')을 허용하지 않습니다. 공백 한 칸이라도 있어야 합니다(' ').

---

## 8. 콘솔 입출력
**Q. 콘솔에 값을 입출력하는 방법에 대해 잘못 설명한 것을 선택하세요.**

-[ ] ➊ System.out.print(변수)는 변수값을 출력시키고 행을 바꾸지 않는다.
-[ ] ➋ System.out.println(변수)는 변수값을 출력시키고 행을 바꾼다.
-[x] ➌ System.out.printf(“형식”, 변수)는 주어진 형식대로 변수값을 바꾼다.
-[ ] ➍ Scanner의 nextLine() 메소드는 콘솔에 입력된 내용을 문자열로 읽는다.

**정답: ➌**
**해설:** printf는 출력 형식을 지정하는 메서드일 뿐이며, 변수에 저장된 실제 값을 변경하지 않습니다.

---

## 9. 연산식의 타입 변환
**Q. 연산식의 타입 변환 중에서 컴파일 에러가 발생하는 것을 선택하세요.**

> byte byteValue = 10;
> float floatValue = 2.5F;
> double doubleValue = 2.5;
>
- [x] ➊ byte result = byteValue + byteValue; (❌ 에러!)
- [ ] ➋ int result = 5 + byteValue; 
- [ ] ➌ float result = 5 + floatValue;
-[ ] ➍ double result = 5 + doubleValue;

**정답: ➊**
**해설:** 자바 정수 연산 시 byte, short 타입은 자동으로 int로 변환되어 계산됩니다. 따라서 byte + byte의 결과는 int이므로 byte 변수에 담을 수 없습니다.

---

## 10. 문자열을 기본 타입으로 변환
**Q. 문자열을 기본 타입으로 변환하는 코드로 틀린 것을 고르세요.**

> String str = "5";
>
-[ ] ➊ byte var1 = Byte.parseByte(str);
-[x] ➋ int var2 = Int.parseInt(str); (❌ 에러!)
-[ ] ➌ float var3 = Float.parseFloat(str);
-[ ] ➍ double var4 = Double.parseDouble(str);

**정답: ➋**
**해설:** 자바의 래퍼 클래스 이름은 Integer입니다. 즉, Integer.parseInt(str)라고 적어야 합니다.

---

## 11. 변수 사용 범위 (Scope)
**Q. 다음 코드에서 컴파일 에러가 발생하는 라인을 모두 적어보세요.**

> int v1 = 1;
> if(true) {
>     int v2 = 2;
>     if(true) {
>         int v3 = 2;
>         System.out.println("v3: " + v3);
>     }
>     System.out.println("v3: " + v3); // 에러 발생!
> }
> System.out.println("v2: " + v2); // 에러 발생!

**정답:** 안쪽 if문의 v3를 참조하는 라인, 바깥쪽 if문의 v2를 참조하는 라인

**해설:** 변수는 선언된 {} 블록 안에서만 생존합니다. 해당 블록이 끝나면 변수는 소멸됩니다.