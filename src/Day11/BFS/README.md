# BFS : 너비 우선 탐색

* 시작점에서 가까운 순서의 노드부터 방문하는 탐색 방법 
* Queue를 사용하여 만든다 ( FIFO 특징 : 먼저 발견한 노드를 먼저 방문하기 위해 )
* 최단 거리를 구할 때 사용한다. 

--- 
## BFS 동작 원리 
![img.png](img.png)

1. 큐 생성 
```java
import java.util.*; //Queue,ArrayDeque 패키지로 가져와 쓰기 위해
Queue<Integer> queue = new ArrayDeque<>(); 
```
2. 시작 노드 큐에 넣기 (offer() 메서드 사용)
```java
queue.offer(start);
```

3. 큐가 비어있지 않다면, 큐에서 꺼내기 (poll() 매서드 사용)
```java
while (!queue.isEmpty()) {
    int cur = queue.poll();
}
```
4. 연결된 다음 노드 탐색
```java
for (int nxt : graph.get(cur))
```
5. 방문 X -> 큐에 넣기 
```java
queue.offer(nxt);
visited[nxt] = true;
```

### BFS 함수 예시
```java
public void bfs(int start) {

    Queue<Integer> queue = new ArrayDeque<>();

    queue.offer(start);

    while (!queue.isEmpty()) {

        int cur = queue.poll();

        System.out.println(cur);
    }
}
```