
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
        int[][] dist = new int[n][m];
        int[][] arr = new int[n][m];


        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<m; j++){
                if(s.charAt(j)=='1'){
                    arr[i][j]=1;
                } else {
                    arr[i][j]=0;
                }
                dist[i][j]=-1;
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0 || dist[i][j]!=-1) continue;
                queue.add(new Pair(i, j));
                dist[i][j]=1;
                while (!queue.isEmpty()) {
                    int x = queue.peek().getX();
                    int y = queue.peek().getY();
                    queue.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                            continue;
                        if (dist[nx][ny]==-1 && arr[nx][ny] == 1) {
                            queue.add(new Pair(nx, ny));
                            dist[nx][ny] = dist[x][y]+1;
                        }

                    }


                }



            }
        }
        System.out.println(dist[n-1][m-1]);
    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}