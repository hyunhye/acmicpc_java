import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C;
		
		Scanner scanner = new Scanner(System.in);
		
		C = scanner.nextInt();
		
		while(C-- > 0){
			int R;
			String S, T;
			
			T = "";
			R = scanner.nextInt();
			S = scanner.nextLine();
			
			for(int j = 1 ; j < S.length() ; j++)
				for(int i = 0 ; i < R ; i++)
					T += S.charAt(j);
			
			System.out.println(T);
		}
	}

}
