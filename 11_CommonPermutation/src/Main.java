import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (true) {
			String line1 = input.nextLine().toLowerCase();
			String line2 = input.nextLine().toLowerCase();
			if (!(line1.equals(null)) && !(line2.equals(null))) {
				ArrayList<Character> list1 = new ArrayList<Character>();
				ArrayList<Character> list2 = new ArrayList<Character>();
				for (int i = 0; i < line1.length(); i++) {
					list1.add(line1.charAt(i));
				}
				for (int i = 0; i < line2.length(); i++) {
					list2.add(line2.charAt(i));
				}
				Collections.sort(list1);
				Collections.sort(list2);
				ArrayList<Character> result = new ArrayList<Character>();
				for (int i = 0; i < list1.size(); i++) {
					for (int j = 0; j < list2.size(); j++) {
						if((list1.get(i)).equals(list2.get(j))) {
							result.add(list1.get(i));
//							System.out.print(list1.get(i));
						}	
					}
				}
				ArrayList<Character> uniqueList = new ArrayList<Character>();//去除char Arraylist裡重複出現過的char(留一個就好)
				for (int k = 0; k < result.size(); k++) {
					if (!(uniqueList.contains(result.get(k)))) {
						uniqueList.add(result.get(k));
					}
				}
				for (int l = 0; l < uniqueList.size(); l++) {
					System.out.print(uniqueList.get(l));
				}
				System.out.println();
			} else {
				break;
			}
		}

	}

}
