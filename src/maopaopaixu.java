import java.util.*;
public class maopaopaixu {

	/**
	 * @param args
	 * 试题 算法提高 冒泡法排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list= new int [10];
		for (int i = 0; i < 10; i++) {
			list[i]=sc.nextInt();
		}
		int temp=0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10-i; j++) {
				if (list[j]>list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
	}

}
