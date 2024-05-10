import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;

//이 문제 -> 하나의 수가 여러 개 나올 수 있음
//하지만 중복되는 수열을 여러번 출력하면 안된다! -> set을 이용하면 된다
public class Main{
    public static int n, m;
    public static int[] arr;
    public static int[] nums;
    public static boolean[] isused;
    public static LinkedHashSet<String> ans;
    public static StringBuilder sb;

    public static void func(int k){ //k번째 행에 말을 배치할 예정
        if(k==m) {
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            ans.add(sb.toString());
            return;
        }
        for(int i=0; i<n; i++){
            if(!isused[i]){
                arr[k] = nums[i];
                isused[i] = true;
                func(k+1);
                isused[i] = false;
            }
        }


    }
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        isused = new boolean[n];
        nums = new int[n];
        ans = new LinkedHashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
        }
        Arrays.sort(nums);
        func(0);
        ans.forEach(System.out::println);



    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}