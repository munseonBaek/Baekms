package 반복문;

import java.util.Scanner;

public class 문제25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		if (a%4==0) {
			for(int i=0; i<a/4; i++) {
				System.out.print("long ");
			} System.out.print("int");
		} 
	}

}
