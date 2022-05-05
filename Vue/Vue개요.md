## 소개
Evan You가 만들었으며, 2014년 릴리즈를 시작으로 꾸준히 발전하고 있는 자바스크립트 프레임워크입니다.
컨트롤러 대신 뷰 모델을 가지는 MVVM(Model-View-ViewModel) 패턴을 기반으로 디자인되었으며,
재사용이 가능한 UI들을 묶어서 사용할 수 있습니다.



## 호환성
IE8 이하 버전을 지원하지 않습니다.
호환성
Vue는 기본적으로 JavaScript 객체를 Vue 인스턴스 data 옵션으로 정의할 때 모든 속성들을 
Object.defineProperty을 사용하여 Getter/Setter로 변환합니다. 
이것은 ES5에서 새로 등장한 기능으로 하위호환이 불가능하기 때문에 Vue.js는 IE8 이하를 지원하지 않습니다.



## 버전
최신 안정 버전 : 2.5.13
릴리즈노트




## 특징
MVVM 패턴을 사용합니다.
Virtual DOM의 사용합니다.
Angular, React에 비해 매우 작고 가벼우며 복잡도가 낮습니다.
Template과 Componenet를 사용하여 재사용이 가능한 사용자 인터페이스를 묶고 View Layer를 정리하여 사용합니다.
MVVM 패턴
MVVM
Mode - View - ViewModel의 줄임말으로 로직과 UI의 분리를 위해 설계된 패턴입니다.
웹페이지는 돔과 자바스크립트로 만들어지게 되는데 돔이 View 역할을 하고, 자바스크립트가 Model 역할을 합니다.
뷰모델이 없는 경우에는 직접 모델과 뷰를 연결해야 합니다.
그러나 뷰모델이 중간에서 연결해 주는 것이 MVVM 모델입니다.




## 가상돔(Virtual DOM)
돔 요소가 많아지면 자바스크립트로 돔을 핸들링하는 일이 무거워집니다. 
그래서 돔과 비슷한 구조로 자바스크립트를 만듭니다. 
이것은 진짜 돔과는 달리 메모리에 올라가있는 것이기 때문에 비교적 매우 빠른 성능을 보입니다. 
Vue js가 가상돔을 수정하면 돔을 수정하는 것보다 빠릅니다. 
vue는 가상돔이 변경될 때마다 진짜 돔과 비교해서 차이를 찾고 차이난 부분의 돔만 수정하는 동작을 하게 됩니다.
가상돔 참고 자료




## 컴포넌트(Component)
화면에 비춰지는 뷰의 단위를 쪼개어 재활용이 가능한 형태로 관리하는 것이 컴포넌트입니다.
Vue에서, 컴포넌트는 미리 정의된 옵션을 가진 Vue 인스턴스입니다.
전역 등록과 지역 등록 존재합니다.
컴포넌트1




## Vue는 재사용이 가능한 컴포넌트로 웹 페이지를 구성할 수 있습니다.
확장자가 .vue인 단일 파일에 HTML, 자바스크립트, CSS 코드로 구성하여 사용합니다. 컴포넌트




## 생명주기
lifeCycle
생명주기는 크게 Creation, Mounting, Updating, Destruction 으로 나눌 수 있습니다.
Creation : 컴포넌트 초기화 단계
Mounting : Dom 작성 단계
Updating : 상태 변화로 인한 렌더링 단계
Destruction : 소멸 단계




## Vue 인스턴스
new Vue로 선언하여 만들어진 객체를 vue 인스턴스라고 부릅니다.

> el : 태그에 지정한 ID, 클래스명, 태그명으로 해당 태그와 vue 인스턴스를 연결하는 옵션입니다.
> data : key와 value를 지정하는 json형식으로 데이터 입력 옵션입니다.
> computed : getter/setter를 지정하는 옵션입니다.

```
<div id = “app”
    {{message}}
</div>


<script>
var model = {
    message : “뷰 생성”
}

 new Vue({  
 //옵션
    el : ‘#app’,
    data : model
})

</script>
```
