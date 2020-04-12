import java.util.*;

public class ×Ö·û´®±ä»» {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		switch (n) {
		case 1:
			System.out.println(str.toUpperCase());
			break;
		case 2:
			System.out.println(str.toLowerCase());
			break;
		case 3:
			StringBuilder result = new StringBuilder();
			result.append(str);
			System.out.println(result.reverse());
			break;
		case 4:
			char[] list = str.toCharArray();
			for (int i = 0; i < list.length; i++) {
				if (list[i] >= 'A' && list[i] <= 'Z') {
					list[i] -= 32;
				} else if (list[i] >= 'a' && list[i] <= 'z') {
					list[i] += 32;
				}
			}
			break;
		case 5:
			String t = "";
			str = str.toLowerCase();
			char[] list1 = str.toCharArray();
			for (int i = 0; i < list1.length - 1; i++) {
				if (i == 0) {
					t += list1[0];
				} else if (i != list1.length - 1) {
					if (list1[i] != list1[i - 1] + 1
							|| list1[i] != list1[i + 1] - 1) {
						t += list1[i];
					} else if (list1[list1.length - 1] != '-') {
						// System.out.println(t.charAt(t.length() - 1));
						if (t.charAt(t.length() - 1) != '-') {
							t += '-';
						} else {
							continue;
						}
					}
				} else {
					t += list1[i];
				}
			}
			System.out.println(t.trim());
			break;
		}
	}
}
