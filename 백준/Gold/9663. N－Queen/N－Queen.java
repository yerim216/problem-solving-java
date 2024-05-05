import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
    public static int n;
    public static int[] arr;
    public static boolean[] isused1 = new boolean[15];
    public static boolean[] isused2 = new boolean[31];
    public static boolean[] isused3 = new boolean[31];
    public static int count = 0;
    public static StringBuilder sb;

    public static void func(int k){ //k번째 행에 말을 배치할 예정
        if(k==n){
            count++;
            return;
        }
        for(int i=0; i<n; i++){
            if(isused1[i] || isused2[i+k] || isused3[k-i+n-1])
                continue;
            isused1[i] = true;
            isused2[i+k] = true;
            isused3[k-i+n-1] = true;
            func(k+1);
            isused1[i] = false;
            isused2[i+k] = false;
            isused3[k-i+n-1] = false;


        }
    }
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        func(0);
        System.out.println(count);


    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}