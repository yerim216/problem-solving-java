
import java.util.*;
import java.io.*;

public class Main {

	//1초 -> 1억번의 연산 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Queue<int[]> q = new LinkedList<>();
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int[][] board = new int[n][m];
		int[][] dis = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				board[i][j] = s.charAt(j)-'0';
				dis[i][j] = -1;
			}
		}
		
		dis[0][0] = 1;
		q.add(new int[]{0, 0}); //y좌표,x좌
		
		int answer = 0;
		boolean status = false;
		while(!q.isEmpty()) {
			int[] temp = q.poll();
			int y = temp[0];
			int x = temp[1];
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx<0 || nx>=m || ny<0 || ny>=n) continue;
				if(dis[ny][nx]!=-1  || board[ny][nx]==0) continue;
				if(nx==m-1 && ny==n-1) {
					answer = dis[y][x] + 1;
					status = true;
					continue;
				}
				dis[ny][nx] = dis[y][x] + 1;
				q.add(new int[] {ny, nx});
				
			}
			if(status) {
				break;
			}
		}
		if(status) {
			System.out.println(answer);
		} else {
			System.out.println(dis[n-1][m-1]);
		}
		
		
		
		
		

	}

}
