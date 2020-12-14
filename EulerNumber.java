import java.text.DecimalFormat;
import java.util.Scanner;

public class EulerNumber {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Number of iteration");
		String n = myObj.nextLine();

		DecimalFormat df2 = new DecimalFormat("#.##################");
		System.out.println("e = " + df2.format(Euler(Integer.parseInt(n))));
	}

	private static double Euler(int n) {
		double e = 1;
		double f = 1;

		for (int i = 1; i <= n; i++) {
			f = f * (1.0 / i);
			e += f;
		}

		return e;
	}
}