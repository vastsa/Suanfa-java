import java.util.*;
public class 使用指针逆序输出 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char[] list = sc.next().toCharArray();
		for (int i = list.length-1; i >=0 ; i--) {
			System.out.print(list[i]);
		}
	}

}
