import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			String[] arr = s.split(" ");
			int count = Integer.parseInt(arr[0]);
			for (int i = 1; i <= count; i++) {
				list.add(Integer.parseInt(arr[i]));
			}
//			System.out.println(list);
//			System.out.println(count);
			ArrayList<Integer> eli = new ArrayList<Integer>();
			for (int i = 1; i < count; i++) {
				eli.add(i);
			}
			ArrayList<Integer> eliCopy = new ArrayList<>(eli);//注意創建方式
			
			ArrayList<Integer> ab = new ArrayList<Integer>();
			for (int i = 1; i < count ; i++) {
				ab.add(Math.abs(list.get(i) - list.get(i-1)));
			}
			for (int i = 0; i < ab.size(); i++) {
				
				for (int j = 0; j < eli.size(); j++) {
					if(ab.get(i) == eli.get(j)) {
						eliCopy.remove(eli.get(j));//.remove()
					}
				}
			}
			if(eliCopy.isEmpty()) {//不能用null
				System.out.println("Jolly");
			}else {
				System.out.println("Not Jolly");
			}
		}
		scanner.close();
		}
	
}
