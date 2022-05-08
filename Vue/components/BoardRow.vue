<template>
     <tbody>
         <tr v-for="(oneboard) in board" :key="oneboard.seq" >
             <td>{{oneboard.seq}}</td><td>{{oneboard.title}}</td><td>{{oneboard.writer}}</td><td>{{oneboard.viewcount}}</td>
             <td><button @click="deleteHandler" :id="oneboard.seq"> 삭제 </button></td>
             <td><button @click="updateHandler" :id="oneboard.seq"> 수정 </button></td>
         </tr>
     </tbody>
</template>
<script>

export default {
    name:"BoardRow" , 
    props :{
        board : {type:Array}
    } , 
    methods : {
        deleteHandler (e) {   console.log("삭제:"+e.target.id); this.$emit("deleteFromChild", e.target.id ); } , 
        updateHandler (e) { console.log("수정:"+e.target.id); this.$emit("updateFromChild" , {seq : e.target.id , title: '수정한 제목', writer : '수정한 작성자', viewcount : 0 }  ) ; }
    }    

}
</script>
<style>
td { border : 2px solid silver; width : 100px; text-align:center ; }
</style>