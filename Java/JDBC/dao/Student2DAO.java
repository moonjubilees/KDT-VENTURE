package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Student2DTO;

public class Student2DAO {
//students2 테이블 crud 기능 메소드로 구현할 예정
	//데이터 저장 메소드
	public int insertStudent2(Student2DTO dto){
		Connection conn = null; 
		int rows = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			
			//명령행 매개변수 5개 입력 - 이자바 java@b.com 01022246788 법학 us
			String insertSQL = "insert into students2 values(null, ?, ?, ?, ?, default, ?)";
			
			/* update 테이블명 set 변경컬럼명 = ? where 컬럼명 ? limit ? */
			/* delete from 테이블명 where 컬럼명 > ? and 컬럼명 < ? */
			
			PreparedStatement pt = conn.prepareStatement(insertSQL); //db 전송 구문분석 컴파일 - 저장
			//sql 입력파라미터 값 설정 
			pt.setString(1, dto.getName()); //1번은 첫번째 물음표
			 pt.setString(2, dto.getEmail()); //dto객체 major 변수 가져오라
			 pt.setString(3, dto.getPhone()); //에러포인트가 is not visible -> 2DAO에서 접근할 수 없는 형태 -> 다른 패키지에서 쓰려면 public 으로 해줘야 함 .
			 pt.setString(4, dto.getMajor()); //-> 하지만 모든 변수마다 해주는게 아니라 public 으로 getter/ setter 을 해준다 
			 pt.setDouble(5, dto.getScore()); 
			
			rows = pt.executeUpdate();  //<- 여기서 실행할거야. sql은 미리 지정됐음. 
			System.out.println(rows + " 개의 행 삽입 완료");
			//close 하기 전에 예외가 발생했다면 중단되고 catch 블록으로 이동  -> close가 실행되지 않음. 
			conn.close ();//db 연결 해제하는 부분 (파일; close, 소켓통신 ;close)
			}
		catch(ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		}
			catch(SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
			}
			finally {
				try {
				conn.close(); //close가 예외처리한다라고 해줘야함. 
				}catch (SQLException e) {}
			}
			return rows ; //리턴타입 로우로 했으니까
		
		
	}//insertStudent2 method
	public Student2DTO[] selectStudent2() {
		//student2 테이블의 모든 데이터 조회 구현 
	
	Connection conn = null; 
	Student2DTO[] ar = new Student2DTO[10];
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
		
		//명령행 매개변수 5개 입력 - 이자바 java@b.com 01022246788 법학 us
		String selectSQL = "select id, name, major from students2";
		
		/* update 테이블명 set 변경컬럼명 = ? where 컬럼명 ? limit ? */
		/* delete from 테이블명 where 컬럼명 > ? and 컬럼명 < ? */
		
		PreparedStatement pt = conn.prepareStatement(selectSQL); //db 전송 구문분석 컴파일 - 저장
		//sql 입력파라미터 값 설정 
		
		ResultSet rs = pt.executeQuery();  //<- 여기서 실행할거야. sql은 미리 지정됐음. 
		int index = 0;
		while(rs.next()) {
			Student2DTO dto = new Student2DTO(rs.getInt("id"),rs.getString("name"), rs.getString("major"));
					
					
		ar[index++] = dto ;
			// index ++; 위에 index++이랑 똑같애 
		}
		
		rs.close();
		pt.close();
		
		
		
		
		conn.close ();//db 연결 해제하는 부분 (파일; close, 소켓통신 ;close)
		}
	catch(ClassNotFoundException e) {
		System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
	}
		catch(SQLException e) {
			System.out.println("db접속오류이거나 sql문장오류");
			e.printStackTrace();
		}
		finally {
			try {
			conn.close(); //close가 예외처리한다라고 해줘야함. 
			}catch (SQLException e) {}
		}
		return ar ; //리턴타입 로우로 했으니까
	
	/* Student2DTO[] selectStudent2(){
		//STUDNETS2 테이블 모든 데이터 구현 
	}  */
	}
	
	public void updateStudent2(String old, String new_word) { //old는 it라는 글자만 리턴해줌 
		Connection conn = null; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			
			/* String updateSQL = "update students2 set major = ?  where major like? ";
			
			// limit는 이클립스에서 안필요 
			/* update 테이블명 set 변경컬럼명 = ? where 컬럼명 ? limit ? */
			/* delete from 테이블명 where 컬럼명 > ? and 컬럼명 < ? */
			
			//PreparedStatement pt = conn.prepareStatement(updateSQL); //db 전송 구문분석 컴파일 - 저장
		
			/* sql 입력파라미터 값 설정 
			 pt.setString(1,"아이티"); //1번은 첫번째 물음표
			 pt.setString(2, "%" + old + "%"); //dto객체 major 변수 가져오라 */
			 
			 String updateSQL = 
					 "update students2 set major = insert(@major , instr(@major ,?), char_length(?), ? ) "
					 + "where major like ?" ;
			 
			 PreparedStatement pt = conn.prepareStatement(updateSQL);
			 pt.setString(1, old);
			 pt.setString(2, old);
			 pt.setString(3, new_word);
			 pt.setString(4, "%" + old + "%");


		
			 pt.executeUpdate();  //<- 여기서 실행할거야. sql은 미리 지정됐음. 
				pt.close();
			//System.out.println(rows + " 개의 행 삽입 완료"); <- update에서 필요없음 
			//close 하기 전에 예외가 발생했다면 중단되고 catch 블록으로 이동  -> close가 실행되지 않음. 
			conn.close ();//db 연결 해제하는 부분 (파일; close, 소켓통신 ;close)
			
			}
		catch(ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		}
			catch(SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
			}
			finally {
				try {
			
				conn.close(); //close가 예외처리한다라고 해줘야함. 
				}catch (SQLException e) {}
			}
	}
		
	public void deleteStudent2(int id) { //old는 it라는 글자만 리턴해줌 
		Connection conn = null; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			
			/* String updateSQL = "update students2 set major = ?  where major like? ";
			
			// limit는 이클립스에서 안필요 
			/* update 테이블명 set 변경컬럼명 = ? where 컬럼명 ? limit ? */
			/* delete from 테이블명 where 컬럼명 > ? and 컬럼명 < ? */
			
			//PreparedStatement pt = conn.prepareStatement(updateSQL); //db 전송 구문분석 컴파일 - 저장
		
			/* sql 입력파라미터 값 설정 
			 pt.setString(1,"아이티"); //1번은 첫번째 물음표
			 pt.setString(2, "%" + old + "%"); //dto객체 major 변수 가져오라 */
			 
			 String deleteSQL = 
					 "delete from students2 where id = ?";
			 
			 PreparedStatement pt = conn.prepareStatement(deleteSQL);
			 pt.setInt(1, id);
			 pt.executeUpdate();  //<- 여기서 실행할거야. sql은 미리 지정됐음. 
				pt.close();
			//System.out.println(rows + " 개의 행 삽입 완료"); <- update에서 필요없음 
			//close 하기 전에 예외가 발생했다면 중단되고 catch 블록으로 이동  -> close가 실행되지 않음. 
			conn.close ();//db 연결 해제하는 부분 (파일; close, 소켓통신 ;close)
			
			}
		catch(ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		}
			catch(SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
			}
			finally {
				try {
			
				conn.close(); //close가 예외처리한다라고 해줘야함. 
				}catch (SQLException e) {}
			}
	}//delete end
		
}//class end
