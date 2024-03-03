import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());

        int[] cnt = new int[10];
        String result =  Integer.toString(a * b * c);
        for(int i=0; i<result.length(); i++){
            cnt[result.charAt(i)-'0']++;
        }
        for(int i=0; i<10; i++){
            sb.append(cnt[i]).append("\n");
        }

        System.out.println(sb);

    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
