import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] rec = new int[m][n];
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                vis[i][j] = false;
            }
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int y=y1; y<y2; y++){
                for(int x=x1; x<x2; x++){
                    rec[y][x]=1;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rec[i][j]==0 && !vis[i][j]) {
                    q.add(new int[]{i, j});
                    vis[i][j] = true;
                    cnt++;
                    int size = 1;
                    while (!q.isEmpty()) {
                        int x = q.peek()[0];
                        int y = q.peek()[1];
                        q.poll();
                        for (int dir = 0; dir < 4; dir++) {
                            int nx = x + dx[dir];
                            int ny = y + dy[dir];
                            if (nx < 0 || nx >= m || ny < 0 || ny >= n)
                                continue;
                            if (rec[nx][ny] != 0 || vis[nx][ny])
                                continue;
                            vis[nx][ny] = true;
                            q.add(new int[]{nx, ny});
                            size++;
                        }
                    }

                    list.add(size);
                }

            }
        }

        sb.append(cnt).append("\n");
        list.sort(Comparator.naturalOrder());
        for(int i : list){
            sb.append(i).append(" ");
        }

        System.out.println(sb);












    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}