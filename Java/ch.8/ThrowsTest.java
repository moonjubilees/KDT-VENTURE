package ch8;

import java.io.IOException;

class Test {
	void ma(int i) throws IOException {
		System.out.println(100/ i);	
		throw new IOException(); //throw는 예외발생시킴 
	}
void mb ()  throws ArithmeticException {
	
	try {
	ma (0);
	}catch (IOException e) {
		System.out.println("입출력오류");
}
}
}
public class ThrowsTest {

	public static void main(String[] args) { //main이 가장먼저 실행. 
		Test t = new Test ();
		try { 
			t.mb() ;
		}catch (ArithmeticException e) {
			System.out.println("0 나누기 불가");
		}
	}

}
