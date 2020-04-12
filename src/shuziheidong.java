import java.util.*;
public class shuziheidong {

	/**
	 * @param args
	 * 试题 算法提高 数字黑洞
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int result=0,num=0;
		//如果result不等于6174就不断循环
		while(result!=6174){
			//遍历字符串转为数组，方便排序
			int[] list= new int[4];
			for (int i = 0; i < list.length; i++) {
				list[i] = n.charAt(i)-'0';
			}
			//正序数组
			Arrays.sort(list);
			//一个为最小值，一个为最大值
			String zheng = "",ni="";
			//将数组内容循环遍历到两个值上面
			for (int i = 0,j=list.length-1; i < list.length; i++,j--) {
				zheng+=""+list[i];
				ni +=""+list[j];
			}
			//两值之差
			result = Integer.parseInt(ni)-Integer.parseInt(zheng);
			//不满足则转为字符串，方便下次循环
			n =result+"";
			//循环次数计数
			num++;
		}
		System.out.println(num);
	}
}
