import java.util.*;
public class days {

	/**
	 * @param args
	 * 试题 算法训练 天数计算
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();  //输入年份
		int month = sc.nextInt(); //输入月份
		int days = sc.nextInt();//输入天，已算到结果
		//从一月开始循环,到月为止
		for (int i = 1; i < month; i++) {
			//判断月份天数
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days+=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days+=30;
				break;
			case 2:
				if (year%4==0&&year%100!=0||year%400==0) {
					days+=29;
				}else {
					days+=28;
				}
				break;
			}
		}
		System.out.println(days);
	}

}
