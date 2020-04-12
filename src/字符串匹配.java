import java.util.*;
public class ×Ö·û´®Æ¥Åä {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String def = sc.next();
		int tj = sc.nextInt();
		int n = sc.nextInt();
		String[] strs = new String[n];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = sc.next();
		}
		if (tj==0) {
			wsdxs(def,strs);
		}else {
			dxs(def,strs);
		}
	}
	public static void dxs(String a,String[] b){
		for (int i = 0; i < b.length; i++) {
			if (b[i].contains(a)) {
				System.out.println(b[i]);
			}
		}
	}
	public static void wsdxs(String a,String[] b){
		a = a.toLowerCase();
		for (int i = 0; i < b.length; i++) {
			if (b[i].toLowerCase().contains(a)) {
				System.out.println(b[i]);
			}
		}
	}
}
