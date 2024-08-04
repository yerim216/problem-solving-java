import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static int[] arr;
    public static boolean[] isused = new boolean[10];
    public static StringBuilder sb;

    public static void func(int k){
        if(k==m){
            for(int i=0; i<m; i++){
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        for(int i=1; i<=n; i++){
            if(!isused[i]){
                arr[k] = i;
                isused[i] = true;
                func(k+1);
                isused[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr= new int[10];

        func(0);


        System.out.println(sb);


    }
}