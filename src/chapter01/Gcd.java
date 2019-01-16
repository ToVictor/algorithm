package chapter01;

/**
 * 欧几里得定理
 * @author scc
 *
 */
public class Gcd {
	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x%y);
	}
	
	public static void main(String[] args) {
//		System.out.println(gcd(1997,165));
		System.out.println(3.236/2);
	}
}
