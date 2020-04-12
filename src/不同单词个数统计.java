import java.util.*;
public class 不同单词个数统计 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] str = x.split(" ");
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			if (!result.contains(str[i])) {
				result.add(str[i]);
			}
		}
		System.out.println(result.size());
	}

}
