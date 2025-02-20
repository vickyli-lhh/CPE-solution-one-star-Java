import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			list.clear();
			String s = scanner.nextLine();
			String[] words = s.split(" ");
			for (String word : words) {
	            list.add(Integer.parseInt(word));
	        }
			
			boolean notAns = true;
			int S = list.get(0);
			int D = list.get(1);
			while (notAns) {
				if(S < D) {
					
					D -= S;
					S += 1;
					
				}else {
					notAns = false;
				}
			
			}
			System.out.println(S);
		}
		
	}

}
