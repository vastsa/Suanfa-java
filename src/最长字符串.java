import java.util.Scanner;;
public class ×î³¤×Ö·û´® {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] list = new String[5];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.next();
		}
		String max ="";
		for (int i = 0; i < list.length; i++) {
			if (list[i].length()>=max.length()) {
				max = list[i];
			}
		}
		System.out.println(max);
	}

}
