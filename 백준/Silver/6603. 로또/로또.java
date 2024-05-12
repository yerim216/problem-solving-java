import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

//이 문제 -> 하나의 수가 여러 개 나올 수 있음
//하지만 중복되는 수열을 여러번 출력하면 안된다! -> set을 이용하면 된다
public class Main{
    public static int n;
    public static int[] arr;
    public static int[] nums;
    public static boolean[] isused;
    public static int m = 6;
    public static StringBuilder sb;

    public static void func(int k, int lastIdx){ //k번째 행에 말을 배치할 예정
        if(k==m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }
        int start = 0;
        if(k!=0) start = lastIdx;
        for(int i=start; i<n; i++){
                arr[k] = nums[i];
                func(k+1, i+1);
            }
        }


    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            nums = new int[n];
            arr = new int[6];
            if(n==0) break;
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
            func(0, 0);
            sb.append("\n");

        }
        System.out.print(sb);



    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}