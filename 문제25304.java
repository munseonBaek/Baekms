package 반복문;

import java.util.Scanner;

public class 문제25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum=0;
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum = sum+a*b; 
		}
		if (x==sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
