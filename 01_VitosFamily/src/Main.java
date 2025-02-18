import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;//Collections.sort()

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int relative = 0;

		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		while (num > 0) {
			relative = input.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			

			for (int i = 0; i < relative; i++) {
				list.add(input.nextInt());
			}

			Collections.sort(list);//Collections.sort()
			int n = list.size();
			int mid = list.get(n / 2);
			int sum = 0;
			for (int j = 0; j < n; j++) {//不需跳過中位數自己減自己
				sum += Math.abs(mid - list.get(j));//Math.abs()
			}
			System.out.println(sum);
			num--;
		}
		
		
	}

}
