import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                sb.append(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}