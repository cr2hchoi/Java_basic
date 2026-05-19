# JAVA 자료구조 : Tree 🌳
부모 노드 + 자식 노드 관계로 이어진 관계형 자료 구조
```text
        A
      /   \
     B     C
    / \     \
   D   E     F
```

---

## 1. 트리의 특징 
- 리스트나 배열처럼 순서대로 나열되는 선형 구조가 아니라, 한 노드에서 여러 노드로 가지를 뻗어나가는 **비선형 구조**
- 그래프의 한 종류로, 그래프 중에서 사이클이 X 모든 노드가 연결된 형태를 트리라고 총칭 

  1. 모든 노드가 반드시 연결되어 있다.
  2. 사이클이 절대 X
  3. 루트에서 특정 노드로 가는 경로는 단 하나뿐 
  4. 노드 수가 N개면, 간선 수는 N-1개 

---

## 2. 트리의 구성 요소
1) 노드 (Node) : 트리를 구성하는 기본 단위로, 데이터를 하나씩 갖고 있고 서로 연결되어 부모-자식 관계를 이룸 
2) 간선 (Edge) : 노드와 노드를 연결하는 선 
3) 부모/자식 (Parent & Child) : 노드에서 뻗어나간 노드를 자식노드, 그 자식을 직접 연결하고 있는 위쪽 노드를 부모 노드라고 함 
4) 형제 (Sibling) : 같은 직속 부모를 가진 노드 
5) 루트(Root) : 트리의 시작점인 최상위 노드. 부모가 없는 유일 노드 
6) 리프(Leaf) 노드 : 자식이 없는 끝단 노드. 단말 노드 (Terminal Node) 라고 불림
7) 차수 (Degree) : 한 노드가 몇개의 자식을 가지고 있는지 나타내는 값 
    * 트리 전체에서 모든 노드 중에서 가장 자식이 많은 노드의 차수를 트리의 차수로 정의하기도 한당 
8) 레벨(level) : 루트에서 특정 노드까지 도달하는데 거쳐야 하는 단계의 수 (❗루트 노드 level : 0)
9) 높이 (height) : 루트 -> 가장 깊은 리프노드까지의 거리 (단계 수) 
10) 조상(Ancestor) : 부모,부모의 부모... 자식 노드에서 위로 올라가면서 만나는 모든 노드들 
11) 자손 (Descendant) : 자식, 자식의 자식... 부모 노드에서 아래로 내려가면서 만나는 모든 노드들

---
 
## 3. 재귀와 DFS
> DFS 한 방향을 끝까지 탐색하므로 트리랑 완전 잘 맞음 
> 
> 재귀함수 자체도 트리형태로 퍼져나가고, 백트래킹도 트리 탐색으로 탐색 ^_^b 

(예) 순열 
```text
[]
├─ [1]
│   ├─ [1,2]
│   └─ [1,3]
│
├─ [2]
│   ├─ [2,1]
│   └─ [2,3]
```
여기서 각 상태가 트리의 노드가 되고, DFS는 `상태 트리`를 탐색하는 거라고 볼 수 있다고.. 한다.. 

### DFS의 시간 복잡도 : O(N)

---

## 4. 트리의 종류 
1. 일반트리(General Tree) : 가장 기본적인 형태의 트리 
2. 이진트리(Binary Tree) : 노드가 최대 2개의 자식만 가질 수 있는 트리 | [BinaryTree.java](BinaryTree.java)
3. 완전이진트리(Complete Binary Tree) : 왼쪽 부터 순서대로 채워지는 자료구로, 마지막 레벨 제외 모든 노드가 왼쪽부터 꽉 차있어야 함 
4. N-진 트리 (N-ary Tree) : 각 노드가 최대 N개의 자식을 가질 수 있는 트리 (N의 수에 따라 범용적으로 자식을 가질 수 있는 구조 )

--- 

## 5. 트리의 구현 방법 
1. 인접 리스트  (Adjacency List) 
그래프와 달리 부모-자식 관계가 명확하고 방향성이 있기 때문에 보통 단방향 그래프로 구현

### 1-1. 인접 리스트 구현 방식 
1️⃣ 2차원 리스트 방식 `List<List<Integer>>` 
```java
// 이차원리스트 선언 
List<List<Integer>> graph = new ArrayList<>();

//초기화
for (int i=0; i<m ; i++){
    graph.add(new ArrayList<>());
        }
// 단방향 간선 추가 
graph.get(1).add(2);
graph.get(1).add(3);

// 무방향 간선 추가
graph.get(1).add(2);
graph.get(2).add(1);

//dfs 탐색
for(int nxt : graph.get(cur)){

        if(!visited[nxt]){
dfs(nxt);
    }
            }
```

2️⃣ Map<Integer, List<Integer>> 방식
노드의 번호가 불규칙할 때, 문자열로 구성될 때 사용한다

```java
import java.util.HashMap;

// 해시맵 선언
Map<Integer, List<Integer>> graph = new HashMap<>();

//간선 추가
graph.putIfAbsent(1,new ArrayList<>());
graph.get(1).add(2);

```

3️⃣ 2차원 배열 방식 `int[][]`
입력이 배열 형태로 주어지는 경우 사용 
```java
/**
 * 예시 입력
 * int cur = 0;
 * int[][] tree = {
 *     {1, 2},    // 0번 노드의 자식
 *     {},        // 1번 노드의 자식
 *     {3, 4},    // 2번 노드의 자식
 *     {},        // 3번 노드의 자식
 *     {}         // 4번 노드의 자식
 * };
 */
class Solution {
    public void solution(int cur, int[][] tree) {
        // cur노드에 연결된 자식 노드를 순회
        for (int child : tree[cur]) {
            System.out.println(child);
        }
    }
}
```

2. 간선 리스트 (Edge List)
입력값으로 가장 자주 주어지는 형태
코테에서는 간선 리스트를 받자마자 바로 인접 리스트로 변환해서 사용한드아 
```java
int[][] edges = {              // 간선 정보 (부모 -> 자식)
    {0, 1},                    // 0번 노드 -> 1번 노드
    {0, 2},                    // 0번 노드 -> 2번 노드
    {2, 3},                    // 2번 노드 -> 3번 노드
    {2, 4}                     // 2번 노드 -> 4번 노드
};
int n = 5;                     // 노드 개수: 5개
```
### 2-1. 간선 리스트 -> 인접 리스트 변환 | [EdgeListToAdjList.java](../Graph/EdgeListToAdjList.java)
### 2-2. 간선 리스트 -> 해시맵 변환 | [EdgeListToHashMap.java](EdgeListToHashMap.java)