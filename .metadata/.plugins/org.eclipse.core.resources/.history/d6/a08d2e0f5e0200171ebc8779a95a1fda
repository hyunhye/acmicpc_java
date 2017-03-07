import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		String S;
		S = scanner.nextLine();
		
		int ans[] = new int[26];
		for(int i = 0 ; i < ans.length ; i++)
			ans[i] = -1;
		for(int i = 0 ; i < S.length() ; i++) {
			int ascii = S.charAt(i) - 97;
			if(ans[ascii] != -1) 
				continue;
			else 
				ans[ascii] = i;
		}
		for(int i = 0 ; i < ans.length ; i++)
			System.out.print(ans[i]+" ");
	}

}
