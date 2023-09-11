package p20230911;

import java.sql.*;
import java.util.*;

public class DB활용과제2 {

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
				int newempNo, empSalary;
				String newempName ,newempTitle;
				System.out.print("empNo 입력 : ");
				newempNo = input.nextInt();
				System.out.print("empName 입력 : ");
				newempName = input.next();
				System.out.print("Title 입력 : ");
				newempTitle = input.next();
				System.out.print("Salary 입력 : ");
				empSalary = input.nextInt();
				try {
					// 1. 드라이버 적재
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("드라이버 적재 성공");
					// 2. 연결
					con = DriverManager.getConnection(url, id, pw);
					System.out.println("연결 성공");
					Statement stmt = con.createStatement();
					System.out.println("Statement 객체 획득 성공");
					String s = "INSERT INTO EMP(EMPNO, EMPNAME, TITLE, SALARY)" + "values (" + newempNo + ", '"
							+ newempName + "', '" + newempTitle + "', " + empSalary + ")";

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

					ResultSet rs = s.executeQuery("select * from EMP");
					

					String empName , Title;
					int empNo, Salary;
					while (rs.next()) {
					    empNo = rs.getInt("EMPNO"); // rs.getString(1);
					    empName = rs.getString("EMPNAME");
					    Title = rs.getString("TITLE");
					    Salary = rs.getInt("SALARY");
					    System.out.printf("EMTNO:%d, EMPNAME:%s, TITLE:%s, SALARY:%d\n", empNo, empName, Title, Salary);
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