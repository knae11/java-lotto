# java-lotto

로또 미션 진행을 위한 저장소

# STEP2

## 기능, 입력 요구사항

*아래 이외 내용은 step1과 같다*

- [ ] 수동으로 구매할 로또의 수를 입력
  * 조건
  - [ ] 구입가능 금액이내이어야 함

- [x] 로또 번호 입력
  * 조건
  - [x] 앞뒤의 공백은 제거됨
  - [x] 지난 주 로또 당첨번호는 `,`를 구분자로 6개를 입력 받는다.
  - [x] 번호의 범위는 1~45 사이의 정수

- [x] 수동으로 구매이외에는 자동으로 구매

## 출력 요구사항

```
구입금액을 입력해 주세요.
14000

수동으로 구매할 로또 수를 입력해 주세요.
3

수동으로 구매할 번호를 입력해 주세요.
8, 21, 23, 41, 42, 43
3, 5, 11, 16, 32, 38
7, 11, 16, 35, 36, 44

수동으로 3장, 자동으로 11개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
...
```

# STEP1

## 기능 요구사항

- [x] 로또 번호 생성
  * 조건

  - [x] 6개의 번호로 구성
  - [x] 번호의 범위는 1~45 사이의 정수
  - [x] 번호는 랜덤으로 생성

  * 예외

  - [x] 번호끼리 중복 불가
- [x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급됨
- [x] 로또 1장의 가격은 1000원
- [x] 로또 번호와 당첨 번호를 비교해서 등수를 알려줌
- [x] 당첨 규칙은 아래와 같다
  - 6개가 일치하면 1등 - 2000000000원
  - 5개가 일치하고 보너스번호가 일치하면 2등 - 30000000원
  - 5개가 일치하고 보너스번호가 일치하지 않으면 3등 - 1500000원
  - 4개가 일치하면 4등 - 50000원
  - 3개가 일치하면 5등 - 5000원
  - 이외의 경우는 당첨금 없음

- [x] 수익률(%) = (총 당첨 금액 / 로또 구입 금액)

## 입력 요구사항
- [x] 구입금액은 원 단위로 숫자만 입력한다.
- [x] 구입금액의 최대로 구입할 수 있는 로또를 구매한 뒤 돈이 남는다면 거슬러준다.
- [x] 지난 주 로또 당첨번호는 `,`를 구분자로 6개를 입력 받는다.
  * 조건

  - [x] 앞뒤의 공백은 제거됨

  * 예외

  - [x] 정수 이외의 입력
  - [x] 범위(1~45)를 벗어난 입력
- [x] 보너스 볼을 1개 입력받는다.
  * 예외
  - [x] 정수 이외의 입력
  - [x] 범위(1~45)를 벗어난 입력
  - [x] 지난주 당첨번호와 중복되지 않는 입력

## 출력 요구사항
- [x] 로또 1장의 출력 예시
```
[8, 21, 23, 41, 42, 43]
```

- [x] 거스름돈이 생기는 경우
```
구입금액을 입력해 주세요.
1500
1개를 구매했습니다.
거스름 돈은 500원 입니다.
```
- [x] 당첨통계와 수익률을 예시와 같이 보여준다.

## 실행예시
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 30%입니다.
```

## 프로그래밍 요구사항
- indent(인덴트, 들여쓰기) 1단계
- else 사용불가
-메소드의 크기는 최대 10라인
  - method가 한 가지 일만 하도록 최대한 작게 만들기
- 배열 대신 ArrayList를 사용
- java enum 사용
- 규칙 3: 모든 원시값과 문자열을 포장 
- 규칙 5: 축약 금지
- 규칙 8: 일급 콜렉션을 사용

## 힌트 
- 로또 자동 생성은 Collections.shuffle() 메소드 활용
- 정렬은 Collections.sort() 메소드 활용
- ArrayList의 contains() 메소드 활용