package ch6;

class Math {
	int factorial (int su) { //얼마에 팩토리얼을 줄건지  변수 선언해야함
		int re =  0;
		/*if (su ==1) {
			re=1; 
}	
		else {
		re = su * factorial(su-1);
		} */
		for(int i= su; i >1; i--) {
			re=re*i ;
		}
		return re; 
	}
}
public class FactorialTest {

	public static void main(String[] args) {
		Math m = new Math (); //math 타입의 객체 만들어
		m.factorial(10);
		int result = m. factorial (10);
		System.out.println("10!=" + result);
	}

}
