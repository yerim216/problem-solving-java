import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
    public static int n, S;
    public static int[] arr;
    public static int count = 0;
    //public static StringBuilder sb;

    public static void func(int k, int tot){ //k번째 행에 말을 배치할 예정
        if(k==n){
            if(tot==S) count++;
            return;
        }
        func(k+1, tot);
        func(k+1, tot+arr[k]);
    }
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr= new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        func(0, 0);
        if(S==0) count--;
        System.out.println(count);



    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}