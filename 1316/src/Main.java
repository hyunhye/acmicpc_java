import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		String[] S = new String[N];
		int alpha[] = new int[26];

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 26; j++)
				alpha[j] = 0;

			S[i] = scanner.next();
			int j;
			for (j = 0; j < S[i].length(); j++) {
				int ascii = S[i].charAt(j) - 97;
				if (alpha[ascii] == 0 || (j != 0 && ascii == (S[i].charAt(j - 1) - 97)))
					alpha[ascii]++;
				else
					break;
			}

			if (j == S[i].length())
				ans++;
		}

		System.out.println(ans);
	}

}
