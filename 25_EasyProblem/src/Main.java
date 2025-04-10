import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			
			String R_N = scanner.next();
			int Nmin = 0;
			int chVal = 0;
			int sum = 0;
			int chMax = 1;// 最小可能進制 = 最大字符的值 + 1
			int N;

			for (int i = 0; i < R_N.length(); i++) {// 計算所有數字對應值的加總(B 若sum % (N - 1) == 0，則 R % (N - 1) == 0)
				char ch = R_N.charAt(i);
				if ('0' <= ch && ch <= '9') {
					chVal = ch - '0';// ch - 48
				} else if ('A' <= ch && ch <= 'Z') {
					chVal = ch - 'A' + 10;// ch - 65 + 10
				} else if ('a' <= ch && ch <= 'z') {
					chVal = ch - 'a' + 36;// ch - 97 + 36
				}
				sum += chVal;

				if (chMax < chVal) {
					chMax = chVal;
				}
			}
	        
            for (N = chMax + 1; N <= 62; N++) {
                if (sum % (N - 1) == 0) {
                    break;
                }
            }
            
            if (N <= 62) {
                System.out.println(N);
            } else {
                System.out.println("such number is impossible!");
            }
        }
        
        scanner.close();
    }
}    
