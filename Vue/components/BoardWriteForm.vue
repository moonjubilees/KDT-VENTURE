<template>
    게시물제목 : <input type=text id="title" @input="inputHandler"/>
    게시물작성자 : <input type=text id="writer" @input="inputHandler"/>
    <button @click="writeHandler">글쓰기</button> 

</template>
<script>

export default {
    name:"BoardWriteForm" , 
    data(){
        return {
            writeboard : {   
                title : '', //제목입력값 저장
                writer : ''//작성자입력값 저장  

            }
        }
    } ,
    methods :{
        inputHandler (event) { 
            //console.log(event.target.id + ":" + event.target.value); 
            this.writeboard[event.target.id] = event.target.value;
            //console.log(this.writeboard.title + ":" + this.writeboard.writer); 
          },
        writeHandler(){  
             
            this.$emit('writeFromChild', this.writeboard.title, this.writeboard.writer); 
         }
    }

}
</script>
<style>
button {background-color: orange;}
</style>