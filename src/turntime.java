import java.util.*;
public class turntime {

	/**
	 * @param args
	 * 试题 算法提高 时间转换
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int hour=0;
		int day=0;
		while (min>=60){
			min-=60;
			hour++;
		}while(hour>=24){
			hour-=24;
			day++;
		}
		System.out.println(day+" "+hour+" "+min+" ");
	}

}
