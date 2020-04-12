import java.util.*;
public class rili {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar rili = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		rili.set(year,month);
		int startDay = rili.get(Calendar.DAY_OF_WEEK); //求本周第一天是星期几
        int count = startDay - 1; //第一周的初始计数
        int maxDay = maxDayInMonth(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        fillSpace(startDay);
        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d%s", i, " "); //使用printf函数进行格式对齐
            count++;
            if (count >= 7) { //每输出7天换一次行
                count = 0;
                System.out.print('\n');
            }
	}

}

	private static void fillSpace(int startDay) {
		// TODO Auto-generated method stub
		for (int i = 1; i < startDay; i++) {
            System.out.printf("%4s", " ");
        }
	}

	private static int maxDayInMonth(int year, int month) {
		// TODO Auto-generated method stub
		int max = 30;
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) max = 31;
        else if (month == 2) max = 28;
        else if (month == 2 & (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) max = 29;
        return max;
	}

}