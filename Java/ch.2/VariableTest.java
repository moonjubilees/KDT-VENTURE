package ch2;

public class VariableTest {

	public static void main(String[] args) {
		// 국어 영어 수학 점수  선언 + 값 할당
		int kor = 100;
		int eng = 50;
		int mat = 75;
		
		// 총점 점수 ; 선언만 해줌
		int sum ;
		
		// 평균 : 선언만 해줌
		int avgInt ;
		double avgDouble; //실수타입
		
		System.out.println("국어점수는=" + kor); // String + 정수 실수, String + String ==> 요소 결합 출력
		System.out.println(kor + eng + mat); // 100 + 50 + 75
		System.out.println(eng); //50
		System.out.println(mat); //75
		
		eng = eng * 2;
		sum = kor + eng + mat;
		avgInt = sum / 3;
		avgDouble = sum / 3.0;
		
		System.out.println(sum);
		System.out.println(avgInt);
		System.out.println(avgDouble); // 평균 점수 중에 실수 
		
		
		boolean flag = true;
		System.out.println(flag);
		flag = false ; 
		System.out.println(flag);
		// 오류가 난 문장 (허용할 수 없는 값을 줬기 때문)boolean flag2 = True;
		
		char c1 = '이'; // 문자 컴퓨터 이진수로 받아들임 - 자바는 unicode - 'a' 규칙을 따른다. 
		char c2 = '학';
		char c3 = '생';
		char c4 = '\n'; // new line - 엔터키
		
		System.out.print(c1 + "\n");
		System.out.print(c2);
		System.out.println(c3);
		// System.out.println((char)c1 + "" + (char)c2 + (char)c3);

		//기본 제공 데이터타입 상으로는 여러 문자를 묶어서 선언 후 불가능함
		// 사용자가 데이터 타입을 정의해서 사용가능함 = 기본 제공 데이터타입 
		// = 1. (누가 클래스로 만들어 둔 것)자바 라이브러리 구현 제공 쓰자 (String 클래스 jdk 포함)= > 2. 사용자 정의 
		String name = "이학생"; //문자열을 나타낼 때 사용함
		

	}

}
