<template>
    <div>
        <img :src="logofile" :alt="logoname" />

        <!-- {{ 콧수염괄호 -Mustache 태그  }} -->
        <h1> {{name}} </h1>
        <p :style="style1"  > {{age}} 세입니다 </p>
    </div>
</template>

<script>

export default {
    name : "MyApp1" , 
    data() {
        return {
            name : '뷰 사용자111' , 
            age : 30,
            style1 :  "color:pink" ,
            logoname : '로고' , 
            logofile : require('./assets/logo.png')
        }//리턴 객체내부변수들
    }//함수

}

</script>
<style>
h1  {color : green;}
</style>
