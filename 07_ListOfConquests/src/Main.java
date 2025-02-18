import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		int num = Integer.parseInt(input.nextLine());// 統一用.nextLine()
		for (int i = 0; i < num; i++) {
			String s = input.nextLine();
			int spaceIndex = s.indexOf(" "); // 找到第一個空格的索引
			if (spaceIndex != -1) { // 如果有空格
				String country = s.substring(0, spaceIndex);
				list.add(country);
			}
		}

		Collections.sort(list);
		int count = 1;
		
		for (int i = 0; i < list.size(); i++) {
			if(i != (list.size() - 1)) {
				if (list.get(i).equals(list.get(i + 1))) {
					count++;
				} else {
					System.out.println(list.get(i) + " " + count);
					count = 1;
				}
			}else {
				System.out.println(list.get(i) + " " + count);
			}
			
		}
	
	}

}
