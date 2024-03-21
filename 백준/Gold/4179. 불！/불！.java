import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
    public static class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        int getX(){
            return x;
        }
        int getY(){
            return y;
        }
    }
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Pair> q1 = new LinkedList<>(); //불의 전파시간 계산
        Queue<Pair> q2 = new LinkedList<>(); //지훈이의 이동시간 계산
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        char[][] miro = new char[r][c];
        int[][] fire = new int[r][c]; //불의 전파 시간
        int[][] ji = new int[r][c]; //지훈이의 이동시간
        for(int i=0; i<r; i++){
            String s = br.readLine();
            for(int j=0; j<c; j++){
                miro[i][j]=s.charAt(j);
                fire[i][j]=-1;
                ji[i][j]=-1;
                if(s.charAt(j)=='F'){
                   q1.add(new Pair(i, j));
                   fire[i][j] = 0;
                } else if(s.charAt(j)=='J'){
                   q2.add(new Pair(i, j));
                   ji[i][j] = 0;
                }
            }
        }
        while(!q1.isEmpty()){ //불에 대한 BFS
            Pair p = q1.poll();
            int x = p.getX();
            int y = p.getY();
            for(int dir=0; dir<4; dir++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(nx<0 || nx>=r || ny<0 || ny>=c) continue;
                if(fire[nx][ny]>=0 || miro[nx][ny]=='#') continue;
                fire[nx][ny] = fire[x][y]+1;
                q1.add(new Pair(nx, ny));
            }
        }
        //지훈이에 대한 BFS
        while(!q2.isEmpty()){
            Pair p = q2.poll();
            int x = p.getX();
            int y = p.getY();
            for(int dir=0; dir<4; dir++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(nx<0 || nx>=r || ny<0 || ny>=c) { //범위를 벗어났다는 것은
                    //탈출에 성공했다는 의미. 큐에 거리 순으로 들어가므로 최소에 탈출한 시간을 출력하면 됨.
                    System.out.println(ji[x][y]+1);
                    return;
                }
                if(ji[nx][ny]>=0 || miro[nx][ny]=='#') continue;
                if(fire[nx][ny]!=-1 && fire[nx][ny]<=ji[x][y]+1) continue;
                //불의 전파 시간을 조건에 추가
                ji[nx][ny] = ji[x][y]+1;
                q2.add(new Pair(nx, ny));
            }
        }

        System.out.println("IMPOSSIBLE");


    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}