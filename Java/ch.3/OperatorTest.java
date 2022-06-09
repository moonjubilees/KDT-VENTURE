package ch3;

public class OperatorTest {

	public static void main(String[] args) {
		boolean r1 = true;
		boolean r2 = false;
		boolean r3 = 10 > 5;
		
		int i1 = 100;
		int i2 = 200;
		double d1 = 100.0; //3개의 숫자타입을 선언 해줌
		boolean r4 = i1 ==  i2; //==는 동등비교연산자, =는 대입연산자 
		boolean r5 = i1 == d1;
		boolean r6 = (double)i1 == d1;

		System.out.println(r4); //false
		System.out.println(r5); //true
		System.out.println(r6); //true
		
		int i3 = 10 /3;
		int i4 = 10 % 3;
		double d2 = 10 / (double)3;
		System.out.println("정수몫="+i3); //문자열 결합 형태의 연산자 +
		System.out.println("나머지="+i4);
		System.out.println("실수몫="+d2);
		System.out.println("덧셈=" +(100 + 200));

		int i = 0; //i변수가 1이면 수료 / 0, -1, ... 미수료
		String finish = i == 1 ? "수료 " : "미수료"; //String 타입임, == 조건삼항 먼저하고, 제일 뒷순위이면 대입연산자 계산
    //조건삼항(예시) : int a = (5<4 조건문) ? 50(참일 때) : 40(거짓일 때)
		System.out.println(finish);
		
		
	}

}


