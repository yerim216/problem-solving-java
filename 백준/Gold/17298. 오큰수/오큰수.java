import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        int[] answer = new int[n];
        //List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
        }
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        for(int i=0; i<n; i++){
            sb.append(answer[i]).append(" ");
        }


        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}