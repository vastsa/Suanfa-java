import java.util.*;
public class panduanhuiwen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum=0,x=0,y=str.length()-1;
		boolean result =true;
		for (int i = 0; i < str.length(); i++) {
			char a =str.charAt(x);
			char b =str.charAt(y);
			if (a==b) {
				x++;
				y--;
			}else {
				result =false;
				break;
			}
		}
		if (result==false) {
			System.out.println("no!");
		}else {
			System.out.println("yes!");
		}
	}

}
