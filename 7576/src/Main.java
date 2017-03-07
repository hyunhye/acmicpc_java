import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static int[][] a;
	public static int[][] d;
	public static final int[] dx = {0,0,1,-1};
	public static final int[] dy = {1,-1,0,0};
	public static int M,N;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		M = scanner.nextInt();
		N = scanner.nextInt();
		
		a = new int[N][M];
		d = new int[N][M];
		Queue<Pair> q = new LinkedList<Pair>();
 
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < M ; j++){
				a[i][j] = scanner.nextInt();
				d[i][j] = -1;
				if(a[i][j] == 1){
					q.add(new Pair(i,j));
					d[i][j] = 0;
				}
			}
		}
		
		while(!q.isEmpty()){
			int x = q.peek().x;
			int y = q.peek().y;
			q.remove();
			
			for(int i = 0 ; i < 4 ; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < M){
					if(a[nx][ny] == 0 && d[nx][ny] == -1){
						d[nx][ny] = d[x][y] + 1;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
		
		int ans = 0;
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < M ; j++){
				if(d[i][j] > ans)
					ans = d[i][j];
			}
		}
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < M ; j++){
				if(a[i][j] == 0 && d[i][j] == -1)
					ans = -1;
			}	
		}
		
		System.out.println(ans);
		
	}
	
	static class Pair{
		int x;
		int y;
		
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
