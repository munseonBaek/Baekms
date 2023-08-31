package p20230828;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
		String user = "c##1901137";
		String pw = "p1901137";
		// 1. JDBC 드라이버를 적재
		// 예외처리가 필요한 코드는 try블럭에 넣어야 한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
		
			// 2. 데이터베이스 연결
			Connection con = DriverManager.getConnection(url, user,pw);
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 적재 실패");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("드라이버 적재 성공");
			e.printStackTrace();
		} 
		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch(Exception e) {
//			System.out.println("예외처리부분이 실행되었습니다." + e);
//		}
		 
		
		// 3. SQL문장 작성 및 전송
		
		// 4. 결과집합 사용후 연결 해제
	}

}
