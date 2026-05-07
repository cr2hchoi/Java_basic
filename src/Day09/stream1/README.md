# 🌊 Java Stream 🌊 개념 정리 
> 자바 8부터 도입된 **스트림(Stream)** 은 배열이나 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있게 해주는 반복자

## stream1/student.todo 
* 자바 스트림 연습 예제 문제들로 구성된 파일입니다... (아직 진행중 ^_^)

📂 파일 목록 
### ㄴ Ex01 _ WhatIsStreamTodo.java
     TODO 1: names에서 스트림을 얻고 forEach로 이름을 출력하세요
     
    📌 foEach(...) 
    
    스트림의 요소를 하나씩 소비하며 특정 동작을 수행하는 최종 연산(스트림의 문을 닫는 역할)  
    반복문의 역할을 대신하지만, 함수형 프로그래밍 스타일로 더 간결하게 코드를 작성할 수 있다. 
    반환값이 없다는 특징이 있다. : 데이터의 가공보다는, 동작 수행 (side Effect)에 더 최적화 되어있음 
        
        
### ㄴ Ex02 _ IternalIteratorTodo.java
    TODO 2: parallelStream의 forEach로 이름과 현재 스레드명을 출력하세요.

    📌 .parallelStream()

    자바의 스트림을 병렬로 처리할 수 있게 해주는 기능
    내부적으로 데이터를 여러 덩어리로 나누고, 여러 개의 스레드가 동시에 가공한 뒤 마지막에 결과를 합친다. 
    자바의 ForkJoin 프레임워크를 사용 : Fork (데이터 분할) -> Execute (데이터 처리) -> Join (합치기) 작업 수행 

    forEach()와 병렬 스트림의 주의점 ⚠️
    1) 순서 보장 안 됨: 여러 스레드가 동시에 출력하거나 작업하기 때문에, 원래 리스트에 있던 순서대로 동작하지 않는다.
    2) 공유 자원 문제: 여러 스레드가 동시에 외부의 변수(공유 자원)를 수정하려고 하면 데이터가 꼬이는 '레이스 컨디션'이 발생할 수 있다. 

    📌 Thread.currentThread()    
    지금 이 코드를 실행하고 있는 스레드가 누구인지 알려주는 메서드 
    
### ㄴ Ex03 _ PipelineTodo.java
    📌 스트림 파이프라인 (Stream Pipeline)
    
    여러 개의 스트림이 연결되어 있는 구조. 데이터 소스에서 시작하여 중간 연산들을 거쳐 최종 연산에서 결과가 도출되는 일련의 과정을 의미
    데이터 소스, 중간 연산, 최종 연산으로 구성되어있다. (*최종 연산이 호출되기 전까지 중간 연산은 실행 X)
    
    📌  mapToInt(Student::getScore) (중간 연산)
    
    객체 스트림(Stream<Student>)을 숫자형 스트림(IntStream)으로 변환
    매핑(Mapping) : 형변환을 동반하는 가공 방식
    코드를 살펴보면, 학생 객체에서 '점수(int)' 데이터만 뽑아서 다음 단계로 넘긴다. 
    
    📌 average() (최종 연산)

    IntStream에 흐르는 숫자들의 평균을 계산한다.
    리턴 타입이 OptionalDouble으로, 리스트가 비어있을 경우 평균값 도출 X 의 가능성도 내포

    📌 orElse(0.0) (결과 처리)
    비어있는 값에 대한 디폴트(Default) 설정
    학생 리스트가 비어있어 평균을 구할 수 없다면(NaN), 에러를 내는 대신 0.0을 반환하도록 함 (일종의 안전장치랄까.....) 
    
### Ex04 _ StreamSourceTodo.java
    
### Ex05 _ FilteringTodo.java
### Ex07 _ SortingTodo.java
### Ex08 _ LoopingTodo.java
### Ex09 _ MatchingTodo.java
### Ex10 _ BasicAggregateTodo.java
### Ex11 _ CustomAggregateTodo.java
### Ex12 _ CollectingTodo.java
### Ex13 _ ParallelTodo.java
