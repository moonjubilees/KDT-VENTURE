import React from "react";
class BoardHeading extends React.Component{
    render(){
        //테이블 제목 행 구성 - 3개 컬럼 : seq번호, title제목, wrtier작성자
        return(<thead><tr><th>번호</th><th>제목</th><th>작성자</th><th colSpan="2">추가동작</th></tr></thead>);
    }

}

class BoardRow extends React.Component{ //수정하거나 삭제한거 받게끔
 //props 필요 - 데이터 받는 것 
 //BoradList 에서 전달받은 board 변수에 존재하는 게시물만큼 테이블 행 구성  
/*  생성자 정의
 constructor(props){
     super(props);} */
 
     render(){


       
       const deleteBoard = (seq)=>{//alert("수정");
       
        //삭제 버튼 클릭한 게시물 번호 받아서 전달 this.props.deleteBoard (전달) 호출

        }

        const updateBoard =(event)=>{//alert("삭제");
            const oneBoard = {seq : event.target.id, title : "수정제목", writer : "수정작성자"};
            this.props.updateBoard(oneBoard);
             }
             //this.id 이런 표현 x

        const tr_tag = this.props.board.map(function(one) {
            return (<tr key={one.seq} >
                <td>{one.seq}</td><td>{one.title}</td><td>{one.writer}</td>
            <td><button onClick={deleteBoard}>삭제</button>
            </td><td><button  id ={one.seq} onClick={updateBoard}>수정</button></td>
            </tr>); 
         } );//map 
         return (<tbody>{tr_tag}</tbody>); //5개의 tr태그가 만들어지는 것 return
     }
}


class BoardWriteForm  extends React.Component{

    render(){
        //1. 게시물 제목, 작성자 입력 input 태그 2개 정의
        //2. 글쓰기 button 1개 정의
        //3. 제목, 작성자 입력시 입력값 가져오기
        //4. 글쓰기 버튼 클릭하면 게시물 번호 + 1씩 증가 <- 게시물 번호 값 - 바로 alert로 출력
    
    const oneboard = {seq:0, titile:'', writer:''} //게시물 1개 입력시 정보 저장용도 객체
    const change = (event)=>{ //이 과정이 3번까지 진행
        /* if(event.target.id === 'title') oneboard.title=event.target.value; //게시물 입력
        if(event.target.id === 'writer') oneboard.writer =event.target.value;  */
        oneboard[event.target.id] = event.target.value; //원보드라는 객체에서 title 변수값 찾아올 때 = oneboard.title
     }

    const finalChange = () => { 
            oneboard.seq =   this.props.board.length + 1; 
            alert(oneboard.seq +":" + oneboard.title + ":" + oneboard.writer);
            this.props.addBoard(oneboard); //oneboard는 새글 
        }

        return(
            <div>
           게시물제목 :  <input type="text" id="title" onChange={change} />
           게시물작성자 : <input type="text" id="writer" onChange={change} />
           <button onClick={finalChange} > 글쓰기 </button>
            </div>

        );
    }
}
//test1 지역변수 boardlist 선언 - render할때마다 리셋됨
/* class BoardList extends React.Component{
    //화면 구성 1번 호출
    render(){//- 반복문
        const board = [
            {seq:1, title:'제목1', writer : "작성자1"},
            {seq:2, title:'제목2', writer : "작성자2"},
            {seq:3, title:'제목3', writer : "작성자3"},
            {seq:4, title:'제목4', writer : "작성자4"},
            {seq:5, title:'제목5', writer : "작성자5"},

        ]
 return  (<div><table border="5"> <BoardHeading/> <BoardRow board ={board} /> </table><BoardWriteForm/></div>);
    }
   
}
export default BoardList; */

//test2 = 데이터 변화가 생길 때 re-rendering 하지 않음 
/* class BoardList extends React.Component{
    //render 메소드뿐 아니라 + 다른 메소드 (board에 접근해서 변수 사용 가능)
    //const는 지역변수만. 멤버변수 사용시 const
    board = [
        {seq:1, title:'제목1', writer : "작성자1"},
        {seq:2, title:'제목2', writer : "작성자2"},
        {seq:3, title:'제목3', writer : "작성자3"},
        {seq:4, title:'제목4', writer : "작성자4"},
        {seq:5, title:'제목5', writer : "작성자5"},

    ]
    //board 1개 게시물 추가하는 메소드 정의
    add=()=>{
        this.board.push( {seq:6, title:'제목6', writer : "작성자6"});
        console.log(this.board.length); // = 6
    }

    //화면 구성 1번 호출
    render(){
       
 return  (<div><table border="5"> <BoardHeading/> <BoardRow board ={this.board} /> </table>
 <button onClick={this.add}>게시물 추가</button>
 <BoardWriteForm board={this.board}/></div>);
    }
   
}
export default BoardList; */

//test3 = 데이터 변화가 생길 때 re-rendering 함 - state 사용
//리액트 클래스 내부 state 변수 존재
/* class BoardList extends React.Component{
    //1. state 변수 선언
state={ board : [ //json 같아서 변수명 : 변수값 
    {seq:1, title:'제목1', writer : "작성자1"},
    {seq:2, title:'제목2', writer : "작성자2"},
    {seq:3, title:'제목3', writer : "작성자3"},
    {seq:4, title:'제목4', writer : "작성자4"},
    {seq:5, title:'제목5', writer : "작성자5"},

]}
    //render 메소드뿐 아니라 + 다른 메소드 (board에 접근해서 변수 사용 가능)
   
   
    //board 1개 게시물 추가하는 메소드 정의
    //3.state 내부 변수 setter
    add=()=>{
        const copyBoard = [...this.state.board,{seq:6, title:'제목6', writer : "작성자6"}]; //...은 리액트의 연산자이자 - 스프레드 연산자
        this.setState({board : copyBoard}); 
        // this.board.push( {seq:6, title:'제목6', writer : "작성자6"});
        console.log(this.state.board.length); // = 6
    }

    //화면 구성 1번 호출
    //2. state 변수 사용하는 부분 - this.state.변수(board)
    render(){
       
 return  (<div><table border="5"> <BoardHeading/> <BoardRow board ={this.state.board} /> </table>
 <button onClick={this.add}>게시물 추가</button>
 <BoardWriteForm board={this.state.board}/></div>);
    }
   
}
export default BoardList; */

//test4 = state 사용 - 새글쓴 내용 배열에 저장
//리액트 클래스 내부 state 변수 존재
class BoardList extends React.Component{
    //1. state 변수 선언
state={ board : [ //json 같아서 변수명 : 변수값 
    {seq:1, title:'제목1', writer : "작성자1"},
    {seq:2, title:'제목2', writer : "작성자2"},
    {seq:3, title:'제목3', writer : "작성자3"},
    {seq:4, title:'제목4', writer : "작성자4"},
    {seq:5, title:'제목5', writer : "작성자5"},

]};
    //render 메소드뿐 아니라 + 다른 메소드 (board에 접근해서 변수 사용 가능)
   
   
    //board 1개 게시물 추가하는 메소드 정의
    //3.state 내부 변수 setter
    addBoard=(newBoard)=>{
        const copyBoard = [...this.state.board, newBoard]; //...은 리액트의 연산자이자 - 스프레드 연산자
        this.setState({board : copyBoard}); 
        // this.board.push( {seq:6, title:'제목6', writer : "작성자6"});
        console.log(this.state.board.length); 
    }
    //this.props.deleteBoard(event.target.id); 
    deleteBoard = (seq)=>{
        //삭제할 게시물 번호 전달받아서 
        this.setState({board : this.state.board.filter(function(one){return one.seq != seq})});;
        //board 배열에서 해당 게시물 삭제

    }
    updateBoard =(oneBoard) =>{
        //board 배열에서 oneBoard.seq의 같은 데이터를 찾아서, 그 데이터의 제목(=oneboard.title)과 작성자(=oneboard.writer) 수정
        //조건 ? true 수행 : false 수행
        this.setState({board : this.state.board.map((one)=>
             one.seq == oneBoard.seq? {...this.state.board, seq: oneBoard.seq, title : oneBoard.title, writer : oneBoard.writer}: one  
        //수정한 게시물 찾았다 - state.board에서 title .. 이렇게 바꿔라
        )//map end
        }
   );//setState end 
    }

    //화면 구성 1번 호출
    //2. state 변수 사용하는 부분 - this.state.변수(board)
    render(){
       
 return  (<div><table border="5"> <BoardHeading/> <BoardRow board ={this.state.board} deleteBoard={this.deleteBoard} updateBoard ={this.updateBoard} /> 
 </table>
 <BoardWriteForm board={this.state.board} addBoard={this.addBoard}/></div>);
    }
   
}
export default BoardList;

