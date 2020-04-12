import java.util.*;
public class diguidaozhi {

	/**
	 * @param args
	 * 试题 算法提高 递归倒置字符数组
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String str = sc.next();
		StringBuilder jieguo = new StringBuilder();
		System.out.println(result(str,jieguo));;
	}
	static StringBuilder result(String str,StringBuilder jieguo){
		if (str.length()==1) {
			jieguo.append(str);
			return jieguo;
		}else {
			jieguo.append(str.charAt(str.length()-1));
			result(str.substring(0,str.length()-1),jieguo);
			return jieguo;
		}
		
	}

}
