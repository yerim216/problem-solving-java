import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];  // 각 컴퓨터의 방문 여부를 저장하는 배열
        int answer = 0;

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {  // 방문하지 않은 컴퓨터가 있다면 새로운 네트워크 발견
                bfs(i, computers, visited, n);
                answer++;  // 새로운 네트워크를 찾았으므로 개수 증가
            }
        }
        return answer;
    }

    private void bfs(int start, int[][] computers, boolean[] visited, int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            for(int j = 0; j < n; j++) {
                if(computers[node][j] == 1 && !visited[j]) {
                    visited[j] = true;  // j번 컴퓨터 방문 처리
                    q.add(j);
                }
            }
        }
    }
}

// import java.util.*;
// import java.io.*;

// class Solution {
//     static int[] dx = {-1, 0, 0, 1};
//     static int[] dy = {0, 1, -1, 0};
//     static Queue<int[]> q = new LinkedList<>();
//     static boolean[][] visited = new boolean[201][201];
//     public void dfs(int x, int y){
        
//     }

//     public int solution(int n, int[][] computer) {
//         int answer = 0;
   
//         for(int i=0; i<computer.length; i++){
//             for(int j=0; j<computer[0].length; j++){
//                 if(computer[i][j]==1 && !visited[i][j]){
//                     q.add(new int[]{i, j});
//                     visited[i][j] = true;
//                     answer++;
//                     while(!q.isEmpty()){
//                         int[] temp = q.poll();
//                         int x = temp[0];
//                         int y = temp[1];
//                         for(int k=0; k<4; k++){
//                             int nx = x + dx[k];
//                             int ny = y + dy[k];
//                             if(nx<0 || ny<0 || nx>=n || ny>= n) continue;
//                             if(computer[nx][ny]==0 || visited[nx][ny]) continue;
//                             q.add(new int[]{nx, ny});
//                             visited[nx][ny] = true;
//                         }

//                     }
//                 }
                
//             }
//         }
      
        
//         return answer;
//     }
// }