package worldpay.training.task4;

import java.util.StringTokenizer;

public class TokenGenerator {

	public static void main(String[] args) {
		String s = "1.java,2.oracle,3.python,4.php,5.linux.....";
		StringTokenizer stringTokenizer = new StringTokenizer(s, ",.");
		while (stringTokenizer.hasMoreTokens()) {
			stringTokenizer.nextToken();
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
