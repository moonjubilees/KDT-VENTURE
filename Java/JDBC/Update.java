import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = 
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
		System.out.println("mysql db 연결 성공");
		
		//명령행 매개변수 이용 이사원 2 입력하면 emp_copy 테이블에서 이사원의 급여 2배로 변경
		//update 테이블명 set 변경컬럼명 = 변경값 where 변경레코드 조건식 */
		String updateSQL = "update emp_copy set values = salary*" + args[1] + " where first_name='" + args[0] + "'" ;
		
		//jdbc에서 sql 정의할 때는 세미콜론 하면 안됨 
		/* delete from emp_copy where first_name = '%사원%' ; */
		//drop table ...jdbc program (insert delete upate select) 
		
		Statement st = conn.createStatement();
		int updateROW = st.executeUpdate(updateSQL);
		System.out.println(updateROW + " 개의 행 수정완료");
		
		//st.close();
		conn.close();
		System.out.println("mysql db 연결 해제 성공");
		} catch(ClassNotFoundException e ) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		}
		catch(SQLException e) {
			System.out.println("db접속오류");
		}
	}

}
