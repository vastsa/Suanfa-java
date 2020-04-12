import java.util.*;
public class jiheyunsuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//按照条件获取输入的值
		int n = sc.nextInt();
		int[] list1 = new int[n];
		for (int i = 0; i < list1.length; i++) {
			list1[i]= sc.nextInt();
		}
		int m = sc.nextInt();
		int[] list2 = new int[m];
		for (int i = 0; i < list2.length; i++) {
			list2[i]= sc.nextInt();
		}
		//创建三个列表用于装结果
		ArrayList<Integer> jiaoji =new ArrayList<Integer>();
		ArrayList<Integer> bingji =new ArrayList<Integer>();
		ArrayList<Integer> buji =new ArrayList<Integer>();
		//第一层循环，遍历list1
		for (int i = 0; i < list1.length; i++) {
			//布尔型的bu表示，默认为这个数是list2在list1中的余集
			boolean bu = true;
			//如果bingji中不包含list1[i]的值，就加到并集中去
			if (!bingji.contains(list1[i])) {
				bingji.add(list1[i]);
			}
			for (int j = 0; j < list2.length; j++) {
				//如果bingji中不包含list2[i]的值，就加到并集中去
				if (!bingji.contains(list2[j])) {
					bingji.add(list2[j]);
				}
				//判断交集
				if (list1[i]==list2[j]&&!jiaoji.contains(list1)) {
						jiaoji.add(list1[i]);
				}
				//判断余集
				if (list1[i]==list2[j]) {
					bu=false;
				}
			}
			//如果补集中不存在则加入列表
			if (bu&&!buji.contains(list1[i])) {
				buji.add(list1[i]);
			}
		}
		//列表排序
		Collections.sort(jiaoji);
		Collections.sort(bingji);
		Collections.sort(buji);
		//遍历输出
		for (int j = 0; j < jiaoji.size(); j++) {
			System.out.print(jiaoji.get(j)+" ");
		}
		if (jiaoji.size()!=0) {
			System.out.println();
		}
		for (int j = 0; j < bingji.size(); j++) {
			System.out.print(bingji.get(j)+" ");
		}
		if (bingji.size()!=0) {
			System.out.println();
		}
		for (int j = 0; j < buji.size(); j++) {
			System.out.print(buji.get(j)+" ");
		}
		
	}
}
