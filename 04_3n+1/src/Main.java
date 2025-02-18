import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static int process(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(n);
		while (n != 1) {
			if (n % 2 == 1) {
				n = 3 * n + 1;
			} else if (n % 2 == 0) {
				n = n / 2;
			}
			list.add(n);
		}
		return list.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.print(a + " " + b + " ");
			if (a != b) {

				if (a > b) {
					int temp = a;
					a = b;
					b = temp;
				}

				ArrayList<Integer> countList = new ArrayList<Integer>();
				for (int i = a; i <= b; i++) {
					countList.add(process(i));
				}
				System.out.println(Collections.max(countList));

			} else if (a == b) {
				System.out.println(process(a));
			}
		}
		input.close();
	}

}
