package p20230904;

import java.sql.*;
import java.util.*;

public class DB활용과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
		String id = "c##1901137";
		String pw = "p1901137";
		Scanner input = new Scanner(System.in);
		Connection con = null;
		int num;
		boolean choice = true;
//		System.out.println("1번 : 추가");
//		System.out.println("2번 : 전체 출력");
//		System.out.println("3번 : 부서번호를 주면 삭제");
//		System.out.println("4번 : 부서이름으로 검색");
//		System.out.print("1번 : 추가 \n2번 : 전체 출력 \n3번 : 부서번호를 주면 삭제 \n4번 : 부서이름으로 검색 \n번호 입력 : ");
//		num = input.nextInt();
		while (choice) {
			System.out.println("1번 : 추가");
			System.out.println("2번 : 전체 출력");
			System.out.println("3번 : 부서번호를 주면 삭제");
			System.out.println("4번 : 부서이름으로 검색");
			System.out.println("그 외 입력 시 종료");
			System.out.print("번호 입력 : ");
			num = input.nextInt();

			switch (num) {
			case 1:
				int newNo;
				String newDeptname;
				int deptFloor;
				System.out.print("deptNo 입력 : ");
				newNo = input.nextInt();
				System.out.print("deptName 입력 : ");
				newDeptname = input.next();
				System.out.print("Floor 입력 : ");
				deptFloor = input.nextInt();
				try {
					// 1. 드라이버 적재
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("드라이버 적재 성공");
					// 2. 연결
					con = DriverManager.getConnection(url, id, pw);
					System.out.println("연결 성공");
					Statement stmt = con.createStatement();
					System.out.println("Statement 객체 획득 성공");
					String s = "insert into DEPARTMENT(DEPTNO, DEPTNAME, FLOOR)" + "values (" + newNo + ", '"
							+ newDeptname + "', " + deptFloor + ")";
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

					ResultSet rs = s.executeQuery("select * from DEPARTMENT ORDER BY DEPTNO ASC");

					String deptName;
					int deptNo, Floor;
					while (rs.next()) {
						deptNo = rs.getInt("DEPTNO"); // rs.getString(1);
						deptName = rs.getString("DEPTNAME");
						Floor = rs.getInt("FLOOR");
						System.out.printf("DEPTNO:%d, DEPTNAME:%s, FLOOR:%d\n", deptNo, deptName, Floor);
					}
				} catch (SQLException e) {
					System.out.println("Statement 객체를 생성할 수 없습니다.");
					e.printStackTrace();

				}
				break;

			case 3:
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
					int delNum;
					System.out.print("삭제할 부서번호를 입력하세요 : ");
					delNum = input.nextInt();

					String deleteSQL = "DELETE FROM DEPARTMENT WHERE DEPTNO = " + delNum;
					int rowCount = s.executeUpdate(deleteSQL);

					if (rowCount > 0) {
						System.out.println("레코드 삭제 성공");
					} else {
						System.out.println("해당하는 부서가 없거나 삭제 실패");
					}
				} catch (SQLException e) {
					System.out.println("SQL 오류 발생: " + e.getMessage());
					e.printStackTrace();
				}
				break;

			case 4:
				try {
					String searchName;
					System.out.print("검색할 부서이름 입력: ");
					searchName = input.next();

					Statement stmt = con.createStatement();

					String query = "SELECT * FROM DEPARTMENT WHERE DEPTNAME = ?";
					PreparedStatement preparedStatement = con.prepareStatement(query);
					preparedStatement.setString(1, searchName);

					ResultSet rs = preparedStatement.executeQuery();

					while (rs.next()) {
						int deptNo = rs.getInt("DEPTNO");
						String deptName = rs.getString("DEPTNAME");
						int Floor = rs.getInt("FLOOR");
						System.out.printf("DEPTNO: %d, DEPTNAME: %s, FLOOR: %d%n", deptNo, deptName, Floor);
					}
				} catch (Exception e) {
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