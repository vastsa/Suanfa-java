import java.util.*;
public class 成绩的等级输出 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		if (n>=90&&n<=100) {
			System.out.println("A");
		}else if (n>=80&&n<=89) {
			System.out.println("B");
		}else if (n>=70&&n<=79) {
			System.out.println("C");
		}else if (n>=60&&n<=69) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}

}
