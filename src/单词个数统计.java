import java.util.*;
public class 单词个数统计 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int result =1 ;
		for (int i = 0; i < a.length(); i++) {
			int x = (int)a.charAt(i);
			if (x==32) {
				result++;
			}
		}
		System.out.println(result);
	}

}
