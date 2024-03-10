import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        Stack<int[]> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek()[0] <= num) {
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0).append(" ");
            } else {
                sb.append(stack.peek()[1]).append(" ");
            }

            stack.push(new int[]{num, i+1});
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
