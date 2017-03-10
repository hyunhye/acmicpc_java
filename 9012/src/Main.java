import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T;
		T = scanner.nextInt();

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < T; i++) {
			stack.clear();
			String vps = scanner.next();
			
			for(int j = 0 ; j < vps.length() ;j++) {
				char c = vps.charAt(j);
				
				if (c == '\n')
					break;
				
				if(c == '(')
					stack.push(c); 
				else if(c == ')' && (stack.isEmpty() || stack.peek() == ')'))
					stack.push(c); 
				else if (c == ')' && stack.peek() == '(') 
					stack.pop(); 
				

			} // end of while
			
			if(!stack.isEmpty())
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}
	}

}
