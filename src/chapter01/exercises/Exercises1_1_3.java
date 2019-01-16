package chapter01.exercises;

/**
 * 从命令行得到3个整数参数，如果它们都相等则打印 equal，否则打印 not equal
 * @author scc
 *
 */
public class Exercises1_1_3 {
	public static void main(String[] args) {
		f1(args);
	}
	
	public static void f1(String[] args) {
		int start = Integer.parseInt(args[0]);
		for(int i=1; i<args.length; i++) {
			if(Integer.parseInt(args[i]) != start) {
				System.out.println("not equal");
				return;
			}
		}
		System.out.println("equal");
	}
	
	public static void f2(String[] args) {
		
	}
}
