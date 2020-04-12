import java.util.*;
public class 学生成绩统计 {

	/**
	 * @param args
	 */
	public static class student{
		public String name;
		public double grade;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		student[] stu = new student[n];
		student max = new student();
		student min = new student();
		min.grade=100;
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new student();
			stu[i].name = sc.next();
			double id = sc.nextDouble();
			double eng = sc.nextDouble();
			double math = sc.nextDouble();
			double c = sc.nextDouble();
			stu[i].grade = (eng+math+c)/3;
			if (stu[i].grade>max.grade) {
				max = stu[i];
			}
			if (stu[i].grade<min.grade) {
				min = stu[i];
			}
		}
		System.out.println(max.name);
		System.out.println(min.name);
	}

}
