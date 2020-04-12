import java.util.*;
public class ÏàÁÚ×ÖÄ¸ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		char a = '0';
		char b = x;
		char c = '0';
		if (x=='a') {
			a = (char)122;
			c = (char) (b+1);
		}else if (x=='A') {
			a = (char)90;
			c = (char) (b+1);
		}else if (x=='z') {
			a = (char)(b-1);
			c = (char)97;
		}else if (x=='Z') {
			a = (char)(b-1);
			c = (char)65;
		}else{
			a = (char)(b-1);
			c = (char)(b+1);
		}
		
		System.out.println(a+""+b+""+c);
	}

}
