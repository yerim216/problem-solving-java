import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        //m : 가로칸, n : 세로칸, h : 높이
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[][][] arr = new int[h][n][m];
        int[][][] dist = new int[h][n][m];
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {0, 0, -1, 1, 0, 0};
        int[] dy = {0, 0, 0, 0, 1, -1};
        int[] dz = {1, -1, 0, 0, 0, 0};
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<m; k++){
                    dist[i][j][k]=0;
                    int num = Integer.parseInt(st.nextToken());
                    arr[i][j][k] = num;
                    if(num==1){ //1인 경우 큐에 넣기
                        q.add(new int[]{i, j, k});
                    } else if(num==0){ //0인 경우 dist = -1로 세팅
                        dist[i][j][k] = -1;
                    }
                }
            }
        }
        if(q.isEmpty()) { //모든 토마토가 익어 있는 상태
            boolean status = true;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        if (arr[i][j][k] != -1) {
                            if (arr[i][j][k] == 1) {
                                System.out.println(0);
                                return;
                            } else if (arr[i][j][k] == 0) {
                                System.out.println(-1);
                                return;
                            }
                        }
                    }
                }
            }
        }
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int z = temp[0];
            int x = temp[1];
            int y = temp[2];
            for(int dir=0; dir<6; dir++){
                int nx = x+dx[dir];
                int ny = y+dy[dir];
                int nz = z+dz[dir];
                if(nx<0 || ny<0 || nz<0 || nx>=n || ny>=m || nz>=h) continue;
                if(dist[nz][nx][ny]>=0) continue;
                dist[nz][nx][ny] = dist[z][x][y]+1;
                q.add(new int[]{nz, nx, ny});

            }
        }

        int result = 0;
        for(int i=0; i<h; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<m; k++){
                    if (dist[i][j][k] == -1) {
                        System.out.println(-1);
                        return;
                    }
                    result = Math.max(result, dist[i][j][k]);
                }
            }
        }
        System.out.println(result);


    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}