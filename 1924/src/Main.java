import java.util.Scanner;

public class Main {

	public static String[] Date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	public static int[] DateToMonth;
	public static int[] DateOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateToMonth = new int[13];
		DateToMonth[0] = 0;
		for(int i = 1 ; i < 13 ; i++)
			DateToMonth[i] = DateToMonth[i-1] + DateOfMonth[i-1];
		
		int x,y;
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		int nx;
		nx = DateToMonth[x-1] + y;
		
		nx = nx % 7;
		
		System.out.println(Date[nx]);
		
	}

}
