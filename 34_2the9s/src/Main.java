import java.util.Scanner;

public class Main {

	public static int sumEach(String numS) {

		int sum = 0;
		for (int i = 0; i < numS.length(); i++) {
			char numC = numS.charAt(i);
			numC -= '0';
			sum += numC;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int sumFinal = 0;
			int count = 1;
			String N = scanner.nextLine();
			if (N.equals("0")) {// String: .equals()
				break;
			} else {
				sumFinal = sumEach(N);
				while (sumFinal >= 10) {
					sumFinal = sumEach(String.valueOf(sumFinal));
					count++;
				}

				if (sumFinal == 9) {// int: ==
					System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n", N, count);
				} else {
					System.out.printf("%s is not a multiple of 9.\n", N);
				}
			}
		}

	}

}
