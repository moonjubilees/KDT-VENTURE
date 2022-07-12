package ch9;

public class StringTest1 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		a= a + b;
		System.out.println(a);

		char c [] = {'a', 'b', 'c', 'd'	} ;
		//String으로 변환해주자
		String sc = new String (c);
		System.out.println(sc);
		
		byte by[] = {65, 66, 67, 68};
		String sb = new String(by);
		System.out.println(sb);
		}
}
