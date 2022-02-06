package getttingStarted;

import java.util.Scanner;

public class PythogorasTriplet {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = a;
		if (b > a) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		boolean flag;
		if (max == a) {
			flag = ((b * b + c * c) == (a * a));
			System.out.print(flag);
		} else if (max == b) {
			flag = ((a * a + c * c) == (b * b));
			System.out.print(flag);
		} else if (max == c) {
			flag = ((b * b + a * a) == (c * c));
			System.out.print(flag);
		}
	}
}
