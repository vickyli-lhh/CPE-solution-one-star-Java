import java.util.Scanner;

public class Main {

	public static int gcd(int x, int y) {
		int z = 0;
		while (y != 0) {
			z = x;
			x = y;
			y = z % y;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int N = scanner.nextInt();
			if (N == 0) {
				break;
			}
			int G = 0;
			for (int i = 1; i < N; i++) {
				for (int j = i + 1; j <= N; j++) {
					G += gcd(i, j);
				}
			}
			System.out.println(G);
		}
	}

}
