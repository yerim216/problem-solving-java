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
        boolean[][] visit = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int count = 0; //그림의 갯수
        int size = 0; //그림의 크기
        int temp_size = 0;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==0 || visit[i][j]) continue;
                count++;
                visit[i][j] = true;
                queue.add(new int[]{i, j});
                temp_size = 0;
                while(!queue.isEmpty()){
                    int[] temp = queue.poll();
                    int x = temp[0];
                    int y = temp[1];
                    temp_size++;
                    for(int dir = 0; dir<4; dir++){
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                        if(!visit[nx][ny] && board[nx][ny]==1){
                            queue.add(new int[]{nx, ny});
                            visit[nx][ny] = true;
                        }
                    }
                }
                if(temp_size>size){
                    size = temp_size;
                }
            }
        }
        sb.append(count).append("\n");
        sb.append(size);
        System.out.println(sb);



    }
}