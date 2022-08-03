import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
			// mysql db용 jdbc driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// db 연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("mysql db 연결 성공");
			// sql은 연결해주고 나중에 연결끊어줘야 함
			// Statement 객체 resultSet 객체 생성

			// emp_copy 테이블 레코드 저장
			// employee_id : 자동증가 first)name, salary, hire_date:current_date

			// String insertSQL = "insert into emp_copy (select employee_id, first_name,
			// salary, hire_date from employees)";

			// 명령행 매개변수
			// RUN CONFIGURATION - ARGUMENTS - PROGRAM ARGUMENTS - 이사원 20000 - args[0] args
			// [1] <- 공백중심으로 2개
			String insertSQL = "insert into emp_copy values (null,'" + args[0] + "', "+  args[1] + ", current_date)";
			// sql 저장 - 전송 - 실행결과 저장
			System.out.println(insertSQL);
			Statement st = conn.createStatement();
			int insertROW = st.executeUpdate(insertSQL);
			System.out.println(insertROW + " 개의 행 삽입 완료");

			// db 연결 해제
			conn.close();
			System.out.println("mysql db 연결 해제 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		} catch (SQLException e) {
			System.out.println("db접속오류이거나 sql 문장오류");
			e.printStackTrace();
		}
	}

}
