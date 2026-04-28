# Day 07 | 2026. 04. 28 (The) 

# 📂 Java 연습 파일 목록
```
📂 Day07
├── 📂 Iterator
│   ├── 📄 Book.java
│   ├── 📄 BookShelf.java
│   ├── 📄 BookShelfIterator.java
│   └── 📄 Main.java
├── 📂 Queue
│   ├── 📄 Message.java
│   └── 📄 QueueExample.java
├── 📂 CommandPattern
│   ├── 📄 Command.java (interface)
│   ├── 📄 Main.java
│   ├── 📄 OpenCommand.java
│   ├── 📄 AddCommand.java
│   ├── 📄 PrintCommand.java
│   └── 📄 ExitCommand.java
├── 📂 Comparable
│   ├── 📄 Main1.java (Comparable)
│   ├── 📄 Main2.java (Comparator)
│   └── 📄 Main4.java (thenComparing)
└── 📄 JavaPractice_Day07.md
```
### 🔄 컬렉션 및 반복자 (Iterator)
* **Book.java / BookShelf.java / BookShelfIterator.java**
    - **내용**: 사용자 정의 컬렉션 구현
    - **상세**: `Iterator` 패턴을 직접 구현하여 `BookShelf` 내부 요소를 순차적으로 순회하는 실습
* **Main.java**
    - **내용**: Iterator 활용
    - **상세**: `Iterator` 인터페이스를 통해 컬렉션 내부 구조와 상관없이 일관되게 요소를 읽어오는 예제

### 📥 자료구조 (Queue)
* **Message.java**
    - **내용**: 큐에 담을 데이터 객체 정의
    - **상세**: FIFO(선입선출) 방식으로 처리될 메시지 데이터 구조 설계
* **QueueExample.java**
    - **내용**: Queue 인터페이스 활용
    - **상세**: `offer`, `poll`, `peek` 메서드를 활용한 큐의 기본 동작 및 메시지 처리 실습

### ⚙️ 디자인 패턴 (Command Pattern)
* **Command.java**
    - **내용**: 명령 인터페이스
    - **상세**: 명령을 추상화하여 독립된 객체로 만들기 위한 규격 정의
* **Open/Add/Print/ExitCommand.java**
    - **내용**: 명령 구현 클래스
    - **상세**: `Command` 인터페이스를 오버라이딩하여 각기 다른 동작(명령)을 수행하도록 캡슐화
* **Main.java**
    - **내용**: Command 패턴 실행
    - **상세**: 명령 객체들을 배열로 관리하고 호출하여 프로그램을 제어하는 실행 클래스

### ⚖️ 정렬 (Comparable/Comparator)
* **Main1.java**
    - **내용**: Comparable 인터페이스
    - **상세**: 객체 스스로가 가지는 기본 정렬 기준(`compareTo`) 정의 및 적용 실습
* **Main2.java**
    - **내용**: Comparator 인터페이스
    - **상세**: 기본 정렬 외에 상황에 따른 별도의 정렬 기준을 마련하여 정렬하는 실습
* **Main4.java**
    - **내용**: 복합 정렬 기준
    - **상세**: `thenComparing`을 활용하여 여러 조건을 순차적으로 적용하는 정렬 실습

---

# 1️⃣Iterator 인터페이스란? 
> 자바 컬렉션 프레임워크에 저장된 요소들을 순차적으로 읽어오기 위해 사용하는 인터페이스 
> 내부 구조가 무엇이든 상관없이 동일한 방식으로 요소를 순회할 수 있도록 도와준다. 

### 왜 Iterator를 쓸까? 
  * > `List`처럼 인덱스로 접근 가능한 자료구조도 있지만, `Set`이나 `Map`같이 인덱스가 없는 자료구조들도 있기 때문에

### Iterator의 장점
  * 통일성: 모든 컬렉션에서 동일한 메서드(hasNext(), next())를 사용하여 요소를 읽을 수 있다. 
  * 유연성: 반복 중에 요소를 안전하게 삭제(remove())할 수 있다. 
  * 추상화: 컬렉션의 내부 구현(배열, 연결 리스트 등)을 알 필요 없이 편리하게 순회할 수 있다.

### 주요 메서드
  1. `boolean hasNext()` : 읽어올 요소가 남아있는지 확인한다. 있다면 true를 반환한다.
  2. `E next()` : 다음 요소를 읽어오고 커서를 이동시킨다.
  3. `void remove()` : next()로 읽어온 요소를 컬렉션에서 삭제한다.

---

# 2️⃣ Queue 인터페이스란?
> 큐(Queue)는 먼저 들어온 데이터가 가장 먼저 나가는 **선입선출(FIFO, First-In-First-Out)** 구조의 자료구조
> 자바에서는 `Collection` 인터페이스를 상속받는 `Queue` 인터페이스를 통해 이를 구현한다.

### 주요 구현 클래스

* **LinkedList**: 가장 표준적인 큐 구현체로, 데이터의 추가/삭제가 잦은 경우에 적합하다.
* **ArrayDeque**: 배열 기반의 큐로, `LinkedList`보다 메모리 효율과 속도 면에서 성능이 뛰어나다. (가장 추천됨)
* **PriorityQueue**: 요소의 우선순위에 따라 순서가 결정되는 큐이다. (FIFO가 아님)

### 주요 활용 사례
* 작업 스케줄링: 프로세스 처리, 인쇄 대기열 등.
* 비동기 메시지 처리: 서버 간 통신, 버퍼링.
* 알고리즘: 그래프의 너비 우선 탐색(BFS) 구현 시 필수적으로 사용된다.

---

# 3️⃣ Command 패턴이란? 
>  '명령(Command)'을 하나의 독립된 객체로 만드는 패턴
* 매서드를 직접 호출하는 방식이 아닌, 명령서를 만들어서 전달하는 방식. 

### 4️⃣ Command 클래스란?
>  명령을 추상적으로 표현하는 클래스 
> 
> 처리하고 싶은 일을 메서드 호출이라는 동적인 처리로 표현하지 않고,
> 명령을 나타내는 클래스의 인스턴스라는 하나의 '객체'로 표현

--- 

# Comparable 인터페이스
> 객체 스스로가 갖는 기본 정렬 기준을 정의하는 인터페이스 

### 핵심 메서드 : `compareTo(T o)`
* 특징 : `-1`,`0`,`1` 중 하나를 반환해야 함
  * 음수 (-1): 나(this)가 비교 대상(o)보다 작다 (앞에 선다).
  * 0: 나랑 비교 대상이 같다.
  * 양수 (1): 나(this)가 비교 대상(o)보다 크다 (뒤에 선다).
