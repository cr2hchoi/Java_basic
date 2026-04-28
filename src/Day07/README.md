# Day 07 | 2026. 04. 28 (The) 

# 📂 Java 연습 파일 목록
### (1) 📂 Iterator 
ㄴ Book.java
ㄴ BookShelf.java
ㄴ BookShelfIterator.java
ㄴ Main.java
### (2) 📂 Queue
ㄴ Message.java
ㄴ QueueExample.java
### (3) 📂 CommandPattern
ㄴ Command.java (interface) : 명령을 전달하는 인터페이스 
ㄴ Main.java : command 패턴을 배열로 만들어 직접 수행하는 실행 클래스 
ㄴ OpenCommand.java : Command 구현 클래스로, 오버라이딩으로 Opne명령 수행 
ㄴ AddCommand.java : Command 구현 클래스로, 오버라이딩으로 Add 명령 수행
ㄴ PrintCommand.java : Command 구현 클래스로, 오버라이딩으로 Print명령 수행
ㄴ ExitCommand.java : Command 구현 클래스로, 오버라이딩으로 Exit명령 (실행 종료) 수행
### (4) 📂 Comparable 
ㄴ Main1.java : Comparable 인터페이스로 사용자 객체를 나이순으로 정렬하는 예제
ㄴ Main2.java : Comparator 인터페이스로 정렬 
ㄴ Main4.java : Comparable 인터페이스에서 thenComparing으로 여러 정렬 기준세워 정렬하기 

---

# 1️⃣Iterator 인터페이스
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

# Queue 인터페이스 
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

# Command 패턴이란? 
>  '명령(Command)'을 하나의 독립된 객체로 만드는 패턴
* 매서드를 직접 호출하는 방식이 아닌, 명령서를 만들어서 전달하는 방식. 

### Command 클래스
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
