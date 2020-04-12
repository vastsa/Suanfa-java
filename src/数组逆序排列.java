import java.util.*;
public class Êı×éÄæĞòÅÅÁĞ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int x = sc.nextInt();
		while(x!=0){
			list.add(x);
			x = sc.nextInt();
		}
		for (int i = list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}

}
