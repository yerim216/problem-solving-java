import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] com;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        com = arr.clone();
        Arrays.sort(com);

        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int i=0; i<n; i++){
           if(!map.containsKey(com[i])){
               map.put(com[i], idx++);
           }
        }
        for(int i=0; i<n; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
