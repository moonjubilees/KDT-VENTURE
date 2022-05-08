<template>
<h1> 뷰 게시판 </h1>
    <table>
        <BoardHeading />
        <BoardRow :board="board" @deleteFromChild="deleteInParent" @updateFromChild="updateInParent" />
    </table>
    <br>
    <BoardWriteForm @writeFromChild="writeInParent" />
</template>
<script>
import BoardHeading from './components/BoardHeading.vue';
import BoardRow from './components/BoardRow.vue';
import BoardWriteForm from './components/BoardWriteForm.vue';

export default {
    name:"BoardList" , 
    data(){
        return {
            board : 
            [
            {seq:1, title:'제목1', writer : "작성자1" , viewcount:0},
            {seq:2, title:'제목2', writer : "작성자2", viewcount:0},
            {seq:3, title:'제목3', writer : "작성자3", viewcount:0},
            {seq:4, title:'제목4', writer : "작성자4", viewcount:0},
            {seq:5, title:'제목5', writer : "작성자5", viewcount:0}
            ]
        }
    },
    methods :{
        writeInParent (title, writer){
            this.board.push({seq: this.board.length+1 , title:title, writer : writer , viewcount:0 } );
        } , 
        deleteInParent (seq){
            this.board = this.board.filter( function(oneboard) { return oneboard.seq  != seq } );
        } , 
        updateInParent (updateboard){
            this.board.map( function(oneboard){
                if(oneboard.seq == updateboard.seq ){
                    oneboard.title = updateboard.title;
                    oneboard.writer = updateboard.writer;
                    oneboard.viewcount ++;
                }//if


            } );//map
        }//updateInParent 
    }// methods
    ,
    components:{
        BoardHeading ,
        BoardRow , 
        BoardWriteForm 
    }
}
</script>
<style>
h1 { color : green}
table { border : 2px solid silver;}
</style>