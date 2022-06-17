package ch6;

class Data{
	int a = 30;
}

class Call {
	void  add(int i ) { //void는 리턴되는 타입이 없음
		System.out.println("add내부=" + i++);
	}
	void addData(Data d) {
		System.out.println("addData내부=" + d.a++);
	}
}
public class CallTest {

	public static void main(String[] args) { //main부터 실행예정
		int j = 10; //지역변수
		Call c = new Call ();
		//밑에것들은 기본형 전달 원리
		//c.add(j);
		//System.out.println("main내부" + j);
		Data d1= new  Data ();
		c.addData(d1);
		System.out.println("main내부=" + d1.a);

	}

}
