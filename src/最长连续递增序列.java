import java.util.*;

public class 最长连续递增序列 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 1, 9, 2, 5, 7, 3, 4, 6, 8, 0 };
		// int[] list = { 1, 23, 44, 55, 66 };
		getLargestLen(list);
	}

	public static void getLargestLen(int[] arr) {
		int nums = 0, tempnums = 0;
		List<Integer> temp = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				temp.add(arr[i]);
				tempnums++;
			}
			if (arr[i+1]>arr[i]&&arr[i+2]<arr[i+1]) {
				temp.add(arr[i+1]);
			}
			if (arr[i + 1] < arr[i] || i == arr.length - 2) {
				if (tempnums > nums) {
					nums = tempnums;
					result.clear();
					for (Integer integer : temp) {
						result.add(integer);
					}
					tempnums = 0;
					temp.clear();
				}
			}

		}
		System.out.println(result);
	}
}
