# # JAVA 자료구조 : HashTable

## HashTable이란? 
해시 함수를 이용하여 (key,value) 형태의 데이터를 저장하는 자료구조 
* 개발자가 직접 정의한 Hash Function을 통해 테이블 인덱스에 바로 저장 

## HashTable 동작 원리 
1. Hash Function
   * key 값을 매개변수로 받아 테이블의 index로 변환 
   * 해시 함수 $h$ 에서, $h(k)$를 “key $k$의 해시값”이라고 부름 
   * 실제 테이블에 저장되는 데이터의 위치는 key 값 $k$가 아닌, key $k$의 해시값 $h(k)$에 의해 결정

2. Slot 또는 Bucket 
   * 해시 테이블에서 데이터를 저장하는 각각의 공간 
   * 각 bucket에는 특정 index에 대응되는 (key, value) 데이터 쌍이 저장

## Collision(충돌)
서로 다른 key값이 동일한 해시값을 가질 때 발생하는 상황 
key 값 자체는 중복이 없지만, 해시함수가 반환하는 값이 중복되어 동일한 index에 저장하려고 할 때 발생

-> 대표적인 충돌 해결 방식 : Open Addressing과 Separate Chaining