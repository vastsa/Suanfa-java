
public class szsum {

	/**
	 * @param args
	 * b 数组求和结果
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		//引用方法
		int b = sum(arr);
		//输出结果
		System.out.println(b);
	}
	public static int sum(int[] arr){
		int sum = 0; //求和
		//遍历数组求和
		for (int i : arr) {
			sum+=i;
		}
		//返回结果
		return sum;
	}

}
