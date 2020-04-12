import java.util.*;

public class Ë«Ê®Ò»ÇÀ¹º {

	public static class goods {
		public int num;
		public double price;
		public int off;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		int Nums = input.nextInt();
		goods[] lists = new goods[Nums];
		for (int i = 0; i < lists.length; i++) {
			lists[i] = new goods();
			lists[i].price = input.nextDouble();
			lists[i].off = input.nextInt();
			lists[i].num = i + 1;
		}
		for (int i = 0; i < lists.length; i++) {
			for (int j = i; j < lists.length; j++) {
				if (lists[i].off * lists[i].price < lists[j].off* lists[j].price) {
					goods temp = lists[j];
					lists[j] = lists[i];
					lists[i] = temp;
				} else if (lists[i].off * lists[i].price == lists[j].off* lists[j].price) {
					if (lists[i].price > lists[j].price) {
						goods temp = lists[j];
						lists[j] = lists[i];
						lists[i] = temp;
					} else if (lists[i].price == lists[j].price) {
						if (lists[i].num > lists[j].num) {
							goods temp = lists[j];
							lists[j] = lists[i];
							lists[i] = temp;
						}
					}
				}
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		int success = 0;
		for (goods goods : lists) {
			double price = goods.price - goods.off * 0.5 * goods.price;
			if (price <= money) {
				money -= price;
				success++;
				result.add(goods.num);
			}
		}
		if (success == 0) {
			System.out.println("0");
		} else {
			Collections.sort(result);
			for (Integer integer : result) {
				System.out.print(integer + " ");
			}
		}

	}
}
