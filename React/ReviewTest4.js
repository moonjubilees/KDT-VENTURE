import React from "react";


class User extends React.Component{
    //this.props 이미 상속이 정의되었다
    //this.state=xxxxx 상속자 정의
    constructor(props){
        super(props);
        this.state = {
            name : this.props.name,
            address : this.props.address
        }//this.setState 같이 정의

    }

    render(){
        const greeting =()=>{
            //alert(this.props.name + " 회원님은" + this.props.address + " 지역에 삽니다.")
            alert(this.state.name + " 회원님은" + this.state.address + " 지역에 삽니다.")
        }
        const finalchange =()=>{
            //바꾸고 싶은 것만 setState에 나열하기
           this.setState({name : "", address : ""}); //state에 저장된 값을 변경하는 역할
           
        }
        const change =(e)=>{
            console.log(e.target.tagName + ":" + e.target.id +":" + e.target.value);//chane 이벤트가 발생한 태그명, id속성값, value값
            this.setState({[e.target.id] : e.target.value});
            
            // = this.state.name:name 입력되어진 value값
            // = this.state.address = address 입력 value
        }
        return(
            <div>
                <button onClick={greeting}>인사</button>
                <input id='name' type='text'onChange={change}></input>
                <input id='address' type ='text' onChange={change}></input>

                <button onClick={finalchange}>정보변경</button>
            </div>
        );
    }
}
export default User;

//onChange input 값 입력시 발생
//onClick - 클릭시 발생 

//const 변수명 = {} []
//jsx에 같이 쓸 때, <div> {변수명}

//1. 상태값 변경 추적 변수 선언
//-> this.state ={변수명 : "", ..}

//2. 상태값 변경시마다 반영
//-> this.setState({변수명:xxxx..})

//3. 변경된 값 getter 조회- 변경된 것을 수시로 확인가능 
//-> this.stat.변수명 