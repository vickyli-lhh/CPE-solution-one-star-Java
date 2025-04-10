import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void addAns(int ans, ArrayList<Integer> ansList) {
		if (ans > 0 && ans % 7 != 6 && ans % 7 != 0 && !ansList.contains(ans)) {//ans > 0 // contains()檢查 ans 是否已經存在於 ansList，避免重複添加
			ansList.add(ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T > 0) {
			int dayCount = 0;

			int N = scanner.nextInt();
			int P = scanner.nextInt();
			ArrayList<Integer> hList = new ArrayList<Integer>();
			for (int i = 0; i < P; i++) {
				hList.add(scanner.nextInt());
			}
			ArrayList<Integer> ansList = new ArrayList<Integer>();
			for (int j = 0; j < P; j++) {

				int a = N % hList.get(j);
				int ans = N - a;
				addAns(ans, ansList);

				while (ans > 0) {
					ans -= hList.get(j);
					addAns(ans, ansList);
				}
			}
			System.out.println(ansList.size());
			T--;
		}
	}

}
