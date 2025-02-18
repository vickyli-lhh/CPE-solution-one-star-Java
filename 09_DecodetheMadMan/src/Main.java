import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char keyboard[] = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./".toCharArray(); //將 String 轉換為 char 陣列
		ArrayList<Character> list = new ArrayList<Character>();
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String mis = input.nextLine().toLowerCase();
			for(int i = 0; i < mis.length(); i++) {
				list.add(mis.charAt(i));
			}
			for(int j = 0; j < list.size(); j++) {
				if (!(list.get(j).toString().equals(" "))) {
					int ans = 0;
					for(int k = 0; k < keyboard.length; k++) {
						if(list.get(j) == keyboard[k]) {
							ans = k - 2;
							
						}
					}
					System.out.print(keyboard[ans]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
