package p20230911;

import java.sql.*;
import java.util.*;

public class DB활용과제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
		String id = "c##1901137";
		String pw = "p1901137";
		Scanner input = new Scanner(System.in);
		Connection con = null;
		int num;
		boolean choice = true;

		while (choice) {
			System.out.println("1번 : 추가");
			System.out.println("2번 : 전체 출력");
			System.out.println("그 외 입력 시 종료");
			System.out.print("번호 입력 : ");
			num = input.nextInt();

			switch (num) {
			case 1:
				int  userNo, userMarry;
				String userID, userName ,userEmail;
				System.out.print("userID 입력 : ");
				userID = input.next();
				System.out.print("userName 입력 : ");
				userName = input.next();
				System.out.print("userNo 입력 : ");
				userNo = input.nextInt();
				System.out.print("userEmail 입력 : ");
				userEmail = input.next();
				System.out.print("userMarry 입력 : ");
				userMarry = input.nextInt();
				try {
					// 1. 드라이버 적재
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("드라이버 적재 성공");
					// 2. 연결
					con = DriverManager.getConnection(url, id, pw);
					System.out.println("연결 성공");
					Statement stmt = con.createStatement();
					System.out.println("Statement 객체 획득 성공");
					String s = "INSERT INTO 회원(회원아이디, 회원이름, 회원번호, 회원이메일, 회원혼인여부)" + "values ('" + userID + "', '"
							+ userName + "', " + userNo + ", '" + userEmail + "', "+ userMarry +")";

					System.out.println(s);
					int n = stmt.executeUpdate(s);
					if (n == 1) {
						System.out.println("레코드 추가 성공");
					} else {
						System.out.println("레코드 추가 실패");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try {
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					System.out.println("드라이버 적재 성공");

					con = DriverManager.getConnection(url, id, pw);
					System.out.println("연결 성공");

					Statement s = con.createStatement();

					ResultSet rs = s.executeQuery("select * from 회원 ORDER BY 회원아이디 ASC");
					

					int  userNo1, userMarry1;
					String userID1, userName1 ,userEmail1;
					while (rs.next()) {
						userID1 = rs.getString("회원아이디");
						userName1 = rs.getString("회원이름");
						userNo1 = rs.getInt("회원번호");
						userEmail1 = rs.getString("회원이메일");
						userMarry1 = rs.getInt("회원혼인여부");
					    System.out.printf("회원아이디:%s, 회원이름:%s, 회원번호:%d, 회원이메일:%s, 회원혼인여부:%d\n", userID1, userName1, userNo1, userEmail1, userMarry1);
					}

				} catch (SQLException e) {
					System.out.println("Statement 객체를 생성할 수 없습니다.");
					e.printStackTrace();

				}
				break;
			default:
				System.out.println("해당하는 번호가 없습니다. 종료합니다.");
				choice = false;
				break;
			}
		}
	}

}