package ch7;

class NoSingleton {
	NoSingleton (){
		System.out.println("Singleton 생성자 호출");
		
	}
}
class Singleton {
	static private Singleton me = new Singleton(); //1번 불러서 늘 공유해서 써 라는 static, 
	private Singleton(){
		System.out.println("Singleton 생성자 호출");
	}
	public static Singleton getInstance() {
		return me ;
	}
	
}

class FinalClass{
	final double pi; //final이 빠지면 자동0값 출력. 
	FinalClass (){
		pi = 3.14;
	}
}
public class SingletonTest {
	

	public static void main(String[] args) {
		NoSingleton n1 = new NoSingleton();
		NoSingleton n2 = new NoSingleton();
		NoSingleton n3 = new NoSingleton();
		//Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		FinalClass fc = new FinalClass()	;
		System.out.println(fc.pi);
	}
	
}
