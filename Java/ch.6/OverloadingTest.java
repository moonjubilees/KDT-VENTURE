package ch6;

class Arithmetic {
	int add(int i, int j) {
		return i + j ; //return 타입은 int 가 됨, 매개변수 i와  j는 같지만 타입이  달라. 
}
	double add(double i, double j) {
		return i + j ;
	}	
	String add(String i, String j) {
			return i + j ;
	}
}
public class OverloadingTest {

	public static void main(String[] args) {
		Arithmetic  a = new Arithmetic();
		double r1 = a.add(1.1,  2.5);
		String r2 = a.add("java", "jsp") ;
		int r3 = a.add(100, 200);
		double r4 = a.add(3.14,1) ; //오버로딩적용 될  때, 매개변수의 타입을 보고 위에서 선택을 한다는거
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		int decimal  = Integer.parseInt("100") ;
		int bin = Integer.parseInt("100", 2); //2진법
		int hex = Integer.parseInt("100", 16) ; //16진법
		System.out.println(decimal);
		System.out.println(bin);
		System.out.println(hex);
	}

}
