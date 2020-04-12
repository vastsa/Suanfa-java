import java.util.*;
public class 全排列 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] list = sc.next().toCharArray();
		boolean[] flag = new boolean[list.length];
		for (int i = 0; i < flag.length; i++) {
			flag[i]=false;
		}
		StringBuilder temp = new StringBuilder();
		List<StringBuilder> result = new ArrayList<StringBuilder>();
		qpl(list,flag,temp,result);
	}
	static void qpl(char[] list,boolean[] flag,StringBuilder temp,List<StringBuilder> result){
		//截止条件
		if (temp.length()==list.length) {
			if (!result.contains(temp)) {
				System.out.println(temp);
				result.add(temp);
				return;
			}
		}
		for (int i = 0; i < list.length; i++) {
			char c = list[i];
			if (!flag[i]) {
				temp = temp.append(c);
				flag[i] = true;
				qpl(list,flag,temp,result);
				flag[i] = false;
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}
}
