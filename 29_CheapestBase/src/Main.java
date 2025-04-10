import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int tempX = X;// 保留起來免得X值變了
		while (X > 0) {// 幾組測資
			System.out.printf("case %d:\n", tempX - X + 1);
			ArrayList<Integer> inkList = new ArrayList<Integer>();
			for (int i = 0; i < 36; i++) {
				inkList.add(scanner.nextInt());
			}

			int n = scanner.nextInt();

			while (n > 0) {// 幾筆數據

				int min = Integer.MAX_VALUE;// 每次要歸//min 的初始值設為 0 會導致錯誤
				ArrayList<Integer> sumList = new ArrayList<Integer>();
				int Y = scanner.nextInt();
				int tempY = Y;// 保留起來免得Y值變了
				for (int i = 2; i <= 36; i++) {// 從二進位開始
					Y = tempY;
					int sum = 0;// 每次要歸0
					while (Y > 0) {
						int a = Y % i;
						sum += inkList.get(a);
						Y /= i;
					}
					sumList.add(sum);
					if (sum < min) {
						min = sum;
					}
				}
				ArrayList<Integer> sameList = new ArrayList<Integer>();
				for (int l = 0; l < sumList.size(); l++) {
					if (sumList.get(l) == min) {
						sameList.add(l + 2);// sumList是從i = 2開始的(即二進位)(: l = 0代表二進位)
					}
				}
				System.out.printf("Cheapest base(s) for number %d: ", tempY);
				for (int m = 0; m < sameList.size(); m++) {
					System.out.printf("%s ", sameList.get(m));

				}
				System.out.println();
				n--;
			}
			
			if (X > 1) {
				System.out.println();
			}
			X--;
		}

	}

}
