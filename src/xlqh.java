import java.util.*;
public class xlqh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数N：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result +=i;
		}
		System.out.println("结果是：");
		System.out.println(result);
	}

}
