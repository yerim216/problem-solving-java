import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> answer = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                vis[i][j] = false;
            }
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='0'){
                    arr[i][j] = s.charAt(j)-'0';
                } else if(s.charAt(j)=='1'){
                    arr[i][j] = s.charAt(j)-'0';
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !vis[i][j]) {
                    q.add(new int[]{i, j});
                    vis[i][j] = true;
                    cnt++;
                    int size = 1;
                    while (!q.isEmpty()) {
                        int[] p = q.poll();
                        int x = p[0];
                        int y = p[1];
                        for (int dir = 0; dir < 4; dir++) {
                            int nx = x + dx[dir];
                            int ny = y + dy[dir];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= n)
                                continue;
                            if (arr[nx][ny] != 1 || vis[nx][ny])
                                continue;
                            vis[nx][ny] = true;
                            q.add(new int[]{nx, ny});
                            size++;
                        }
                    }

                    answer.add(size);


                }

            }
        }
        sb.append(cnt).append("\n");
        answer.sort(Comparator.naturalOrder());
        for(int i : answer){
            sb.append(i).append("\n");
        }
        System.out.println(sb);




    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}