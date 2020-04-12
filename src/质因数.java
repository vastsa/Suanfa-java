import java.util.*;

public class ÖÊÒòÊý {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		StringBuffer x= new StringBuffer();
		x.append(n+"=");
		while (n > 1) {
			if (n%i==0) {
				n/=i;
				x.append(i+"*");
			}else {
				i++;
			}
		}
		x.deleteCharAt(x.length()-1);
		System.out.println(x);
	}

}
