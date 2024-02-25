import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        int cnt = 0;

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            int target = x-arr[i];
            int left = i+1;
            int right = n-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(arr[mid]<target){
                    left = mid + 1;
                } else if(arr[mid]>target){
                    right = mid - 1;
                } else {
                    cnt ++;
                    break;
                }
            }
        }

        System.out.println(cnt);

    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
