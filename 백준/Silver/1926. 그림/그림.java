
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    public static class Pair {
        int x, y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }

        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
    }
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Pair> queue = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        boolean[][] visit = new boolean[n][m];
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int size = 0;
        int temp_size = 0;
        int cnt = 0;
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0 || visit[i][j]) continue;
                cnt++;
                visit[i][j] = true;
                queue.add(new Pair(i, j));
                temp_size=0;
                while (!queue.isEmpty()) {
                    int x = queue.peek().getX();
                    int y = queue.peek().getY();
                    queue.poll();
                    temp_size++;
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                            continue;
                        if (!visit[nx][ny] && arr[nx][ny] == 1) {
                            queue.add(new Pair(nx, ny));
                            visit[nx][ny] = true;
                        }

                    }


                }
                if(temp_size>size){
                    size = temp_size;
                }


            }
        }
        sb.append(cnt).append("\n");
        sb.append(size);
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}