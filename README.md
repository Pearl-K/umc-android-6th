# UMC Android
### 🤖 6th UMC Ewha Server-Android Repository by Jenett



## ✅ WEEK 1
#### Chapter 1. Platform & Layout
#### flo 앱의 Home Fragment 만들기
    - BottomNevigationView 사용
    - ScrollView 사용
    - ConstraintLayout 의 margin 설정, chain 사용
    - ImageView 와 TextView의 배치 조화

    
#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w1/week1_amul1.PNG.png" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w1/week1_amul2.PNG.png" alt="이미지2" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w1/week1_amul3.PNG.png" alt="이미지3" width="220" height="400">
</div>


## ✅ WEEK 2
#### Chapter 2. Activity & Fragment
#### flo 앱의 SongActivity, AlbumFragment 만들기
    - Activity 전환 실습 (MainActivity -> SongActivity)
    - 음악 play / stop에 따른 btn 변화
    - Fragment 전환 (HomeFragment -> AlbumFragment)
    - Data class를 활용한 intent Activity 데이터 전송 


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w2/pic1.PNG.png" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w2/pic2.PNG.png" alt="이미지2" width="230" height="400">
</div>


## ✅ WEEK 3
#### Chapter 3. Useful Widget
#### flo 앱의 HomeFragemnt와 AlbumFragment를 TabLayout, ViewPager2를 활용하여 제작
    - 기존의 HomeFragment Banner를 ViewPager2를 사용하여 넘기는 배너로 교체
    - AlbumFragment에서 TabLayout + ViewPager2 를 사용한 화면 구성


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w3/pic1.PNG.png" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w3/pic2.PNG.png" alt="이미지2" width="220" height="400">
</div>
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w3/vt1.PNG.png" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w3/vt2.PNG.png" alt="이미지2" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w3/vt3.PNG.png" alt="이미지3" width="220" height="400">
</div>


## ✅ WEEK 4
#### Chapter 4. Thread
#### Song의 진척도를 알리는 Progress Seekbar 만들기, Thread-Timer를 이용한 재생 시간 표시
    - Thread 타이머 기본 실습 후, Song의 Progress를 보여주는 Bar에 접목
    - Splash Theme을 새로 만들어서 App 시작 시 logo 화면 띄우기


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w4/p1.PNG" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w4/p2.PNG" alt="이미지2" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w4/p3.PNG" alt="이미지3" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w4/logo.PNG" alt="이미지4" width="220" height="400">
</div>


## ✅ WEEK 5
#### Chapter 5. LifeCycle
#### MainPlayer에 Seekbar 구현, Song(SongActivity)의 진행도를 MainPlayer Seekbar에 반영
    - SongActivity의 생명주기가 onPause() 일 때, SongActivity의 Seekbar의 진행도를 Main 화면으로 넘기기
    - MainPlayer에 mini seekbar 구현한 후 SongActivity 에서 재생했던 진행도를 받아와서 표시 
    - JSON, GSON을 사용하여 Java 객체인 Song의 정보를 주고 받는다
    - SongActivity의 생명주기가 onDestroy() 일 때 resource(mp3) 재생을 해제


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w5/p1.PNG" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w5/p2.PNG" alt="이미지2" width="220" height="400">
</div>


## ✅ WEEK 6
#### Chapter 6. ListView & RecyclerView
#### ListView를 사용한 부분을 전체적으로 RecyclerView로 변경
    - HomeFragment에 있는 오늘 발매 음악을 ListView에서 RecyclerView로 교체
        - (item_album.xml 의 형태로 Recycler View가 생성되고, Album 데이터를 보내준것으로 데이터가 적용된다.)
        - 해당 RecyclerView 의 특정 앨범을 누르면 AlbumFragment로 바뀐 앨범 정보가 전달된다.
    - LockerFragment를 TabLayout과 ViewPager2를 사용하여 재구성하고, SongList를 띄우는 Fragment 제작
        - SongListFragment 에는 보낸 노래 정보들을 RecyclerView로 띄운다. (item_song.xml의 형태)


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w6/p1.PNG" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w6/p3.PNG" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w6/p4.PNG" alt="이미지2" width="220" height="400">
</div>


## ✅ WEEK 7
#### Chapter 7. DataBase
#### RoomDB를 사용하여 Song 목록 관리
    - RoomDB 적용, DAO를 만들어 DML 동작 구현 (SELECT, INSERT, UPDATE)
    - SongTable을 만들어 Song의 정보를 테이블에 저장한다 (Song은 Data Class로 @Entity 이다)
    - RoomDB에서 Song 정보를 가져와서 Player에 setting 하는 기능, ClickListener를 통해 다음 곡으로 넘어간다
    - 좋아요 표시(Like) 여부를 DB에 저장하여 기억하고 화면에 표시한다
    - 좋아요 표시된 Song을 보관함에 저장하고, 보관함에 저장한 특정 Song을 삭제하는 기능도 제공한다


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w7/p1.PNG" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w7/p2.PNG" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w7/p3.PNG" alt="이미지2" width="220" height="400">
</div>


## ✅ WEEK 8
#### Chapter 8. Token
#### 회원가입, 로그인, 로그아웃 기능 구현
    - RoomDB에 UserTable을 만들어 회원가입 (UserTable에 새로운 유저 정보 Insert) 기능 구현
    - RoomDB UserTable에 저장된 email과 pw 중 일치하는 정보를 가져와서 로그인 기능 구현
    - SharedPreference에 저장된 JWT 를 확인하여 로그인 여부 체크, 해당 정보를 지워서 로그아웃 기능 구현
    - LikeTable과 AlbumTable을 만들어 각 사용자가 좋아요를 누른 앨범 정보를 RoomDB로 관리


#### 결과 화면
<div align="center">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w8/p1.png" alt="이미지1" width="220" height="400">
    <img src="https://github.com/Pearl-K/umc-android-6th/blob/Jenett/pic/w8/p1.png" alt="이미지2" width="220" height="400">
</div>



## ✅ WEEK 9
#### Chapter 9. Network 통신 & API
#### Retrofit2를 사용한 안드로이드 HTTP 통신으로 회원가입, 로그인 기능 구현
    - AuthService() 메소드 분리, 회원가입과 로그인 기능 각각 보완
    - JWT를 저장하고 불러올 수 있게 data class 만들어서 활용


#### 결과 화면
<div align="center">
    <img src="" alt="이미지1" width="220" height="400">
    <img src="" alt="이미지1" width="220" height="400">
    <img src="" alt="이미지2" width="220" height="400">
</div>



## ✅ WEEK 10
#### Chapter 10. Social Login & Paging
#### 
    - 
    - 


#### 결과 화면
<div align="center">
    <img src="" alt="이미지1" width="220" height="400">
    <img src="" alt="이미지1" width="220" height="400">
    <img src="" alt="이미지2" width="220" height="400">
</div>


## ✅ 마무리, 더 확장해야 할 것
    - Firebase 기반으로 한 DB 서버 구축
    - SplashActivity - 자동 로그인 API 연동을 통한 자동 로그인 기능 구현
    - 카카오 API를 이용한 소셜 로그인 서비스 구현
