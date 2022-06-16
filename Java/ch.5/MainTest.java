package ch5;

public class MainTest {

	public static void main(String[] args) { 
		System.out.println("입력변수 갯수=" + args.length);
		System.out.println("내용출력");
		
		for (int i = 0; i < args.length; i++) {
				System.out.println(args [i]);

	}//main end
		
		// run ....100 200
		//300출력
		System.out.println( args[0] + args[1]); //"100" 문자열 100이라고 컴퓨터는 생각한 것 -> 그래서 두개를 연결한 값을 냄 100200
		// 자바에는 형변환 - boolean타입을 제외한 기본형 변수들끼리 가능. String 기본형 변수 x -> 참조형 (heap영역)
		//String -- int 형변환 
		int first = Integer.parseInt(args [0]);
		int second = Integer.parseInt(args [1]);
		System.out.println(first + second);
		//String 를 실수로 하려면 double 형변환
		// Integer -> Double (아래참고)
		//double d1 = Double.parseDouble(args[0]);
	}
}//public end
