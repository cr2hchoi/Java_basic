# 📝 이것이 자바다 확인문제 - CH06

---

## 01. 객체와 클래스

### Q. 객체와 클래스에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 클래스는 객체를 생성하기 위한 설계도(청사진)와 같다.
- [ ] ➋ `new` 연산자로 생성자를 호출하여 객체를 생성한다.
- [x] ➌ 하나의 클래스로 하나의 객체만 생성할 수 있다.
- [ ] ➍ 객체는 클래스의 인스턴스이다.

> **정답 : ➌**
>
> **해설 :**  
> 클래스는 객체를 생성하기 위한 설계도일 뿐이다.
>
> 하나의 클래스로부터 `new` 연산자를 사용하여 여러 개의 객체를 생성할 수 있다.

---

## 02. 클래스의 구성 멤버

### Q. 클래스의 구성 멤버가 아닌 것은 무엇입니까?

- [ ] ➊ 필드(field)
- [ ] ➋ 생성자(constructor)
- [ ] ➌ 메소드(method)
- [x] ➍ 로컬 변수(local variable)

> **정답 : ➍**
>
> **해설 :**  
> 클래스의 구성 멤버는 필드, 생성자, 메소드이다.
>
> 로컬 변수는 생성자나 메소드 내부에서 선언되며,  
> 실행 블록이 끝나면 소멸된다.

---

## 03. 필드, 생성자, 메소드

### Q. 필드, 생성자, 메소드에 대한 설명으로 틀린 것은 무엇입니까?

> 문제 원본 누락

---

## 04. 필드에 대한 설명

### Q. 필드에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 필드는 메소드에서 사용할 수 있다.
- [ ] ➋ 인스턴스 필드는 생성자에서 초기화할 수 있다.
- [x] ➌ 필드는 반드시 생성자 선언 전에 선언되어야 한다.
- [ ] ➍ 필드는 초기값을 주지 않아도 기본값으로 자동 초기화된다.

> **정답 : ➌**
>
> **해설 :**  
> 자바에서는 클래스 내부라면 필드를 어디에 선언하든 상관없다.
>
> 일반적으로 가독성을 위해 필드를 상단에 선언하는 경우가 많다.

---

## 05. 생성자에 대한 설명

### Q. 생성자에 대한 설명으로 틀린 것은 무엇입니까?

- [x] ➊ 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다.
- [ ] ➋ 생성자는 다른 생성자를 호출하기 위해 `this()`를 사용할 수 있다.
- [ ] ➌ 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다.
- [ ] ➍ 외부에서 객체 생성을 막기 위해 생성자에 `private` 접근 제한자를 사용할 수 있다.

> **정답 : ➊**
>
> **해설 :**  
> 자바에서 객체는 반드시 생성자를 호출해야 생성된다.
>
> 생성자를 작성하지 않으면 컴파일러가 기본 생성자를 자동 추가한다.

---

## 06. 메소드에 대한 설명

### Q. 메소드에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 리턴값이 없는 메소드는 리턴 타입을 `void`로 지정해야 한다.
- [ ] ➋ 리턴 타입이 있는 메소드는 `return` 문이 필요하다.
- [ ] ➌ 매개변수 개수를 모를 경우 `...`를 사용할 수 있다.
- [x] ➍ 메소드 이름은 중복 선언할 수 없다.

> **정답 : ➍**
>
> **해설 :**  
> 자바에서는 메소드 오버로딩을 지원한다.
>
> 매개변수의 타입, 개수, 순서가 다르면  
> 동일한 이름의 메소드를 여러 개 선언할 수 있다.

---

## 07. 메소드 오버로딩

### Q. 메소드 오버로딩에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 동일한 이름의 메소드를 여러 개 선언하는 것이다.
- [x] ➋ 반드시 리턴 타입이 달라야 한다.
- [ ] ➌ 매개변수의 타입, 개수, 순서를 다르게 해야 한다.
- [ ] ➍ 매개값의 타입 및 수에 따라 호출 메소드가 결정된다.

> **정답 : ➋**
>
> **해설 :**  
> 메소드 오버로딩은 매개변수 정보가 달라야 성립한다.
>
> 리턴 타입만 다른 것은 오버로딩으로 인정되지 않는다.

---

## 08. 인스턴스 멤버와 정적 멤버

### Q. 인스턴스 멤버와 정적 멤버에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 정적 멤버는 `static`으로 선언된 필드와 메소드를 말한다.
- [x] ➋ 인스턴스 필드는 생성자 및 정적 블록에서 초기화할 수 있다.
- [ ] ➌ 정적 필드와 정적 메소드는 객체 생성 없이 사용할 수 있다.
- [ ] ➍ 인스턴스 필드와 메소드는 객체 생성 후 사용해야 한다.

> **정답 : ➋**
>
> **해설 :**  
> 인스턴스 필드는 객체 생성 이후 메모리에 할당된다.
>
> 따라서 생성자에서는 초기화 가능하지만,  
> 정적 블록에서는 초기화할 수 없다.

---

## 09. final 필드와 상수

### Q. final 필드와 상수(static final)에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ final 필드와 상수는 초기화 후 값을 변경할 수 없다.
- [x] ➋ final 필드와 상수는 생성자에서 초기화할 수 있다.
- [ ] ➌ 상수 이름은 대문자로 작성하는 것이 관례이다.
- [ ] ➍ 상수는 객체 생성 없이 사용할 수 있다.

> **정답 : ➋**
>
> **해설 :**  
> `final` 필드는 생성자에서 초기화할 수 있다.
>
> 하지만 `static final` 상수는 클래스 로딩 시 초기화되므로  
> 생성자에서 초기화할 수 없다.

---

## 10. 패키지 (Package)

### Q. 패키지에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 패키지는 클래스를 그룹화하는 기능을 한다.
- [ ] ➋ 클래스가 패키지에 속하려면 패키지 선언이 필요하다.
- [ ] ➌ `import` 문은 다른 패키지 클래스를 사용할 때 필요하다.
- [x] ➍ `com.mycom` 패키지 클래스는 `com.yourcom`으로 옮겨도 동작한다.

> **정답 : ➍**
>
> **해설 :**  
> 자바 클래스의 패키지 정보와 실제 디렉토리 구조는 일치해야 한다.
>
> 패키지를 변경하려면 `package` 선언문도 함께 수정해야 한다.

---

## 11. 접근 제한자 (Access Modifier)

### Q. 접근 제한자에 대한 설명으로 틀린 것은 무엇입니까?

- [ ] ➊ 접근 제한자는 클래스, 필드, 생성자, 메소드의 사용 범위를 제한한다.
- [ ] ➋ `public` 접근 제한자는 어디서든 접근 가능하다.
- [x] ➌ `default` 접근 제한은 해당 클래스 내부에서만 사용 가능하다.
- [ ] ➍ 외부 접근을 막으려면 `private` 접근 제한자를 사용한다.

> **정답 : ➌**
>
> **해설 :**  
> `default` 접근 제한자는 동일한 패키지 내부에서 접근 가능하다.
>
> 클래스 내부에서만 접근 가능한 것은 `private`이다.

---

## 12. 클래스 구성 멤버 식별

### Q. 다음 클래스에서 각 멤버의 종류를 작성하세요.

```java
public class Member {
    private String name;                   // ( 필드 )

    public Member(String name) { }        // ( 생성자 )

    public void setName(String name) { }  // ( 메소드 )
}
```

> **해설 :**
>
> - 필드(Field) : 객체의 데이터를 저장하는 변수
> - 생성자(Constructor) : 객체 생성 시 초기화를 담당
> - 메소드(Method) : 객체의 동작을 정의하는 실행 블록

---

## 13. Member 클래스 선언

### Q. 회원의 데이터(이름, 아이디, 패스워드, 나이)를 가지는 Member 클래스를 작성하세요.

![img.png](img.png)

```java
public class Member {

    String name;
    String id;
    String password;
    int age;
}
```

> **해설 :**  
> 문자열 데이터는 `String` 타입, 나이는 `int` 타입으로 선언한다.
>
> 클래스 내부 변수들은 객체의 상태를 저장하는 필드(Field)이다.

---

## 14. Member 클래스 생성자 선언

### Q. `name` 필드와 `id` 필드를 외부 값으로 초기화하는 생성자를 작성하세요.

### 예제 코드

```java
Member user1 = new Member("홍길동", "hong");
```

### 정답

```java
public class Member {

    String name;
    String id;
    String password;
    int age;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
```

---

## 15. MemberService 클래스와 메소드 선언

### Q. 조건에 맞게 `login()`, `logout()` 메소드를 선언하세요.

![img_1.png](img_1.png)

```java
public class MemberService {

    public boolean login(String id, String password) {

        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다");
    }
}
```

> **해설 :**
>
> - `login()` 메소드는 문자열 비교 시 `equals()`를 사용해야 한다.
> - `logout()` 메소드는 반환값이 없으므로 `void`를 사용한다.

---

## 16. Printer 클래스 메소드 오버로딩

### Q. `println()` 메소드를 오버로딩하여 다양한 타입을 출력하도록 작성하세요.

![img_2.png](img_2.png)

```java
public class Printer {

    public void println(int value) {
        System.out.println(value);
    }

    public void println(boolean value) {
        System.out.println(value);
    }

    public void println(double value) {
        System.out.println(value);
    }

    public void println(String value) {
        System.out.println(value);
    }
}
```

> **해설 :**  
> 메소드 오버로딩은 이름은 같고 매개변수가 다른 메소드를 여러 개 선언하는 것이다.

---

## 17. 싱글톤(Singleton) 패턴 적용

### Q. 싱글톤 패턴을 적용하여 하나의 객체만 생성되도록 ShopService 클래스를 작성하세요.

![img_3.png](img_3.png)

```java
public class ShopService {

    private static ShopService singleton = new ShopService();

    private ShopService() {}

    public static ShopService getInstance() {
        return singleton;
    }
}
```

> **해설 :**  
> 싱글톤 패턴은 프로그램 전체에서 하나의 객체만 생성되도록 하는 디자인 패턴이다.
>
> 생성자를 `private`으로 막고,  
> 정적 메소드로 객체를 공유한다.

---

## 18. Setter와 Getter를 이용한 데이터 보호

### Q. 잔고(balance)가 0 ~ 1,000,000 범위만 가지도록 Account 클래스를 작성하세요.

### 예제 코드

```java
Account account = new Account();

account.setBalance(10000);
System.out.println("현재 잔고: " + account.getBalance());

account.setBalance(-100);
System.out.println("현재 잔고: " + account.getBalance());

account.setBalance(2000000);
System.out.println("현재 잔고: " + account.getBalance());

account.setBalance(300000);
System.out.println("현재 잔고: " + account.getBalance());
```

### 정답

```java
public class Account {

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }
}
```

---

## 19. 종합 실습 : 은행 관리 프로그램

### Q. 계좌 정보를 입력받아 관리하는 프로그램을 작성하세요.

[Account.java](Account.java)

[BankApplication.java](BankApplication.java)

### Account 클래스

```java
public class Account {

    private String ano;
    private String owner;
    private int balance;

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
}
```

### 핵심 로직

```java
private static Account findAccount(String ano) {

    for (int i = 0; i < accountArray.length; i++) {

        if (accountArray[i] != null &&
            accountArray[i].getAno().equals(ano)) {

            return accountArray[i];
        }
    }

    return null;
}
```

> **해설 :**
>
> - `Account[]` 배열을 사용해 계좌 객체를 저장한다.
> - 계좌번호 비교 시 `equals()`를 사용한다.
> - `null` 체크를 통해 `NullPointerException`을 방지한다.