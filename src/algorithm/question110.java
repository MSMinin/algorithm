package algorithm;

import java.util.Scanner;

public class question110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count= 0;
		
		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
			if(n <= 0) {
				System.out.println("n은 양의 정수여야합니다.");
			}
		}while(n <= 0);
		System.out.println(n);
		
		while(n > 0) {
			n = n / 10;
			count++;		
		}		
		System.out.println("n은 " + count + "자리 수입니다.");
	}
}
