# 🔥 관통프로젝트: HappyHouse_Java_서울_08반_김민지_김정윤_김하영

### 📆 제출일: 2021.02.24

### ⭐️ 참여 페어
- 김민지, 김정윤, 김하영

### 📝 처리된 요구사항 목록
  
|난이도|구현기능|세부|작성여부(O/X)|
|:---:|---|---|:---:|
|기본|화면 UI + Service + DAO 완성|이벤트 처리| O|
|기본|화면 UI + Service + DAO 완성|Service 완성|O |
|기본|화면 UI + Service + DAO 완성|Dao 완성| O|
|기본|XML Parsing|아파트 전,월세 거래| O|
|기본|XML Parsing|주택 거래 XML|O |
|기본|전체 프로그램 동작|오류 없이 전체 동작| O|
|추가|CSV Parsing|주변 환경 지도 점검|O |
|심화|CSV Parsing|주변 상가 지도 점검|O |



</span>

## 📌 기본 기능
### 📎 전체 프로그램 동작
<img width="1312" alt="스크린샷 2021-02-24 오후 8 53 44" src="https://user-images.githubusercontent.com/48318620/108997106-920dda80-76e2-11eb-8a1a-ca3959c326a0.png">

### 📎 집 type 별로 검색
![캡처1](https://user-images.githubusercontent.com/46915105/108997784-5e7f8000-76e3-11eb-93c7-bef2535a50eb.PNG)

### 📎 집 Type과 아파트 이름으로 검색
![캡처3](https://user-images.githubusercontent.com/46915105/108998236-f54c3c80-76e3-11eb-9d2a-a6fd586e023c.PNG)

### 📎 아파트 목록에서 클릭하면 거래 정보에 해당 아파트 정보 표시
![캡처4](https://user-images.githubusercontent.com/46915105/108998348-23318100-76e4-11eb-9a30-f55ddaae489c.PNG)




구현 기능: XML Parsing/주택 거래 XML


## ✏️ 추가 & 심화 기능

### 📃 추가 기능

~~~
1. 주변 환경 오염 정보가 담긴 CSV 파일과 상권 정보가 담긴 CSV 파일을 읽어들여 객체에 저장
2. 기본 UI를 수정하여 프로그램 화면 하단 좌측에 전체 주변 환경 정보를 출력, 우측에는 상권 정보를 출력
3. 아파트 정보 클릭마다 해당 아파트 사진을 표시하도록 수정
    - 기존 코드로는 원하는데로 동작하지 않아 새롭게 코드 추가하여 구현함
~~~


<img width="1312" alt="스크린샷 2021-02-24 오후 8 53 44" src="https://user-images.githubusercontent.com/48318620/108997106-920dda80-76e2-11eb-8a1a-ca3959c326a0.png">

- 첫 실행 시 화면으로 하단에 모든 환경 정보 및 모든 상권 정보의 리스트가 테이블로 양 옆에 나뉘어 출력되는 것을 볼 수 있다.

### 📃 심화 기능 
~~~
1. 특정 아파트를 마우스로 선택 시 해당 아파트와 동일한 '동'의 환경 정보와 상권 정보들만 출력하는 기능
2. 마우스로 선택 뿐만 아니라 검색창에 '동'이름을 검색했을 때도 검색한 '동'의 환경 정보와 상권 정보들만 출력
~~~

<img width="1312" alt="스크린샷 2021-02-24 오후 9 04 14" src="https://user-images.githubusercontent.com/48318620/108998187-dc438b80-76e3-11eb-8eb4-f1c915ec4cd7.png">

- 거래 내역에 있는 아파트를 마우스로 클릭하면 하단에 있는 환경 정보 및 상권 정보가 선택한 아파트의 '동'과 같은 '동'의 정보들로만 걸러져서 출력

![아파트 이름으로 검색](https://user-images.githubusercontent.com/39117025/108998225-f1201f00-76e3-11eb-85c9-00fa312c1b53.png)

- 검색바에 특정 '동'을 검색하여 Enter를 입력해도 해당 '동'의 환경 정보와 상권 정보 리스트가 표시
    - 상권 정보 또는 환경 정보는 존재하지 않을 시 표시되지 않음 







<img src="/readmeImage/해피하우스_검색_원본.gif" title="px(픽셀) 크기 설정" alt="gif"></img><br/>