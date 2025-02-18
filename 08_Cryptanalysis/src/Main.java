import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] table = new int[26] ; // 建立字母頻率表//26// 所有元素預設為 0(因為 int 是基本數據類型（primitive type)）
		Scanner input = new Scanner(System.in);
		
		int num = Integer.parseInt(input.nextLine());// 統一用.nextLine()
		for (int i = 0; i < num; i++) {
			String s = input.nextLine();
			for(int j = 0; j < s.length(); j++) {//s.length()
				if (Character.isLetter(s.charAt(j))) { // 檢查是否為字母//s.charAt(j) 來取得字串中的字元
					table[Character.toUpperCase(s.charAt(j)) - 'A']++;//s.charAt(j) 來取得字串中的字元
				}
			}
		}
//		Arrays.sort(table);//@注意：不能用排序，因為字母順序會錯亂(e.g. table[0]不再是A)
		//找出max
		int max = 0;
		for (int l = 0; l < table.length ; l++) {//table.length//沒有括號
		    if (table[l] > max) {
		        max = table[l];
		    }
		}
		//由次數高到低輸出
		for(int count = max; count > 0; count--) {
			for (int l = 0; l < table.length ; l++) {
				if(count == table[l]) {
					System.out.println((char)(l + 'A') + " " + count);
				}
			}
		}
		

		
	}
}
