import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static int toDec(String s) {
//		ArrayList<String> splitS = new ArrayList<String>();
//		for (int i = 0; i < s.length(); i++) {
//			splitS.add(String.valueOf((s.charAt(i))));
//		}
//		int decS = 0;
//		for (int i = 0; i < splitS.size(); i++) {
//			decS += Integer.parseInt(splitS.get(i)) * Math.pow(2, splitS.size() - 1 - i);// -i
//		}
//		
//		return decS;
		int decS = Integer.parseInt(s, 2);
		return decS;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		int p = 1;
		while (T > 0) {
			
			String S1 = scanner.nextLine();
			String S2 = scanner.nextLine();
			int x = 0;
			int y = 0;
			int z = 0;
			if (toDec(S1) > toDec(S2)) {
				x = toDec(S1);
				y = toDec(S2);
			}else {
				y = toDec(S1);
				x = toDec(S2);
			}
			while(y >0) {//輾轉相除法
				z = x % y;
				x = y;
				y = z;
				
			}
			if(x > 1) {
				System.out.printf("Pair #%d: All you need is love!\n", p);
			}else {
				System.out.printf("Pair #%d: Love is not all you need!\n", p);
			}
			p++;
			T--;
		}
	}

}
