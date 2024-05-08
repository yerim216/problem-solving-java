import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Main{
    public static int n, m;
    public static int[] arr;
    public static List<Integer> list = new ArrayList<>();
    //public static boolean[] isused;
    public static StringBuilder sb;

    public static void func(int k, int lastIdx){ //k번째 행에 말을 배치할 예정
        if(k==m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=lastIdx; i<list.size(); i++){
            int num = list.get(i);
            arr[k] = num;
            func(k+1, i);
        }


    }
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        func(0, 0);
        System.out.println(sb);



    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}