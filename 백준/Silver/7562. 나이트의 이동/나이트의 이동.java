import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int[] dx = {-1, -2, 1, 2, -2, -1, 2, 1};
        int[] dy = {2, 1, 2, 1, -1, -2, -1, -2};

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int[][] arr = new int[l][l];
            boolean[][] vis = new boolean[l][l];
            for(int k=0; k<l; k++){
                for(int d=0; d<l; d++){
                    vis[k][d] = true;
                }
            }
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int d1 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
//            for(int k=0; k<l; k++){
//                for(int d=0; d<l; d++){
//                    arr[k][d]=-1;
//                }
//            }

            q.add(new int[]{t1, t2});
            vis[t1][t2] = false;

            while(!q.isEmpty()){
                int x = q.peek()[0];
                int y = q.peek()[1];
                q.poll();
                for(int dir=0; dir<8; dir++){
                    int nx = x+dx[dir];
                    int ny = y+dy[dir];
                    if(nx<0 || nx>=l || ny<0 || ny>=l) continue;
                    if(!vis[nx][ny]) continue;
                    arr[nx][ny] = arr[x][y]+1;
                    vis[nx][ny] = false;
                    q.add(new int[]{nx, ny});
                }
            }

            System.out.println(arr[d1][d2]);



        }







    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}