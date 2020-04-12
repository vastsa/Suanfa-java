import java.util.*;
public class ×î³¤µ¥´Ê {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int max = 0,index = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length()>max) {
				max = str[i].length();
				index = i;
			}
		}
		System.out.println(str[index]);
	}

}
