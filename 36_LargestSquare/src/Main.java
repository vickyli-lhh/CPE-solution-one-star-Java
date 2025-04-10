import java.util.Scanner;

public class Main {

	public static int isSquare(int xa, int ya, String[][] map) {
		int r = 0;
		boolean isS = true;
		String center = map[xa][ya];
		
		if(!(0 <= xa && xa < map.length && 0 <= ya && ya < map[0].length)) {
			isS = false;
		}
		
		while(isS == true) {
			if((r+1) <= map.length) {
				r++;
			}
			int top = ya + r;
			int bottom = ya - r;
			int left = xa - r;
			int right = xa + r;
			for (int i = top; i <= bottom; i++) {//由上到下
				for (int j = left; j <= right; j++) {//由左到右
					if (!(map[i][j].equals(center))) {
						isS = false;
					}
				}
			}
			
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = Integer.parseInt(scanner.next());
		while (C != 0) {
			int x = Integer.parseInt(scanner.next());
			int y = Integer.parseInt(scanner.next());
			int D = Integer.parseInt(scanner.next());

			String[][] arr = new String[x][y];// 注意二維陣列寫法
			for (int i = 0; i < x; i++) {// 注意二維陣列輸入法
				String s = scanner.next();
				String[] arrSplit = s.split("");// 注意
				for (int j = 0; j < y; j++) {
					arr[i][j] = arrSplit[j];// 注意
				}
			}
			System.out.printf("%d %d %d\n", x, y, D);
			while (D != 0) {
				int xx = Integer.parseInt(scanner.next());
				int yy = Integer.parseInt(scanner.next());
				System.out.println(isSquare(xx, yy, arr));
				D--;
			}
			
			C--;
		}
	}

}
