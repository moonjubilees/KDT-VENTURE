package ch7;

class Employee{
	int id ;
	String name;
	double pay;
	static String role = "회사원"; //상속받은거보다 메인의 자기자신이 우선
	void work() {
		System.out.println(id + "사번의 사원명은" + name + "이고 급여는" + pay + "입니다.");
		
	}
	
}

class Manager extends Employee {
	static String role = "매니저";
	String jobOfManage;
	void getManage() {
		System.out.println(name + "매니저는" + jobOfManage+ "  입니다.");
	}
	
}


public class ManagerTest {

	public static void main(String[] args) {
		Manager m1 = new Manager ();
		m1.name = "김지원";
		m1.jobOfManage = "호텔매니저";
		m1.id = 100;
		m1.pay = 1234556.99;
		m1.work();
		m1.getManage ();
		System.out.println(m1.role);
		System.out.println(Manager.role);
		System.out.println(Employee.role);
	}

}
