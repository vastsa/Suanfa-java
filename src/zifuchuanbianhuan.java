import java.util.*;
public class zifuchuanbianhuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		String str = sc.next();
		String result="";
		switch (key) {
		case 1:
			result = sfone(str);
			break;
		case 2:
			result = sftwo(str);
			break;
		case 3:
			System.out.println(sfthree(str));
			break;
		case 5:
			result = sfour(str);
			break;
		case 4:
			result = sffive(str);
			break;
		}
		System.out.println(result);
	}
	
	private static String sffive(String str) {
		// TODO Auto-generated method stub
		str.toLowerCase();
		return str;
	}

	private static String sfour(String str) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i);
			if (n>=65&&n<=90) {
				n+=32;
			}else if (n>=97&&n<=122) {
				n-=32;
			}
			result.append((char)n);
		}
		str = result.substring(0);
		return str;
	}

	private static StringBuilder sfthree(String str) {
		// TODO Auto-generated method stub
		StringBuilder str1 = new StringBuilder();
		for (int i = str1.length(); i >=0; i--) {
			char x = str1.charAt(i);
			str1.append(x);
		}
		return str1;
	}

	private static String sftwo(String str) {
		// TODO Auto-generated method stub
		str= str.toLowerCase();
		return str;
	}

	private static String sfone(String str) {
		// TODO Auto-generated method stub
		str = str.toUpperCase();
		return str;
	}
	

}
