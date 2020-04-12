import java.util.*;

public class 小X的购物计划 {

	/**
	 * @param args
	 */
	public static class shop{
		public int price;  //价格
		public int importance;  //重要度
		public int quantity; //库存
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int n = sc.nextInt();
		shop[] list = new shop[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = new shop();
			list[i].price = sc.nextInt();
			list[i].importance = sc.nextInt();
			int quantity = sc.nextInt();
			if (quantity==-1) {
				list[i].quantity = 1000;
			}else {
				list[i].quantity =quantity;
			}
		}
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-i-1; j++) {
				if (list[j].importance<list[j+1].importance) {
					shop temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		int result = 0;
		for (shop shop : list) {
			while(shop.quantity>0&&money>=shop.price){
				shop.quantity--;
				result+=shop.importance;
				money -= shop.price;
			}
		}
		System.out.println(result);
	}

}
