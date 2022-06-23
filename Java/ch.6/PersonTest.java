package ch6;

class Person{
	String name;
	int age ;
	static final String nation = "대한민국" ; //따로 메모리에 저장됨 , modifier = final 수정하지 말라, static은 공유할거니까
}
public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.nation); //객체만들기 전에 언제나 가능하다.
		//System.out.println(Person.name); //있지도 않은 변수이다. 
		
		Person p1 = new Person ();
		p1.name = "문성현";
		p1.age = 23;
		//p1.nation = "대한민국";
		System.out.println(p1.name + "은 나이가" +p1.age + " 이고 국적은" + p1.nation + "입니다");
		
		Person p2 = new Person ();
		p2.name = "구아바";
		p2.age = 33;
		//p2.nation = "대한민국";
		System.out.println(p2.name + "은 나이가" +p2.age + " 이고 국적은" + p2.nation + "입니다");
		
		/*p2.age nation = "미국";
		System.out.println(p1.name + "은 나이가" +p1.age + " 이고 국적은" + p1.nation + "입니다"); */
		
	}

}
