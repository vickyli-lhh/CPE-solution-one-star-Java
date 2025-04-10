import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			StringBuilder result = new StringBuilder();
			
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			result.append(n);
			
			if (n > 1 && m > 1 && n > m) {
				while (n > 1) {
					if (n % m == 0) {
						
						n /= m;
						result.append(" ");
						result.append(n);
					} else {
						System.out.println("Boring!");
					}
				}
			System.out.println(result);
			} else {
				System.out.println("Boring!");
			
			}

		}

		scanner.close();
	}

}
