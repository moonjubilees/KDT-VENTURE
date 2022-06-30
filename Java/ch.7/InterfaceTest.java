package ch7;

class Teacher {
	String name = "선생님" ;
	void teach () {
		System.out.println("가르치다");
	}
}
class StudentWorker extends Teacher implements Worker, Student {
	String name = "조교" ;
	void getName () {
		System.out.println(name);
		System.out.println(super.name); //구별해주는 super
	}
	
	@Override
	public void study() {
		System.out.println("공부하다");
	}

	@Override
	public void work() {
		System.out.println("학교업무보다");
	}

	@Override
	public void lunch() {
		System.out.println("점심먹다");
	}
	
	
}
public class InterfaceTest {

	public static void main(String[] args) {
		StudentWorker sw = new StudentWorker();
		sw.study(); //인터페이스로부터 상속받아 구현 오버라이딩함.
		sw.lunch(); //인터페이스 구현 (2개 인터페이스 포하마 - 구현 1번)
		sw.work(); //인터페이스 구현 
		sw.teach(); //teacher클래스 상속받았거든
		System.out.println(Student.name); //인터페이스에서 상속받은것만 2개임. 인터페이스의 변수는 static
		System.out.println(Worker.name);
		sw.getName();

		//매개변수로 전달하는 객체의 다형성을 보고 있음 
		Student s = new StudentWorker();
		StudentService ser = new StudentService();
		ser.serve(s);
		Student s2 = new HightStudent();
		ser.serve(s2);
	}

}

class HightStudent implements Student {

	@Override
	public void study() {
		System.out.println("고등학생이 공부하다");
		
	}

	@Override
	public void lunch() {
		System.out.println("무상급식하다");
		
	}
	
}

class StudentService {
	void serve (Student st ) {
	st.study();
	}
	
}
