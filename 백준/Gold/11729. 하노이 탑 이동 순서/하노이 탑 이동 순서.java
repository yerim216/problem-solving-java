import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;


public class Main{
    public static StringBuilder sb = new StringBuilder();
    public static int count = 0;
    public static void func(int a, int b, int n){
        if(n==1){
            sb.append(a).append(" ").append(b).append("\n");
            count++;
            return;
        }
        func(a, 6-a-b, n-1);
        sb.append(a).append(" ").append(b).append("\n");
        count++;
        func(6-a-b, b, n-1);

    }

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(br.readLine());
       func(1, 3, n);
        System.out.println(count);
        System.out.println(sb);

       //k=3이라면 -> 2~1을 2번에 옮김 -> 3을 3번에 옮김 :
       // k=2 -> 1을 1번에 옮김 -> 2를 3번에 옮김
        //3 : 1 -> 3
        //2 : 1 -> 2
        //1 : 1 -> 3




    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}