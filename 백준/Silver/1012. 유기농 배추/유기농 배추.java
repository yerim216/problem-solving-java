import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[m][n];
            boolean[][] vis = new boolean[m][n];
            int cnt = 0;
            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());
                int temp1 = Integer.parseInt(st.nextToken());
                int temp2 = Integer.parseInt(st.nextToken());
                arr[temp1][temp2] = 1;
            }
            for(int l=0; l<m; l++){
                for(int j=0; j<n; j++){
                    if(arr[l][j]==1 && !vis[l][j]){
                        vis[l][j] = true;
                        q.add(new int[]{l, j});
                        cnt++;
                    }
                    while(!q.isEmpty()){
                        int x = q.peek()[0];
                        int y = q.peek()[1];
                        q.poll();
                        for(int dir=0; dir<4; dir++){
                            int nx = x+dx[dir];
                            int ny = y+dy[dir];
                            if(nx<0 || nx>=m || ny<0 || ny>=n) continue;
                            if(arr[nx][ny]==0 || vis[nx][ny]) continue;
                            vis[nx][ny] = true;
                            q.add(new int[]{nx, ny});
                        }

                    }


                }
            }
            System.out.println(cnt);
        
        }

    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}