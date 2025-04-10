import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// fibarr
		int[] fibArr = new int[39];// 陣列在使用前必須先分配記憶體//藉由測試知道要到39
		fibArr[0] = 1;
		fibArr[1] = 2;
		for (int i = 2; i < 39; i++) {
			fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
		}
		
		// N
		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			int sum = 0;
			int currNum = num;
			boolean canPrint = false;// start with the first 1
			System.out.print(num + " = ");
			for (int j = 38; j >= 0; j--) {
				int ans = 0;
				if (currNum >= fibArr[j]) {
					currNum -= fibArr[j];
					canPrint = true;
					ans = 1;
				}
				if (canPrint) {
					System.out.print(ans);
				}
			}
			System.out.println(" (fib)");
		}
	}

}
