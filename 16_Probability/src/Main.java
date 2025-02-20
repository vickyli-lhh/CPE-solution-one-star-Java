import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int i = 0;
		while(i < Integer.parseInt(S)) {
			i++;
			list.clear();//每次回圈開始要清空list
			String line = scanner.nextLine();
			String[] words = line.split(" ");
			for (String word : words) {
	            list.add(Double.parseDouble(word));//Double.parseDouble
	        }
			Double N = list.get(0);
			Double p = list.get(1);
			Double q = 1 - p;
			Double I = list.get(2);
			System.out.println(String.format("%.4f",((Math.pow(q, (I - 1))*p) / (1 - Math.pow(q, N)))));//本題重點：導出公式
		}
	}

}
