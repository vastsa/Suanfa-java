import java.util.*;
public class 最大值与最小值的计算 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1)+" "+list.get(0));
	}

}
