import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			String input = sc.next();

			Stack<Character> stack = new Stack<>();
			boolean check =true;
			
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);

				if (ch == '(') {
					stack.push(ch);
				} else {
					if(stack.isEmpty()) {
						check = false;
						break;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) {
				check = false;
			}
			
				if(stack.isEmpty()) {
					System.out.println("Yes");
			
			} else {
				System.out.println("NO");
			}
			
			
		
		
		}//tc

	}

}
