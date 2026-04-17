# 📂 Java 프로젝트 구조: src

## 1. src 폴더 (Source Folder)
- **정의**: 자바 소스 코드(`.java`) 저장 표준 디렉토리.
- **역할**: 개발자가 직접 코딩하는 공간.
- **컴파일 흐름**:
    - `src` 폴더 `.java` 파일 ──(컴파일)──> `out` 또는 `bin` 폴더 `.class` 파일.

---

## 2. 패키지(Package)와 src 관계
패키지 선언은 `src` 폴더 기준 **실제 물리적 폴더 경로**와 무조건 일치해야 한다!

### [구조 예시]
프로젝트 루트 `MyProject`, 패키지 `day01` 기준:
- **물리 경로**: `MyProject/src/day01/MethodMakeTest.java`
- **코드 선언**: `package day04`

> **주의**: `src` 바로 아래 폴더 없이 파일 두면 `default package`고 실무에는 패키지를 나누는게 좋다고 한다 :> 

---

## 3. src 폴더 사용 이유
1. **표준 규격**: IntelliJ, Eclipse 등 IDE가 `src`를 소스 시작점으로 자동 인식
2. **빌드 자동화**: Maven, Gradle 등 도구가 `src` 폴더를 스캔해서 컴파일
3. **리소스 분리**: 로직 코드(`src`)와 설정 파일(`resources`)을 구분해 가독성을 높일 수 있음 

---

## 4. 디렉토리 구조 (Tree)

```text
📂 java_basic (Project Root)
├── 📂 .idea (IntelliJ 설정 폴더)
├── 📂 Java_basic (주요 작업 폴더)
│   ├── 📂 src (Source Root)
│   │   ├── 📂 DayPractices (연습용 폴더들)
│   │   ├── 📄 Java_src.md
│   │   └── 📄 Main (Java Class)
│   ├── 📄 .gitignore
│   ├── 📄 Java_basic.iml
│   └── 📄 README.md
├── 📂 Study_practice (연습용 폴더)
├── 📂 외부 라이브러리 (External Libraries)
└── 📂 스크래치 및 콘솔 (Scratches and Consoles)