import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String weekName[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int monthDay[] = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(num > 0) {
			int m = scanner.nextInt();
			int d = scanner.nextInt();
			int dath = 0;
			for(int i = 0; i < m - 1; i++) {
				dath += monthDay[i];
			}
			dath += d;
			int mod = 0;
			mod = (dath + 5)%7;//注意作法
			switch(mod) {
				case 1:
					System.out.print(weekName[0]);
					break;
				case 2:
					System.out.print(weekName[1]);
					break;
				case 3:
					System.out.print(weekName[2]);
					break;
				case 4:
					System.out.print(weekName[3]);
					break;
				case 5:
					System.out.print(weekName[4]);
					break;
				case 6:
					System.out.print(weekName[5]);
					break;
				case 7:
					System.out.print(weekName[6]);
					break;
			}
			
			num--;
		}
	}

}
