import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while (true) {
			int a = input.nextInt();
			int b = input.nextInt();
			int carry = 0;//記得歸０
			int count = 0;//記得歸０
			if (a == 0 && b == 0) {
				break;
			} else {
				while (a >= 1 || b >= 1 || carry == 1) {// 原錯為(a >= 1 && b >= 1)
					if ((a % 10 + b % 10 + carry) > 9) {
						carry = 1;
						count++;
					} else {
						carry = 0;
					}
					a /= 10;
					b /= 10;
				}
				if (count == 0) {
					System.out.println("No carry operation.");
				} else if (count == 1) {
					System.out.println("1 carry operation.");
				} else {
					System.out.println(count + " carry operations.");
				}

			}

		}

	}

}
