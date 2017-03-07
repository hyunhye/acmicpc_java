import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S;
		int a[] = new int[26];

		Scanner scanner = new Scanner(System.in);

		S = scanner.nextLine();
		S = S.toUpperCase();

		for(int i = 0 ; i < a.length ; i++)
			a[i] = 0;
		
		for (int i = 0; i < S.length(); i++) {
			int ascii = S.charAt(i) - 65;
			
			a[ascii]++;
		}

		int index = 0 ;
		int max = 0;
		for(int i = 0 ; i < a.length ; i++){
			if(a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		
		char ans = (char) (index + 65);
		for(int i = 0 ; i < a.length ; i++){
			if(index == i) continue;
			if(a[index] == a[i])
				ans = '?';
		}
		System.out.println(ans);
		
	}

}
