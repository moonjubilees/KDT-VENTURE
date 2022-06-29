package ch7;

class A {int ia = 10;
//object로 부터 상속
void ma() { System.out.println(ia);

}
class B extends A{
	int ib = 20;
	void mb () {
		System.out.println(ib);
	}
}
class C extends A {
	int ic = 30;
	void mc() {
		System.out.println(ic);
}
}
class D extends C{
	int id = 40;
	void md() {
		System.out.println(id);
		}
}


public class CastingTest {

	public void main(String[] args) {
		A a1 = new A (); //Object객체 + A객체
		//자동형변환
		A a2 = new B(); //Object객체 + A객체+B
		A a3 = new C (); //Object객체 + A객체+C
		A a4 = new D (); //Object객체 + A객체+C+D
		//사용변수나 메소드 
		/*System.out.println(a1.ia);
		a1.ma();
		System.out.println(a2.ia);
		a2.ma();
		System.out.println(a3.ia);
		a3.ma();
		System.out.println(a4.ia);
		System.out.println(a2.ib);
		a4.ma(); */
	B b2 = (B) a2;
	System.out.println(b2.ib);
	//System.out.println(a3.ic); //오류. 메모리 ic 변수 포함 객체 생성되었으나 접근 불가능
	
	C c3 = (C)a3;
	System.out.println(c3.ic);
	
	System.out.println(a1.ia);
	
	D d4 = (D)a4;
	System.out.println(d4.id);
	
	//자동형변환 필요한 경우 - 변수  타입 통일 - 여러가지 객체 1개 배열 선언
	A Array []= new A[4];
	}
	
}
}
