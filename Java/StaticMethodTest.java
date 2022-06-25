package ch6;

class B{
	int i = 1; //인스턴스 변수 (멤버변수)
	static int j = 20; // 클래스변수 
	void m1() { //인스턴스메소드에서 인스턴스변수 + 클래스 변수 사용
		System.out.println(i+j);
}
	static void m2() {
		System.out.println(j);
	}
	}
public class StaticMethodTest {
	void test () {
		System.out.println("클래스=StaticMethodTest ");
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		B.m2 (); //b1.m2();
		
StaticMethodTest s= new  StaticMethodTest(); //객체 만들고 
		s. test(); 
		
		
	}

}
