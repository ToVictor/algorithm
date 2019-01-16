package chapter01.exercises;

/**
 * 将一个正整数N用二进制表示，并转换成String类型的值
 * @author scc
 *
 */
public class Exercises1_1_9 {
	public static void main(String[] args) {
		int N = 99;
		System.out.println(N + "的二进制值为：" + f1(N));
		System.out.println(N + "的二进制值为：" + f2(N));
		System.out.println(N + "的二进制值为：" + Integer.toBinaryString(N));
	}
	
	public static String f1(int N) {
		String s = "";
		int remainder,temp=N;
		while(temp > 0) {
			remainder = temp % 2;
			s = remainder + s;
			temp = temp / 2;
		}
		return s;
	}
	
	public static String f2(int N) {
		String s = "";
		for(int i=N; i>0; i/=2) {
			s = (i % 2) + s;
		}
		return s;
	}
}
