import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			int M = scanner.nextInt();
			int b1 = 0;

			int MHex = 0;
			int MHexBin = 0;

			int MStore = M;

			while (M > 0) {// m % 2 來判斷 m 的二進位數字中，最右邊那一位是否為 1
				if (M % 2 == 1) {
					b1++;
				}
				M /= 2;
			}

			ArrayList<Integer> sepList = new ArrayList<Integer>();
			String MStoreStr = Integer.toString(MStore);
			for(int k = 0; k <  MStoreStr.length(); k++) {
				char c = Integer.toString(MStore).charAt(k);
				sepList.add(c - '0');//turn char to int
			}
			int b2 = 0;
			int[] hextoBin1 = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
			for (int j = 0; j < sepList.size(); j++) {
				b2 += hextoBin1[sepList.get(j)];
//				System.out.print(hextoBin1[Integer.parseInt(HexList.get(j))]);
			}
			System.out.println(b1 + " " + b2);
		}
	}
}