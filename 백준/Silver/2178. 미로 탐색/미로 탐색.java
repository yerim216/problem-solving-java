import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        int[][] dist = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};


        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j)-'0';
                dist[i][j] = -1;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==0 || dist[i][j]!=-1) continue;
                queue.add(new int[]{i, j});
                dist[i][j] = 1;
                while(!queue.isEmpty()){
                    int[] temp = queue.poll();
                    int x = temp[0];
                    int y = temp[1];
                    for(int dir=0; dir<4; dir++){
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                        if(dist[nx][ny]==-1 && board[nx][ny]==1){
                            queue.add(new int[]{nx, ny});
                            dist[nx][ny] = dist[x][y]+1;
                        }
                    }
                }
            }
        }

        System.out.println(dist[n-1][m-1]);




    }
}