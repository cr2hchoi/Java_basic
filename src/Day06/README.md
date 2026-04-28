# Day 06 | 2026. 04. 27

# 📂 Java 연습 파일 목록
### (1) 📂 Collection
ㄴ p01/MainTodo.java : ArrayList를 활용하여 데이터를 저장하고 출력하는 예제 
+ forEach문, iterator 패턴 연습 추가 

ㄴ p02/MainTodo.java : ArrayList의 요소들을 변경하고, 지워보는 예제 

ㄴ p03/MainTodo.java : HashSet으로 데이터를 저장하고 출력하는 예제 

ㄴ p04/MainTodo.java : Map에 데이터를 저장하고 출력하는 연습 

ㄴ p05/MainTodo.java : Map에 데이터를 저장하고 출력하는 연습2 

ㄴ p06/MainTodo.java : Stack을 생성하여 데이터를 저장하고 출력하는 연습 

ㄴ p07/MainTodo.java : Queue 만들고 poll하기 

ㄴ p08/MainTodo.java : 정수리스트 생성 후 Array로 변환해 Sort()로 오름차순 정렬 하는 예제 

ㄴ p09/MainTodo.java : 제한된 타입 파라미터 연습 

ㄴ p10/MainTodo.java : List<Map<String, Object>> 연습 

ㄴ Board/Barad.java & Board/BoardListTest : arrayList로 객체들 담고 값 getter로 읽어오는 연습 

### (2) 📂 Generic
### (3) 📂 Map

# Jaca FramWork Collection
> 자바 컬렉션 프레임워크는 데이터를 효율적으로 저장, 관리, 조작하기 위한 클래스와 인터페이스의 모음이다.
> 이 프레임워크를 사용하면 자료구조를 직접 구현할 필요 없이 안정적이고 성능이 검증된 라이브러리를 활용할 수 있다.

---

## 1. 주요 인터페이스 계층 구조
자바 컬렉션 프레임워크는 크게 `Collection` 인터페이스를 상속받는 그룹과, 독립적인 `Map` 인터페이스 그룹으로 나뉜다.

### 주요 인터페이스 특징
* **Iterable**: 모든 컬렉션의 최상위 인터페이스로, `Iterator`를 통해 요소를 순회할 수 있게 한다.
* **Collection**: `List`, `Queue`, `Set`의 부모 인터페이스로, 객체를 다루는 공통 메서드(`add`, `remove`, `contains` 등)를 정의한다.
* **List**: 순서가 있고 중복을 허용하는 데이터 집합이다. 인덱스로 요소에 접근 가능하다.
* **Set**: 순서가 없고 중복을 허용하지 않는 데이터 집합이다.
* **Queue/Deque**: 데이터가 들어온 순서대로 처리하는 FIFO(First-In, First-Out) 구조를 가진다.
* **Map**: Key와 Value의 쌍으로 데이터를 관리한다. Key는 중복될 수 없으며, Value는 중복을 허용한다.

---

## 2. 인터페이스별 주요 구현 클래스

| 인터페이스 | 주요 구현 클래스 | 특징 |
| :--- | :--- | :--- |
| **List** | `ArrayList` | 배열 기반, 빠른 조회가 필요한 경우 사용한다. |
| | `LinkedList` | 노드 연결 기반, 빈번한 삽입/삭제가 필요한 경우 사용한다. |
| **Set** | `HashSet` | 해시 테이블 기반, 순서가 중요하지 않고 빠른 검색이 필요한 경우 사용한다. |
| | `TreeSet` | 이진 탐색 트리 기반, 데이터를 정렬된 상태로 유지한다. |
| **Queue** | `PriorityQueue` | 우선순위가 높은 요소를 우선적으로 꺼낸다. |
| | `ArrayDeque` | 양방향 입출력이 가능하며, 성능이 우수하다. |
| **Map** | `HashMap` | 키-값 저장, 검색 속도가 매우 빠르다. |
| | `TreeMap` | 키를 기준으로 데이터를 정렬하여 저장한다. |

---

## 3. 핵심 활용 원칙
1. **데이터의 특성 파악**: 중복을 허용하는가(`List`), 아니면 고유한 값만 필요한가(`Set`)에 따라 인터페이스를 결정한다.
2. **연산 빈도 고려**: 조회가 잦은지, 삽입/삭제가 잦은지에 따라 구현 클래스(`ArrayList` vs `LinkedList`)를 선택한다.
3. **다형성 활용**: 변수 타입을 구현 클래스(예: `ArrayList`)가 아닌 인터페이스(예: `List`)로 선언하여 유연성을 높인다. (예: `List<String> list = new ArrayList<>();`)
4. **멀티스레드 환경 주의**: `Vector`나 `Hashtable`과 같이 동기화된 클래스 대신, 동시성 환경에서는 `java.util.concurrent` 패키지의 컬렉션을 사용한다.