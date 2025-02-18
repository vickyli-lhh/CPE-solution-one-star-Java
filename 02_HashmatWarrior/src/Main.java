import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numA, numB;//long
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLong()) {
			numA = input.nextLong();
			numB = input.nextLong();
//			System.out.println(Math.abs(numA - numB));//Math.abs()
		}
		input.close();
		
	}

}
