package ch6;

public class EmplyoeeTest {

	public static void main(String[] args) {
		// 회사원이 가져야할 4가지 특성 파악 - 클래스 정의 완료
		//3. 객체생성 2개
		Employee e1 = new Employee();
		e1.id = 1000;
		e1.name = "김사원";
		e1.dept = "IT";
		e1.pay = 123456.00;
		System.out.println(" 사번= " + e1.id + " 이름 " + e1.name + " 부서= " + e1.dept + " 급여= " + e1.pay);
		Employee e2 = new Employee();
		e2.id = 2000;
		e2.name = "박대리";
		e2.dept = "교육부";
		e2.pay = 223456.00;
		System.out.println(" 사번= " + e2.id + " 이름 " + e2.name + " 부서= " + e2.dept + " 급여= " + e2.pay);
	}

}
