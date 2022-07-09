package ch9;

public class MathTest {

	public static void main(String[] args) {
		boolean r1= Boolean.parseBoolean("TrUE"); //기본형 불리언으로 만들게  함 
		System.out.println(r1);
		System.out.println(Integer.toBinaryString(10)); //10을 줄테니 바이너리 형태로 2진수 만들어봐
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
	}

}
