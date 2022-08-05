import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		try { 
		//mysql db용 jdbc driver 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = 
				DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
		System.out.println("mysql db 연결 성공");
		// sql은 연결해주고 나중에 연결끊어줘야 함
		//Statement 객체 resultSet 객체 생성 
		
		
		//db 연결 해제
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
