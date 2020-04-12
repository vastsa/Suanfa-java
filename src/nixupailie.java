import java.util.*;
public class nixupailie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int input=1;
		do {
			input = sc.nextInt();
			list.add(input);
		} while (input!=0);
		list.remove(list.lastIndexOf(0));
		//ÄæÐò±éÀúÊä³ö
		for (int i = list.size()-1; i >=0 ; i--) {
			int x =list.get(i);
			System.out.print(x+" ");
		}
	}

}
