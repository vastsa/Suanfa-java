import java.util.*;
public class P0404 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.length()==1) {
			System.out.println(str);
		}else {
			while(str.length()>1){
				int temp = 1;
				for (int i = 0; i < str.length(); i++) {
					int x =(int)str.charAt(i)-'0';
					if (x!=0) {
						temp*=x;
					}
				}
				str = ""+temp;
			}
			System.out.println(str);
		}
		
	}

}
