import java.util.Scanner;
//import java.math.BigInteger;//java.math.BigInteger

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while (true) {
			String numString = input.next();
			
			if (!(numString.equals("0"))) {//"0": String; '0': char
				int sumOdd = 0, sumEven = 0;
				
				for (int i = 0; i < numString.length(); i++) {// 直接使用字串遍歷，確保從高位數開始// numString.length() 
					if (i % 2 == 0) {
						sumEven += numString.charAt(i) - '0';// 將字符轉換為數字// string.charAt(i) returns char//string.charAt(i) - '0'converts it to an integer
					} else {
						sumOdd += numString.charAt(i) - '0';
					}
				}
				if (Math.abs(sumEven - sumOdd) % 11 == 0) {// (奇數位數字和)與(偶數位數字和)的差 為11 的倍數
					System.out.println(numString + " is a multiple of 11.");
				} else {
					System.out.println(numString + " is not a multiple of 11.");
				}

			} else {
				break;
			}
		}
	}

}

//public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
//	do {
//		String numString = input.next();//先用String從鍵盤讀入
//		BigInteger numBigInt = new BigInteger(numString);//再轉成BigInteger
//		if (!(numBigInt.equals(BigInteger.valueOf(0)))) {
//			if ((numBigInt.mod(BigInteger.valueOf(11))).equals(BigInteger.valueOf(0))) {
//				System.out.println(numBigInt + " is a multiple of 11.");
//			}else {
//				System.out.println(numBigInt + " is not a multiple of 11.");
//			}
//		}else{
//			break;
//		}
//	}
//	while(input.hasNext());//統一於do<用String從鍵盤讀入>。所以不能用這個判別: input.hasNextInt()
//}
