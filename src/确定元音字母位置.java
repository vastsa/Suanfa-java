import java.util.*;
public class 确定元音字母位置 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String txt = scanner.next();
		boolean flag = true;
		for (int i = 0; i < txt.length(); i++) {
			char x = txt.charAt(i);
			if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
				System.out.println(i+1);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(0);
		}
	}

}
