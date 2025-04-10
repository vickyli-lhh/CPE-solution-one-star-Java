import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int I = scanner.nextInt();
			if (I == 0) {
				break;
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (I > 0) {//改以二進位表示
				list.add(I % 2);
				I /= 2;
			}
			
			System.out.print("The parity of ");
			int count1 = 0;
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i));
				if(list.get(i) == 1) {
					count1++;
				}
			}
			System.out.printf(" is %d (mod 2).\n", count1);
			

		}
	}

}
