<template>
     <thead><tr><th>{{seq}}</th><th>{{title}}</th><th>{{writer}}</th><th>{{viewcount}}</th><th colSpan="2">{{action}}</th></tr></thead>
</template>
<script>

export default {
    name:"BoardHeading" , 
    data(){
        return {
           seq :"번호",
           title :"제목",
           writer :"작성자",
           viewcount : "조회수",
           action : '추가동작'
        }
    },

}
</script>
<style>
th { border : 2px solid silver; width : 100px; text-align:center ; background-color:rgb(34, 163, 163);}
</style>