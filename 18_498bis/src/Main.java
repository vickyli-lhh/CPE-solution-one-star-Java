import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			String xStr = scanner.nextLine();
			if (xStr != null){
				int x = Integer.parseInt(xStr);
			}
			list.clear();
			String s = scanner.nextLine();
			String[] as = s.split(" ");
			for (String a : as) {
	            list.add(Integer.parseInt(a));
	        }
			list.clear();
		}
		System.out.println(list);
		scanner.close();
		
	}

}
