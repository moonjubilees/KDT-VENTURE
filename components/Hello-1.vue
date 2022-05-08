<template>
    <div> 나는   {{title}} 컴포넌트입니다. </div>
    <div> {{name}} </div>
    <div> 자식 컴포넌트가 {{number}} 를 출력합니다 </div>
    <div> 자식 컴포넌트가 수정해 볼께요 <input type='text' :value='number' @input="increase" > </div>
</template>

<script>
export default {
    name:"MyHello1",
    data() {
        return {
            title : 'MyHello1'
        }
    },
    props:{
        name : {type:String},
        number : {type:Number }  //required:false , default=-1
    },
    methods :{
        increase(e){ 
           // console.log(e.target.value);
           //입력값이 변경됨을 알려주는 이벤트 정의. 부모에게 전달. 부모가 변경
           this.$emit("setNumberFromChild", e.target.value);
         }
    }


}
</script>
<style>
    div {color : rgb(24, 99, 99) ; font-size:20px; }
</style>