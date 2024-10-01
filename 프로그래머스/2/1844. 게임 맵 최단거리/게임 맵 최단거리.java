import java.util.*;

class Solution {
    static int[][] distance;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        
        distance = new int[rows][cols];
        visited = new boolean[rows][cols];
        
        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        distance[0][0] = 1;

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= rows || ny >= cols) continue;
                if(visited[nx][ny] || maps[nx][ny] == 0) continue;
             
                visited[nx][ny] = true;  // 방문 여부 체크
                distance[nx][ny] = distance[x][y] + 1;
                queue.add(new int[]{nx, ny});
            }
        }
        
        int answer = distance[rows - 1][cols - 1];
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
}


// import java.util.*;
// import java.io.*;

// class Solution {
//     static int[][] distance = new int[21][21];
//     static Queue<int[]> queue = new LinkedList<>();
//     static int[] dx = {1, 0, -1, 0};
//     static int[] dy = {0, 1, 0, -1};
//     static boolean[][] visited = new boolean[21][21];
    
//     public int solution(int[][] maps) {
//         queue.add(new int[]{0, 0});
//         visited[0][0] = true;
//         int xx = maps[0].length-1;
//         int yy = maps.length-1;
//         distance[0][0] = 1;
//         int answer = 0;
//         while(!queue.isEmpty()){
//             int[] temp = queue.poll();
//             int x = temp[0];
//             int y = temp[1];
            
//             for(int i=0; i<4; i++){
//                 int nx = x+dx[i];
//                 int ny = y+dy[i];
                
//                 if(nx<0 || ny<0 || nx>xx || ny>yy) continue;
//                 if(visited[ny][nx] || maps[ny][nx]==0) continue;
            
//                 visited[ny][nx] = true;
//                 distance[ny][nx] = distance[y][x]+1;
//                 queue.add(new int[]{nx, ny});
//             }
//         }
//         answer = distance[yy][xx];
//         if(answer == 0){
//             answer = -1;
//         }
//         return answer;
      
       
//     }
// }