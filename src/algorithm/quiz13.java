package algorithm;

public class quiz13 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		if(min > d) {
			min = d;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min4(50,20,15,60));
	}

}
