import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static char[][] ch = new char[5][5];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int ans = 0;
    static List<int[]> positions = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < 5; j++) {
                ch[i][j] = s.charAt(j);
                positions.add(new int[]{i, j});
            }
        }
        combination(new boolean[25], 0, 0, 0);
        System.out.println(ans);
    }

    public static void combination(boolean[] selected, int idx, int count, int sCount) {
        if (count == 7) {
            if (sCount >= 4 && isConnected(selected)) {
                ans++;
            }
            return;
        }
        if (idx == 25) return;

        int x = positions.get(idx)[0];
        int y = positions.get(idx)[1];

        selected[idx] = true;
        combination(selected, idx + 1, count + 1, sCount + (ch[x][y] == 'S' ? 1 : 0));
        selected[idx] = false;
        combination(selected, idx + 1, count, sCount);
    }

    public static boolean isConnected(boolean[] selected) {
        boolean[][] visited = new boolean[5][5];
        List<int[]> selectedPositions = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            if (selected[i]) {
                selectedPositions.add(positions.get(i));
            }
        }

        int[] start = selectedPositions.get(0);
        dfs(start[0], start[1], visited, selected);

        for (int[] pos : selectedPositions) {
            if (!visited[pos[0]][pos[1]]) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int x, int y, boolean[][] visited, boolean[] selected) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5 && !visited[nx][ny] && selected[nx * 5 + ny]) {
                dfs(nx, ny, visited, selected);
            }
        }
    }
}
