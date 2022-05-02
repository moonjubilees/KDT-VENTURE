 function A() {
     
  /*  function B( ){alert(1);} //유명함수
    const B = function( ){alert(1);} //무명함수
    const B =( )->alert(1) //화살표 함수 
    //3개 다 똑같은 표현  */

  /*   const clickHandler =function(  ){ alert("버튼클릭");}//무명 함수/ 이벤트 처리 */
  const clickHandler =() => {alert("버튼클릭");} //화살표 함수 / 이벤트 처리 
     const css1 ={color :"green", fontSize:'2em'}//변수. 자바스크립트 변수로 css 정의 (자바스크리브 변수명 '-', 포함x)
    
    const list = ['리스트1', '리스트2', '리스트3', '리스트4', '리스트5'];

    const li_tag = list.map((one, index)=> <li key = {index}> {one}</li> );
    //const li_tag = list.map(function(one) { return <li>{one}</li> ; }); //무명함수
    //li_tag는 list의 데이터를 조작한 함수 결과 리턴
    //li_tag = []

     return (
    <div><h1>리액트 실행합니다.</h1>
    <ul style={css1}> {li_tag}</ul>
    <button onClick={clickHandler} ><h3>클릭해 보세요.</h3></button>
    </div>);
 }

 export default A;
 //jsx는 리액트 함수가 리턴한 결과 = index.html 보여질 때 html 문법 자동 변환
 //jsx 내부 자바스크립트 변수{변수명}
 //css속성변수 정의 - font size -> fontSize 규칙 따를 것
 //DOM, jqeury 표현x
 //이벤트 처리 one대문자 시작 이벤트 명