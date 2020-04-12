import java.util.*;
public class wucifangshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <1000000; i++) {
			String temp = ""+i;
			int temp2=0;
			for (int j = 0; j < temp.length(); j++) {
				int x = temp.charAt(j)-'0';
				temp2+=x*x*x*x*x;
			}
			if (temp2==i) {
				System.out.println(i);
			}
		}
	}

}
