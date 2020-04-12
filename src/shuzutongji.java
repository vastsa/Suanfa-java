import java.util.*;
public class shuzutongji {

	/**
	 * @param args
	 * 试题 算法提高 数组统计
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[]list = new double[10];
		double sum =0;
		for (int i = 0; i < list.length; i++) {
			list[i]=sc.nextDouble();
			sum+=list[i];
		}
		sum/=10;
		System.out.println(result(list,sum));
	}
	public static int result(double[]list,double sum){
		int nums=0;
		for (int i = 0; i < list.length; i++) {
			if (list[i]>=sum) {
				nums++;
			}
		}
		
		return nums;
	}

}
