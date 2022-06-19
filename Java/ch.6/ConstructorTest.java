package ch6;

class Initial {
	int i ;
	int j= 10;
	static int k = 30; //static은 객체 생성하기 전에 만들기. 그래서 int 클래스 이름 붙여줌.
	Initial(int  i,  int j){
		this.i = i;
		this.j = j;
		k++;
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		System.out.println(Initial.k);
		Initial ini = new Initial(100, 200);
		
		System.out.println(ini.i);
		System.out.println(ini.j);
		System.out.println(ini.k);

	}

}
