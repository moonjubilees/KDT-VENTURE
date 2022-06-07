
public class StringTest {

	public static void main(String[] args) {
		String s1= "java"; //문자열
		char c1 = 'j'; //하나의 변수만
		int i1 = 100; //정수
		
		System.out.println(s1); //java
		System.out.println(c1); //j
		
		System.out.println(s1 + c1); //javaj
		System.out.println(s1 + i1); //java100
		System.out.println(c1 + i1); //106 + 100 = 206
		// + -1, 숫자 덧셈 - 정수/실수 + 정수/실수 , 단일문자 unicode ('a' -> 97 'b' -> 98 'j'-> 106)
		// + 문자열 결합 - String(한 쪽은 String 이어야 함) + 다른 타입, 다른 타입 + String, String + String 
		
		byte b1 = 127; // 1byte 정수 = 8bit [부호1bit][값7bit] --> 2^7 ~ 2^7 -1 --> -128~127
		int b2 = 1280000000; // 오버플로우 
		
		int i2 = 127; // 127(4byte)
		byte b3 = (byte)i2;
		
		
		int i3 = 97;
		System.out.println(i3);
		System.out.println((char)i3); //a
		
		System.out.println( (char)(i3-32)); //65
	}

}
