package ch9;

public class ObjectTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject(100, "java"); //object 타입으로 객체를 만드는 문장. 다시 쓸 일이 없음.
		MyObject o2 = new MyObject(100, "java"); 
		
		
		System.out.println(o1);
		//System.out.println(o1.toString()); //tostring은 String값 반환 //200-java 형태 출력하도록 수정 -메소드 오버라이딩
		System.out.println(o2);
		//System.out.println(o2.toString());
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//패키지명.클래스@16진수(주소값)
		if (o1 == o2) { //주소비교 
			System.out.println("o1 == o2 true");
		}
		if (o1.equals(o2)) { //주소비교, 메소드 오버라이딩 가능, 수정 이퀄스쓰면 메소드로 변경할수있다. // MyObject 타입이고 code, msg 변수값 등록하면 true
			System.out.println("o1.equals(o2) true");
			
		}
		
	}
}
class MyObject /*extends Object*/ {
	int code ;
	String msg ;
	MyObject(int code, String msg) {
		this.code =code ;
		this.msg = msg;
	}
	 @Override
	public String toString() {
		return code + "-" + msg;
	
	} 
	@Override //obj = o2; // obj = new String ("aaa")
	public boolean equals(Object obj) { //equals의 리턴타입은 boolean. 비교니까 
		//MyObject 타입이고 code, msg 변수값 등록하면 true 
		if(obj instanceof MyObject) {
			if(this.code == ((MyObject)obj).code && this.msg.equals(((MyObject)obj).msg)) {	
				return true;
	}
	else {
		return false;
	}
		}
	else {
		return false ;
	}
	}
	
}



