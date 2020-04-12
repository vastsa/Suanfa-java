import java.util.*;
public class qianzhuibiaodashi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ysf = sc.next().charAt(0);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result=0;
		switch (ysf) {
		case '+':
			result = add(a,b);
			break;
		case '-':
			result = jian(a,b);
			break;
		case '*':
			result = cheng(a,b);
			break;
		case '/':
			result = chu(a,b);
			break;
		}
		System.out.println(result);
	}

	private static int add(int a,int b) {
		return a+b;
		// TODO Auto-generated method stub
		
	}
	private static int jian(int a,int b) {
		return a-b;
		// TODO Auto-generated method stub
		
	}
	private static int cheng(int a,int b) {
		return a*b;
		// TODO Auto-generated method stub
		
	}
	private static int chu(int a,int b) {
		return a/b;
		// TODO Auto-generated method stub
		
	}

}
