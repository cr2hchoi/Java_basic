# 재귀함수 (recursion function)
자기 자신을 호출하는 함수 

> 재귀란? 어떤 문제를 자기와 동일한 구조를 가진 더 작은 하위문제로 나누어 해결하는 방식 
> * 문제의 정의 안에 자기 자신이 다시 등장하는 특징이 있음 
> * 즉, 재귀함수는 재귀적 문제 해결을 코드로 표현한 것  

--- 
## 🗂️ 파일 구조
```text
ㄴ 📝 README.md : 재귀함수 이론 정리 
ㄴ Recursion.java 
ㄴ RecursionExample2.java : 대표적인 조합(Combination) 완전탐색 코드 | nums 배열에서 숫자 3개를 골라 합이 target인지 검사 
ㄴ RecursionExample3.java : 재귀 완전탐색 방식에서 메모리를 더 적게 사용하는 
```

---
## 재귀 함수와 메모리 
함수 호출시 ->, JVM의 메모리 구조에서 Stack 영역에 저장된다.
  - (call) Stack 에 저장된 함수는 `Stack frame` 단위로 저장되어 매개변수, 지역변수, 호출 위치(복귀위치) 정보들이 저장된다. 
  - 후입 선출 구조 (LIFO)로, 마지막에 쌓인 frame 부터 순서대로 제거된다. 

### `StackOverFlowError` 발생
- 자기 자신을 다시 호출함으로써 무한성마냥 반복되는 구조의 함수
```java
void sayHello() {
    System.out.println("hello");
    sayHello();  // basecase 없음 → 무한 재귀
}
```
```text
main()
└─ f()
   └─ f()
      └─ f()
         └─ ...
```

---
## base case (기저 조건)
재귀 함수가 더 이상 자신을 호출하지 않고 종료 되도록 하는 조건 
````java
void sayHello(int n) {
    if (n == 0) {         // <-- base case
        return;
    }
    System.out.println("hello" + n);
    sayHello(n - 1);
}
sayHello(4);
````

## 재귀트리 (Recursion Tree)
🌳 재귀 함수가 호출되는 흐름을 트리 구조로 시각화 한 것
* 함수가 호출될 때마다 자식 노드처럼 뻗어나감 
* Base Case는 재귀 트리에서 더 이상 내려가지 않는 끝 노드가 됨
* 시간 복잡도 계산에 도움이 됨 

(예) 피보나치 fib(4)호출 
````java
int fib(int n){

    if(n <= 1) return n;

    return fib(n-1) + fib(n-2);
}
````
트리구조 시각화 
```text
                fib(4)
              /        \
         fib(3)       fib(2)
         /    \       /    \
     fib(2) fib(1) fib(1) fib(0)
      /   \
  fib(1) fib(0)
```
(예) DFS 재귀트리 
```text
dfs(A)
 ├── dfs(B)
 │     └── dfs(D)
 └── dfs(C)
```
### 재귀 트리 핵심 요소 
| 요소    | 의미       |
| ----- | -------- |
| 노드    | 함수 호출    |
| 간선    | 재귀 호출    |
| 리프 노드 | 종료 조건 도달 |

---

## 재귀 활용 ➡️ 재귀적 사고 
큰 문제를 작은 형태의 같은 문제로 생각하는 방식 
> 현재 문제 = 더 작은 동일한 문제 + 약간의 작업 

(예) 팩토리얼 구하기
```5! = 5 × 4 × 3 × 2 × 1```
-> 
```java
int factorial(int n){

    if(n == 1) return 1;

    return n * factorial(n - 1);
}
```

### 재귀적 사고의 핵심 
1. 문제를 작은 문제로 나눈다
2. 작은 문제 구조가 원래 문제와 동일하게 나눈다
3. Base Case에 도달한다. 

---

## 백트래킹 (Backtraking)
선택하고 탐색한 뒤, 원래 상태로 되돌아와 다른 경우를 탐색하는 기법
* dfs 에서 백트래킹 ... : 가능한 깊게 내려갔다가 다시 올라오기 
1. 선택 `curr.add(nums[i]`
2. 재귀탐색 `dfs(...)`
3. 선택 취소 `curr.remove(curr.size()-1)`
