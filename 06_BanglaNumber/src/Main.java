import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long i = 0;
		while(input.hasNextLong()) {
			long num = input.nextLong();
			i++;
			System.out.printf("%4d.", i);//printf()
			
			if(num == 0) {
				System.out.println(" 0");
			}else {
				bangla(num);
				System.out.println();
			}
		}
		input.close();
		
	}
	public static void bangla(long innum) {
		
			if(innum >= 10000000) {//if innum超過七位數。則把前面超過七位數的部分先取出來
				bangla(innum/10000000);//用遞迴呼叫處理
				System.out.print(" kuti");//連接處要加一個kuti				
				innum %= 10000000;//接著才取出後七位數處理
			}
			if(innum >= 100000) {
				System.out.print(" " + innum/100000 + " lakh");//印出第六、七位數＋單位
				innum %= 100000;//取出後五位數處理
			}
			if(innum >= 1000) {
				System.out.print(" " + innum/1000 + " hajar");
				innum %= 1000;
			}
			if(innum >= 100) {
				System.out.print(" " + innum/100 + " shata");
				innum %= 100;
			}
			if(innum > 0) {//十位數、個位數直接輸出
				System.out.print(" " + innum);
			}
			
	}

}
