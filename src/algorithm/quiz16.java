package algorithm;

import java.util.Scanner;

public class quiz16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <=n) {
			sum += 1;
			i ++;
		}
		System.out.println("1부터" + n + "까지의 합은 " + sum +"입니다.");
		System.out.println("while문을 빠져나올때의 i의 값은 n + 1이므로 " + i + "입니다.");
	}

}
