package ch6;

class Student{
	
//Student() {} // 자동정의 = default  constructor
Student(int id, String name, String major){ //생성자의 매개변수자체를 바꿨음 그래서 밑에 호출할 수 없음
	this.id = id;
	this.name =name;
	this.major = major;
	
}
Student(int id, String name) {
	this(id, name, "전공미정");
	/*this.id = id;
	this.name = name ;//생성자 이름은 클래스랑 같아야함
	major = "전공미정"; //this안붙여도 됨. 위에는 변수명이 같으니까  똑같이 정의해야댐*/
}
Student(){
	this (-1, "none", "전공미정");
/*id = -1;
name = "none";
major = "전공미정"; */
}
	int id ; //학번
	String name ;
	String major;
	void study() { //매개변수
		System.out.println(name + " 학생은"+  major +  "공부를 열심히 합니다.");
	}

}

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student(10000, "이조림", "it전산학"); //객체생선 , 입력한것들은 매개변수임
		//st1.id = 10000; //밑에는 객체에 인스턴스 값 초기화 지정
		//st1.name = "이조림";
		//st1.major = "it전산학";
		st1.study();
		Student st2 = new Student(20000, "이생선", "조리과");
		//st2.id = 20000;
		//st2.name = "이생선";
		//st2.major = "조리과";
		st2.study();
		
	}
}
