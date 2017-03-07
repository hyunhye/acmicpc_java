import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S;
		
		Scanner scanner = new Scanner(System.in);
		
		S = scanner.nextLine();
		
		String[] split = S.split(" ");
		
		int ans = split.length;
		
		if(ans == 0) ans = 0;
		else if(split[0].equals("")) ans--;
		
		System.out.println(ans);
	}

}
