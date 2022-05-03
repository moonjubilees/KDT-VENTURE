
// //책 제목 출력하는 리액트 컴포넌트 
// //화살표 함수 정의
// // const TitlePart =(props) => { //객체
// //     return (
// // <div>
// //     <h3>제목 : {props.title}</h3>
// //     <h3>출판사 : {props.pub}</h3>
// //     <h3>저자 : {props.author}</h3>
// //     <hr/>
// //     </div>
// //     );
// // }

// // //책 내용 출력하는 리액트컴포넌트 
// // //props는 전달되는 property들이다
// // const ContentPart =(props)=> {   
// // return (
// //     <div>
// //     <h6>총 페이지 수 : {props.totalpage}</h6>
// //     <h6>글 내용 : {props.contents}</h6>
// //     <hr/>
// //     </div>
// // );
// // }

// // //이 두개를 조합 - 두개를 포함하는 컴포넌트
// // const Book =(  ) => {
// //     const data = {title:"책제목",pub : ": 출판사", author : "책저자", contents : "책내용", pages:100};
// //     return (
// //         <div>
// //         <TitlePart title={data.title}pub ={data.pub} author={data.author}/> {/* 컴포넌트 호출, 변수명 : 변수값  */}
// //         <ContentPart contents={data.contents} totalpage={data.pages} />
// //        </div>
// //     );
    
// // }
// // export default Book;

// //property 
// //-Book(부모)
// //-Title(자식1)
// //-ContentPart(자식2)
// //부모 컴포넌트가 자식 컴포넌트에게 데이터 전달
// //<자식 변수명1 =값 변수명2 =값 />


// import React from "react";
// //2.클래스 선언
// //title같은 클래스 선언부에서 변수는 props 여야한다
// class TitlePart extends React.Component{
//     //생성자
//     constructor(props){
//   super(props);
//     }
//     render(){
//         return (
//             <div>
//                 <h3>제목 : {this.props.title}</h3>
//                 <h3>출판사 : {this.props.pub}</h3>
//                 <h3>저자 : {this.props.author}</h3>
//                 <hr/>
//                 </div>
//             );
//     }
// }
// //
// class ContentPart extends React.Component{
//     constructor(props){
//         super(props);
//     }
//     rendor(){
//         return (
//                 <div>
//                 <h6>총 페이지 수 : {this.props.totalpage}</h6>
//                 <h6>글 내용 : {this.props.contents}</h6>
//                 <hr/>
//                 </div>
//             );
//     }
// }
// class Book extends React.Component{
//     render(){
//         const data = {title:"책제목",pub : ": 출판사", author : "책저자", contents : "책내용", pages:100};
//             return (
//                 <div>
//                 <TitlePart title={data.title}pub ={data.pub} author={data.author}/> {/* 컴포넌트 호출, 변수명 : 변수값  */}
//                 <ContentPart contents={data.contents} totalpage={data.pages} />
//                </div> //부모는 전달, 자식은 받고
//             );
//     }
// }
// export default Book;