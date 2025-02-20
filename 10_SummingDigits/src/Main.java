import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while (true) {
			String n = input.nextLine();
			if(n.equals("0")) break;//Terminate when input is "0"
			
			process(n);
			
			
		}

	}

	public static void process(String nstr) {
		
			ArrayList<Character> list = new ArrayList<Character>();
			int sum = 0;
			if (nstr.length() >= 2) {
				for (int i = 0; i < nstr.length(); i++) {
					list.add(nstr.charAt(i));
				}
				for (int j = 0; j < list.size(); j++) {
					sum += list.get(j) - '0';//把char變成int//注意這裡是怎麼寫讓他變的	
				}
				if (sum > 9) {
					process(String.valueOf(sum));
				}else {
					System.out.println(sum);
				}
			}else {
				System.out.println(nstr);
			}
	}

}
