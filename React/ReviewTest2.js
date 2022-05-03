import React from "react";

class B extends React.Component{
    render() {
        const user ={ 'id' : '아이디', password:1234, name :"이름", phone:"010-2222-3333", email:"a@react.com", address:"서울시 와부구 덕소동"};
        return (
        <div>
        <h1>클래스형태의 리액트 컴포넌트</h1>)
        <h2>{user.id}</h2>
        <h2>{user.password}</h2>
        <h2>{user.name}</h2>
        <h2>{user.phone}</h2>
        <h2>{user.email}</h2>
        <h2>{user.address}</h2>
        </div> );
    }
}

export default B;
