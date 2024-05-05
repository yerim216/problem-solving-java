import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
    public static int n, m;
    public static int[] arr;
    public static StringBuilder sb;

    public static void func(int k){ //k번째 행에 말을 배치할 예정
        if(k==m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
           for(int i=1; i<=n; i++){
                   arr[k] = i;
                   func(k+1);
           }


    }
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        func(0);
        System.out.println(sb);



    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}