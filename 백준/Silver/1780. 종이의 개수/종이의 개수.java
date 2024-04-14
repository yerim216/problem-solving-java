import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static int[][] arr;
    public static boolean[][] status;
    public static int cnt_1=0; //-1
    public static int cnt_2=0; //0
    public static int cnt_3=0; //1
    public static StringBuilder sb = new StringBuilder();
    public static void partition(int n, int r, int c){
       if(colorCheck(n, r, c)){
           if(arr[r][c]==-1){
               cnt_1++;
           } else if(arr[r][c]==0){
               cnt_2++;
           } else{
               cnt_3++;
           }
           return;
       }
       int newSize = n/3;

       partition(newSize, r, c); //1번
       partition(newSize, r, c+newSize); //2번
       partition(newSize, r, c+2*newSize);
       partition(newSize, r+newSize, c);
       partition(newSize, r+newSize, c+newSize);
       partition(newSize, r+newSize, c+2*newSize);
       partition(newSize, r+2*newSize, c);
       partition(newSize, r+2*newSize, c+newSize);
       partition(newSize, r+2*newSize, c+2*newSize);


    }
    public static boolean colorCheck(int n, int r, int c){
        int color = arr[r][c];

        for(int i=r; i<r+n; i++){
            for(int j=c; j<c+n; j++){
                if(color!=arr[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        status = new boolean[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //재귀
        //1. base condition : n=1일 때 return 1
        //2. function : func(int n, int x, int y)
        //3. 재귀 특징

        partition(n, 0, 0);
        System.out.println(cnt_1);
        System.out.println(cnt_2);
        System.out.println(cnt_3);





    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}