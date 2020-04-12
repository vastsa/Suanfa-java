import java.util.*;
public class zifuchuanshurushuchu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input a string:");
		double num = GetReal();
		String str = GetString();
		System.out.println(num+"\n"+str);
	}

	private static String GetString() {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		// TODO Auto-generated method stub
		return str;
	}

	private static double GetReal() {
		System.out.println("please input a number:");
		Scanner sc =new Scanner(System.in);
		double num = sc.nextDouble();
		// TODO Auto-generated method stub
		return num;
	}

}
