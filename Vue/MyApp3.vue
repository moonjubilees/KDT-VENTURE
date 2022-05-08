<template>
    <div>
        <h1> {{number}} </h1>
        <button @click="increase" >증가</button>
        <button @click="decrease">감소</button>
        <button @mouseover="setup" :value="number"> 초기화 (처음부터 보임)</button>
        <button v-show="number>10" @click="setup" :value="number"> 초기화(안보였다가 보임) </button> 
        <!--v-else , v-show -->
 </div>
</template>

<script>

export default {
    name : "MyApp3" , 
    data : function() {
        return {
            number : 0
        }//리턴 객체내부변수들
    }//data함수 변수정의
    ,
    methods : { 
        increase() { this.number += 1;  }  
        , 
        decrease() { this.number -= 1; } 
        ,
        setup () { this.number = 0; alert(this.number);}
        //setup : (e)=>{ alert(e.target.value); /*alert(this.number);*/} 
        /*Vue는 methods 안에서 컴포넌트 인스턴스를 항상 참조할 수 있도록 this 값을 자동으로 바인딩합니다. 
        이렇게 하면 메서드가 이벤트 리스너나 콜백으로 사용될 때, 올바른 this 값을 유지하게 됩니다.
        화살표 함수를 사용해서 methods를 정의하면 Vue가 적절한 this 값을 바인딩하지 못합니다. 
        this가 필요하면 methods를 정의할 때, 화살표 함수를 사용하지 않도록 합니다.*/
  
    }

}

</script>
<style>
h1  {color : green;}
</style>
