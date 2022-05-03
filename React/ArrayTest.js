/* import React from "react";
class ArrayTest extends React.Component{
    render(){
        const sample = ['a', 'b', 'c','d','e'];
        //sample.push('g'); 
        //sample.pop(); //맨 뒤에 있는 데이터 없애는 것
        //const resultsample = sample.splice(1,2); //1번 인덱스부터 2개 삭제
        const resultsample = sample.filter(function(one){return one !='a'}); //샘플데이터 하나하나를 펑션이 반복함. 배열개수만큼
        return(<div> <h3> 샘플={sample}</h3><h3>결과={resultsample}</h3></div>)
    }
}

//샘플 = ade - 삭제 후 남은 데이터
//결과 = bc - 삭제된 데이터 리턴

//샘플 = abcde
//결과 = bcde // 'a' 삭제 후 결과배열
export default ArrayTest; */