package 조건문;

import java.util.Scanner;

public class 문제2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();

		if (m + t >= 60) {
			h = h + (m + t) / 60;
			m = (m + t) % 60;
		} else {
			m = m + t;
		}
		if (h > 23) {
			h = h % 24;

		}

		System.out.println(h + " " + m);
	}

}
