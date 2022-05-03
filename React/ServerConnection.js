import axios from "axios";
import { useState } from "react";
function ServerConnection() {
    //함수선언 형태 리액트 컴포넌트에서는 this.state 없음
    //대신 아래와 같은 방법
    const [result, setResult] = useState('');
    /* this.state ={result : ''} 
        this.setState('''수정할 것으로 받아올 것) -> this.setResult(result수정할 값)
    */
    
    //result가 뭔지 선언 -get방식으로 호출하라 
    //let result = '';

    //test1 파라미터 없는 경우
    //proxy 설정인 경우
    //axios. get("/helloreact")

    /* axios.get('http://localhost:8081/helloreact')
    .then(function(response){
        result = JSON.stringify(response.data)
    }); */

    //test2 파라미터 있는 get방식
    /* axios.get('http://localhost:8081/helloreactparam', {params : {id:"get전송" ,password : 1234 }})
    .then(function(response){
        setResult(JSON.stringify(response.data));
        console.log(result); //출력
    });
 */
    //test3 파라미터 있는 post방식
    /* axios.post('/helloreactparampost', {id:"post전송" ,password : 1234 })
    .then(function(response){
        setResult(JSON.stringify(response.data));
    }); */

    //test4
     axios.get('/userlist')
    .then(function(response){
        setResult(JSON.stringify(response.data));
        console.log(result); //출력
    })

    return (<div><h1>통신시작</h1><h1>{result}</h1><h1>통신끝</h1></div>);

}
export default ServerConnection;