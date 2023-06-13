package algorithm;

public class question12 {
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min3(15,10,8));
	}

}
