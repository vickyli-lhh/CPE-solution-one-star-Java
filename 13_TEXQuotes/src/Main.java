import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			ArrayList<Character> list = new ArrayList<Character>();
			String s = scanner.nextLine();
			for (int i = 0; i < s.length(); i++) {
				list.add(s.charAt(i));
			}
			boolean open = true;//注意技巧
			StringBuilder output = new StringBuilder();//StringBuilder//為了要用.append()
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == '"') {//注意寫法<char>
					if (open) {
						output.append("``");
					}else {
						output.append("''");
					}
				 open =  !open;//交替關閉引號
				}else {
					output.append(list.get(i));
				}
			}
			System.out.println(output);
		}
		scanner.close();
	}

}
