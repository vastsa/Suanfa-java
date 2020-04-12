import java.util.*;
public class qiuzhishu {

	/**
	 * @param args
	 * 试题 算法训练 5-2求指数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//第一个数N；
		int m = sc.nextInt();//第二个数M，阶数；
		int js=1,temp=n;//准备一个用来计数，一个做为结果输出
		//循环，从1开始到M；
		for (int i = 0; i < m; i++) {
			//循环，一个一个盘；
			if (js<=5) {
				js++;
			}else {
				js=0;
				System.out.println();
			}
			System.out.print("            ");
			System.out.print(n);
			n*=temp;
		}
	}

}
