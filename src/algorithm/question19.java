package algorithm;

import java.util.Scanner;

public class question19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		do {
			System.out.print("a값 : ");
			a = sc.nextInt();
			System.out.print("b값 : ");
			b = sc.nextInt();
			
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하세요.");
			}
		}while(a >= b);
		int c = b - a;
		System.out.println("b-a는 " + c + "입니다.");
		
	}

}
