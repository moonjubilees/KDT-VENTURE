
//test1
//전달은 ---  {/* <Route path ="/board" element={<Board seq="1"/> } />  */}

/* const Board =(props) =>{
return (<div><h1>{props.seq} 번 게시물입니다.</h1></div>);

} */

//test2
//{/* <Route path ="/board" element={<Board seq="1"/> } />  */}
/* import { useParams } from "react-router-dom";
const Board =() =>{
    const{seq, title} = useParams();
    //useParams <- 리액트 라이브러리/ 리턴 결과(=객체) 중 seq변수 있다면, title이랑 변수만 가져와서
    return (<div><h1>{seq} 번 제목이 {title}인 게시물입니다.</h1></div>);
    
    } */

    //test3 - get http url? - query string 전달받는 형태 
    import { useParams, useSearchParams } from "react-router-dom";
    const Board =() =>{
       const[searchParams] = useSearchParams();
       //useSearchParams 에서 제공하는 오만가지 정보 가운데, searchParams 라는 변수만 가져온다
       //console.log(searchParams);
       const seq = searchParams.get("seq");
       const title = searchParams.get("title");
       const writer = searchParams.get("writer");
        

    return (<div>{seq} 번 {title} 제목의 글을 {writer} 가 작성하셨습니다.</div>);
    }
export default Board;