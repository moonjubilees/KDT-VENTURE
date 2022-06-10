package ch4;

public class ForTest {

	public static void main(String[] args) {
		/////// 1-10 총합계

		/////// for문
		int total = 0;
		for (int i = 1; i <= 10; i++) { // i+1과 같은 의미
			System.out.println(i);
			total = total + i; // total 점수는 계속 바뀜. i가 전해지면서 계속 total이 바뀌게 됨
			System.out.println("i=" + i + "일 때 total= " + total);
		} // 지역번수 i를 사용할 수 있는 지역은 for문
		System.out.println(total);

		///// while문
		int total2 = 0; // 도와주는 변수 선언
		int i2 = 101;
		while (i2 <= 100) { // 괄호안에 조건 넣어주기
			total2 = total2 + i2;
			System.out.println("i2=" + i2 + "일 때 total2= " + total2);
			i2++; // 도와주는 변수 업데이트

			///// do-while문
			int total3 = 0;
			int i3 = 101;
			do {
				total3 = total3 + i3;
				System.out.println("i3=" + i3 + "일 때 total3= " + total3); // 실행할 구문
				i3++;
			} while (i3 <= 100); // 조건 검사

		}
	}
}
