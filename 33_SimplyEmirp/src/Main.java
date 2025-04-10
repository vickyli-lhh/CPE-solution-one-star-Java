import java.util.Scanner;

public class Main {

	public static int reverse(int num) {// 反轉數字method
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;// num % 10: get the last digit
			num /= 10;
		}
		return rev;
	}

	public static boolean isPrime(int num) {
		if (num > 2 && num % 2 == 0) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int i = 3; i <= Math.sqrt(num); i += 2) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;// 注意
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int N = scanner.nextInt();
			boolean prime = true;
			boolean emirp = true;

			if (!isPrime(N)) {
				System.out.printf("%d is not prime.\n", N);

			} else {

				if (isPrime(reverse(N)) && reverse(N) != N) {// 題：&& reverseNum != N
					System.out.printf("%d is emirp.\n", N);
				} else {
					System.out.printf("%d is prime.\n", N);
				}
			}

		}
	}

}
