import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int N;
		N = scanner.nextInt();

		int x = 6;
		int y = N - 1;
		int ans = 1;

		while (y - x > 0) {
			y = y - x;
			x += 6;
			ans++;
		}
		
		if(N != 1) ans++;
		
		System.out.println(ans);
	}

}
