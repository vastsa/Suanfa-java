import java.util.*;
public class shaixuanhaoma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //输入正整数N；
		int result=0;//结果，虽然不知道有么有用
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			mylist.add(i);
		}
		System.out.println(mylist);
		for (int i = 2; i < n-2; i+=2) {
			System.out.println(mylist);
			mylist.remove(i);
		}
		System.out.println(mylist.get(0));
	}

}
