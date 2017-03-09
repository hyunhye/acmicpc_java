import java.util.Scanner;

public class Main {

	public static int[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = scanner.nextInt();

		for (int i = N-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < N; i++)
			System.out.println(arr[i]);
	}

}
