import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main  {
    static int white = 0;
    static int blue = 0;
    static int[][] arr;
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(n, 0, 0);
        System.out.println(white);
        System.out.println(blue);

    }
    public static boolean colorCheck(int size, int r, int c){
        int color = arr[r][c];
        for(int i=r; i<r+size; i++){
            for(int j=c; j<c+size; j++){
                if(arr[i][j]!=color)
                    return false;
            }
        }
        return true;

    }
    public static void partition(int size, int r, int c){
        if(colorCheck(size, r, c)){
            if(arr[r][c]==0)
                white++;
            else
                blue++;
            return;
        }
        int newSize = size/2;

        partition(newSize, r, c);
        partition(newSize, r, c+newSize);
        partition(newSize, r+newSize, c);
        partition(newSize, r+newSize, c+newSize);


    }




    public static void main(String[] args) throws Exception{
        solution();
    }
}