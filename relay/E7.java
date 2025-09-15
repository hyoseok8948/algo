package relay;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			String input = sc.next();
			StringBuilder sb = new StringBuilder(input);

			while (true) {
				boolean check = false;

				for (int i = 0; i < sb.length(); i++) {
					int j = i;
					while (j + 1 < sb.length() && sb.charAt(j + 1) == sb.charAt(i)) {
						j++;
					}
					if (j > i) {
						sb.delete(i, j + 1);
						check = true;
						break;

					}
				}
				if (!check) {
					break;
				}
			}

			System.out.println("#" + tc + " " + sb.toString());

		}

	}

}
