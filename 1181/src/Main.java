import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int N;
		N = scanner.nextInt();

		String[] words = new String[N];
		int[] wordLength = new int[N];
		for (int i = 0; i < N; i++) {
			words[i] = scanner.next();
			wordLength[i] = words[i].length();
		}

		for (int i = 0; i < N-1 ; i++) {
			String x = words[i];
			int y = wordLength[i];
			int z = i;
			for (int j = i+1; j < N; j++) {
				if (y > wordLength[j]){
					x = words[j];
					y = wordLength[j];
					z = j;
				}
				else if (y == wordLength[j] && x.compareTo(words[j]) > 0) {
					x =  words[j];
					y = wordLength[j];
					z = j;
				}
			}	
			
			String tmp = words[i];
			words[i] = words[z];
			words[z] = tmp;
			
			int tmp2 = wordLength[i];
			wordLength[i] = wordLength[z];
			wordLength[z] = tmp2;
		}

		for (int i = 0; i < N; i++) {
			if (i != 0 && words[i].compareTo(words[i - 1]) == 0)
				continue;

			System.out.println(words[i]);
		}

	}

}
