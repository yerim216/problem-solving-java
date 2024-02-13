import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {


    public static void solution() throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            int Q = Integer.parseInt(st.nextToken());

            int xor[] = new int[N+1];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                xor[i+1] = xor[i] ^ Integer.parseInt(st.nextToken());
            }
            int result = 0;
            for(int i=0; i<Q; i++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                result = result ^ (xor[e]^xor[s-1]);
            }

        System.out.println(result);



        }





    public static void main(String[] args) throws Exception {
        solution();
    }
}