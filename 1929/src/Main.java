import java.util.Scanner;

public class Main {
	public static boolean[] check;

	public static void main(String[] args) {
		check = new boolean[1000001];
		check[0] = check[1] = true;
		for (int i = 2; i * i <= 1000000; i++) {
			if (check[i] == false) {
				for (int j = i * 2; j <= 1000000; j += i) {
					check[j] = true;
				}
			}
		}

		Scanner scanner = new Scanner(System.in);
		int M, N;
		M = scanner.nextInt();
		N = scanner.nextInt();
		for(int i = M ; i <=N ; i++){
			if(check[i] == false) 
				System.out.println(i);
		}
		
	}
}
