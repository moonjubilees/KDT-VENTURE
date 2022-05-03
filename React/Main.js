import { Link } from "react-router-dom";


const Main = () => {
    return (<div>
        <h1>메인 화면 입니다.</h1>
        <Link to ="/boardlist">게시판이동</Link><br/>
        <Link to ="/board/1/공지사항">게시물</Link><br/>
        <Link to ="/board/2/사용자 등록 글">게시물</Link><br/>
        <Link to ="/board/3/관리자 삭제 글">게시물</Link><br/>
        <Link to ="/board?seq=100&title=테스트&writer=작성자">게시물</Link><br/>
        </div>);
}


export default Main;