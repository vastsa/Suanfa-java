import java.util.*;	
public class æ∞µ„‰Ø¿¿ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list,Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
